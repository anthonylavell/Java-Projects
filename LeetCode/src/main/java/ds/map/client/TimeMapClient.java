package ds.map.client;

import ds.map.TimeMap;

public class TimeMapClient {
    public static void main(String[] args) {
        String str = "";
        TimeMap map = new TimeMap();
        map.set("foo","bar",1);
        str = map.get("foo",1);
        str = map.get("foo",3);
        map.set("foo","bar2",4);
        str = map.get("foo",4);
        str = map.get("foo",3);
        System.out.println(str);
    }
}
