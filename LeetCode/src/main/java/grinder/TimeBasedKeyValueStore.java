package grinder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TimeBasedKeyValueStore {
    class TimeStamp{
        private List<Integer>listOfInt = new ArrayList<>();
        private List<String> listOfStr = new ArrayList<>();
        public void setListOfInt(int num){
            this.listOfInt.add(num);
        }
        public void setListOfStr(String str){
            this.listOfStr.add(str);
        }
        public List<Integer>getListOfInt(){
            return listOfInt;
        }
        public List<String>getListOfStr(){
            return listOfStr;
        }

    }
    private Map<String,TimeStamp> mapOfTime;
    TimeBasedKeyValueStore(){
        this.mapOfTime = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        mapOfTime.putIfAbsent(key,new TimeStamp());
        mapOfTime.get(key).setListOfInt(timestamp);
        mapOfTime.get(key).setListOfStr(value);

    }

    public String get(String key, int timestamp) {
        return !mapOfTime.containsKey(key) ? "" : getTimeStamp(key,timestamp);
    }

    private String getTimeStamp(String key, int timestamp){
        List<Integer> times = mapOfTime.get(key).getListOfInt();
        List<String> strs = mapOfTime.get(key).getListOfStr();
        int index = -1;
        if (timestamp < times.get(0)){
            return "";
        } else if (timestamp > times.get(times.size()-1)) {
            return strs.get(strs.size()-1);
        }else {
            int left = 0;
            int right = times.size()-1;
            while (left <= right){
                int mid = left + ((right - left)/2);
                if (timestamp >= times.get(mid)){
                    index = mid;
                    if(timestamp == times.get(mid))
                        break;
                    left = mid +1;
                }else {
                    right = mid -1;
                }
            }
        }
        return (index == -1) ? "" : strs.get(index);
    }

}
