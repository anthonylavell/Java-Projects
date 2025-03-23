package ds.map;

import java.util.HashMap;
import java.util.Map;

public class MapHelp {
    public static char solutionMap(String str){
        if(str == null || str.isEmpty()){
            return 0;
        }
        if(str.length() < 2){
            return str.charAt(0);
        }
        Map<Character, Integer> map = new HashMap<>();
        char key = 0;
        int value = -100;
        for(char ch: str.toCharArray()){
            if(map.containsKey(ch)){
                map.put(ch, (map.get(ch))+1);
            }else {
                map.put(ch, 1);
            }
        }
        for ( Map.Entry<Character, Integer> entry : map.entrySet()) {
            if(value == -100){
                key = entry.getKey();
                 value = entry.getValue();
            }else{
                if(entry.getValue() > value){
                        key = entry.getKey();
                        value = entry.getValue();

                    }else if(entry.getValue() == value) {
                        if(Character.compare(entry.getKey(),key) < 0){
                            key = entry.getKey();
                            value = entry.getValue();
                    }
                }
            }
        }
        return key;
    }
}
