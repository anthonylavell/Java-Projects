package kin_carta;

import java.util.*;

public class MultiMap<K,V> {
    private Map<K, List<V>> map;

    public MultiMap() {
        map = new TreeMap<>();
    }

    public void add(K key, V value){
        if(map.containsKey(key)){
            map.get(key).add(value);
        }else {
            map.put(key,new ArrayList<>(Arrays.asList(value)));
        }
    }

    @Override
    public String toString() {
        return map.toString();
    }
}
