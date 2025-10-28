package code_patterns;

import javafx.util.Pair;

import java.util.*;

public class TimeMap {
    Map<String, TimeValue> map;
    public TimeMap() {
        map = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        map.putIfAbsent(key,new TimeValue());
        map.get(key).setTimeAndValue(value,timestamp);

    }

    public String get(String key, int timestamp) {
        TimeValue time =  map.get(key);
        return time != null ? time.getTimeAndValue(timestamp) : "";
    }
}

class TimeValue{
    private List<Integer>timeStamps;
    private List<String> values;
    public TimeValue(){
        this.timeStamps = new ArrayList<>();
        this.values = new ArrayList<>();
    }
    public void setTimeAndValue(String value, int timeStamp){
        timeStamps.add(timeStamp);
        values.add(value);
    }

    public String getTimeAndValue(int time){
        int leftIndx = 0;
        int rightIndx = timeStamps.size()-1;
        int index = -1;
        while (leftIndx<=rightIndx && time>=timeStamps.get(0)){
            int mid = leftIndx + (rightIndx-leftIndx)/2;
            int midVal =timeStamps.get(mid);
            if (index == -1 || midVal <= time){
                index = mid;
            }
            if (midVal < time){
                leftIndx = mid +1;
            }else {
                rightIndx = mid -1;
            }
        }
        return index == -1 ? "": values.get(index);
    }

    class TimeValue2 {
        private List<Pair<Integer, String>> pairs;

        public TimeValue2() {
            this.pairs = new ArrayList<>();
        }

        public void setTimeAndValue(String value, int timeStamp) {
            pairs.add(new Pair<>(timeStamp, value));
        }

        public String getTimeAndValue(int time) {
            int leftIndx = 0;
            int rightIndx = pairs.size() - 1;
            String str = "";
            while (leftIndx <= rightIndx && time >= pairs.get(0).getKey()) {
                int mid = leftIndx + (rightIndx - leftIndx) / 2;
                int midVal = pairs.get(mid).getKey();
                if (str.isEmpty() || midVal <= time) {
                    str = pairs.get(mid).getValue();
                }
                if (midVal < time) {
                    leftIndx = mid + 1;
                } else {
                    rightIndx = mid - 1;
                }
            }
            return str;
        }
    }
}

