import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.*;
import org.json.*;



public class HubSpotConcurrentCalls {

    public static void main(String[] args) throws Exception {
        String userKey = "69bf2d64913a583b62a92f53b50d";
        String apiUrl = "https://candidate.hubteam.com/candidateTest/v3/problem/dataset?userKey=" + userKey;

        String jsonResponse = fetchData(apiUrl);
        JSONArray callRecords = new JSONObject(jsonResponse).getJSONArray("calls");

        Map<String, List<Map<String, Object>>> results = processCalls(callRecords);
        sendResults(results, userKey);
    }

    private static String fetchData(String apiUrl) throws IOException {
        HttpURLConnection connection = (HttpURLConnection) new URL(apiUrl).openConnection();
        connection.setRequestMethod("GET");

        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        StringBuilder response = new StringBuilder();
        String line;

        while ((line = reader.readLine()) != null) {
            response.append(line);
        }

        reader.close();
        return response.toString();
    }

    private static Map<String, List<Map<String, Object>>> processCalls(JSONArray callRecords) {
        Map<String, Map<String, List<int[]>>> customerCalls = new HashMap<>();

        for (int i = 0; i < callRecords.length(); i++) {
            JSONObject call = callRecords.getJSONObject(i);
            int customerId = call.getInt("customerId");
            String callId = call.getString("callId");
            long startTimestamp = call.getLong("startTimestamp");
            long endTimestamp = call.getLong("endTimestamp");

            Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            calendar.setTimeInMillis(startTimestamp);
            String date = String.format("%tF", calendar);

            customerCalls
                    .computeIfAbsent(customerId + ":" + date, k -> new HashMap<>())
                    .computeIfAbsent(callId, k -> new ArrayList<>())
                    .add(new int[]{(int) startTimestamp, (int) endTimestamp});
        }

        Map<String, List<Map<String, Object>>> results = new HashMap<>();

        for (String key : customerCalls.keySet()) {
            String[] parts = key.split(":");
            String customerId = parts[0];
            String date = parts[1];

            List<int[]> events = new ArrayList<>();

            for (List<int[]> callTimes : customerCalls.get(key).values()) {
                for (int[] times : callTimes) {
                    events.add(new int[]{times[0], 1});
                    events.add(new int[]{times[1], -1});
                }
            }

            events.sort((a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);

            int maxConcurrent = 0, currentConcurrent = 0;
            long timestamp = 0;
            List<String> callIdsAtPeak = new ArrayList<>();

            Map<String, Long> activeCalls = new HashMap<>();

            for (int[] event : events) {
                currentConcurrent += event[1];

                if (event[1] == 1) {
                    for (String callId : customerCalls.get(key).keySet()) {
                        if (customerCalls.get(key).get(callId).get(0)[0] <= event[0] && customerCalls.get(key).get(callId).get(0)[1] > event[0]) {
                            activeCalls.put(callId, (long) event[0]);
                        }
                    }
                }

                if (currentConcurrent > maxConcurrent) {
                    maxConcurrent = currentConcurrent;
                    timestamp = event[0];
                    callIdsAtPeak = new ArrayList<>(activeCalls.keySet());
                }

                if (event[1] == -1) {
                    activeCalls.values().removeIf(v -> v == event[0]);
                }
            }

            if (maxConcurrent > 0) {
                Map<String, Object> result = new HashMap<>();
                result.put("customerId", Integer.parseInt(customerId));
                result.put("date", date);
                result.put("maxConcurrentCalls", maxConcurrent);
                result.put("timestamp", timestamp);
                result.put("callIds", callIdsAtPeak);

                results.computeIfAbsent("results", k -> new ArrayList<>()).add(result);
            }
        }
        return results;
    }

    private static void sendResults(Map<String, List<Map<String, Object>>> results, String userKey) throws IOException {
        String apiUrl = "https://candidate.hubteam.com/candidateTest/v3/problem/result?userKey=" + userKey;
        URL url = new URL(apiUrl);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("POST");
        connection.setRequestProperty("Content-Type", "application/json");
        connection.setDoOutput(true);

        String jsonString = new JSONObject(results).toString();
        try (OutputStream os = connection.getOutputStream()) {
            os.write(jsonString.getBytes());
            os.flush();
        }

        int responseCode = connection.getResponseCode();
        if (responseCode == HttpURLConnection.HTTP_OK) {
            System.out.println("Successfully sent results.");
        } else {
            System.out.println("Failed to send results. HTTP response code: " + responseCode);
        }
    }
}
