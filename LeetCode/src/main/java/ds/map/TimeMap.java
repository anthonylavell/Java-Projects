package ds.map;

import java.util.*;

public class TimeMap {
    private Map<String, List<TimeBase>> keys;
    public TimeMap() {
        keys = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
       if (!keys.containsKey(key)){
           keys.put(key,new ArrayList<>());
       }
        keys.get(key).add(new TimeBase(value,timestamp));

    }

    public String get(String key, int timestamp) {
        int start = 0;
        if(keys.get(key) == null || keys.get(key).get(start).getTimestamp() > timestamp){
            return "";
        }
        int end = keys.get(key).size()-1;
        if(keys.get(key).get(end).getTimestamp() < timestamp){
            return keys.get(key).get(end).getValue();
        }
        List<TimeBase> list = keys.get(key);
        while (start <= end){
            int mid = start + (end-start)/2;
            if(list.get(mid).getTimestamp() == timestamp){
                return list.get(mid).getValue();
            }else if(list.get(mid).getTimestamp() < timestamp){
                start = mid+1;
            }else {
                end = mid-1;
            }
        }
        return list.get(start-1).getValue();
    }
}
