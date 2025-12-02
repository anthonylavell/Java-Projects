package grinder;

import java.util.ArrayList;
import java.util.HashMap;

public class Practice {

    private static HashMap<String, ArrayList<HashMap<String, Object>>> fleetData;

    public Practice() {
        fleetData = new HashMap<>();
        // Initialize fleet data
        fleetData.put("SpaceX", new ArrayList<HashMap<String, Object>>() {{
            add(new HashMap<String, Object>() {{
                put("name", "Falcon 9");
                put("height", 70);
                put("payloadToLEO", 22800);
            }});
            add(new HashMap<String, Object>() {{
                put("name", "Falcon Heavy");
                put("height", 70);
                put("payloadToLEO", 63800);
            }});
        }});
        fleetData.put("NASA", new ArrayList<HashMap<String, Object>>() {{
            add(new HashMap<String, Object>() {{
                put("name", "Space Shuttle");
                put("height", 56.1);
                put("payloadToLEO", 24400);
            }});
            add(new HashMap<String, Object>() {{
                put("name", "Saturn V");
                put("height", 110.6);
                put("payloadToLEO", 140000);
            }});
        }});
    }

    public static boolean isPalindrome(String s) {
        int count = 0;
        s = s.toLowerCase();
        char[] chars = new char[s.length()];
        for (char ch : s.toCharArray()){
            if (Character.isLetterOrDigit(ch)){
                chars[count++] = ch;
            }
        }
        for (int left = 0; left < --count; left++){
            if (chars[left]!= chars[count]){
                return false;
            }
        }
        return true;

    }

    public static void addRocket(String organization, HashMap<String, Object> rocket) {
        // TODO: Add the new rocket to the organization's fleet, creating a new organization's entry if it doesn't exist
        ArrayList<HashMap<String, Object>> list = new ArrayList<>();
        list.add(rocket);
        fleetData.computeIfAbsent(organization, k ->new ArrayList<HashMap<String, Object>>()).add(rocket);
        fleetData.put(organization,list);

    }
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
        HashMap<String, Object> newRocket =  new HashMap<>();
        // Initialize fleet data
        newRocket.put("name", "Falcon 14");
        newRocket.put("height", 80);
        newRocket.put("payloadToLEO", 24000);


        addRocket("to",newRocket);
    }
}
