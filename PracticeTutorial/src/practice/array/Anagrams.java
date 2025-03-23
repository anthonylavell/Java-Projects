package practice.array;

import java.util.*;

public class Anagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>>mapOfList = new HashMap<>();
        for(String str: strs){
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String tempStr = String.valueOf(ch);
            if(!mapOfList.containsKey(tempStr)){
                mapOfList.put(tempStr, new ArrayList<>());
            }
            mapOfList.get(tempStr).add(str);

        }

        return new ArrayList<List<String>>(mapOfList.values());
    }
}
