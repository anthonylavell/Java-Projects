package learning.j_son;

import learning.j_son.create.CreateJson;
import org.json.JSONArray;
import org.json.JSONObject;

public class LearnJson {
    public static void main(String[] args) {
        getCallRecords();
    }

    public static void getPartners(){
        JSONObject jsonObject = new JSONObject(CreateJson.getAllPartner());
        System.out.println(jsonObject);
        JSONArray partners= jsonObject.getJSONArray("partners");
        System.out.println("Partners is: " + partners);

        for (int index = 0; index < partners.length(); index++){
            JSONArray dates = partners.getJSONObject(index).getJSONArray("availableDates");
            for (Object obj : dates){
                System.out.println(obj.toString());
            }
        }
    }

    public static void getCallRecords(){
        JSONObject jsonObject = new JSONObject(CreateJson.getAllCallRecord());
        JSONArray calls = jsonObject.getJSONArray("callRecords");
        for(int index = 0; index < 1; index++){
            JSONObject obj = calls.getJSONObject(index);
            System.out.println("Start Time: "+obj.get("startTimestamp"));
            System.out.println("End Time: "+obj.get("endTimestamp"));
            long sTime = ((long)obj.get("startTimestamp")) / 1000L;
            long eTime = ((long)obj.get("endTimestamp")) / 1000L;
            System.out.println(eTime > sTime);
            System.out.printf("CustId: %s, callId: %s, sTime: %d%n, eTime: %d%n",
                    obj.get("customerId"),obj.get("callId"),sTime, eTime);
        }
    }
}
