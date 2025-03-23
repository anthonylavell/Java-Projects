package arraysandstrings.array;

import java.util.*;

public class Anagrams {
   public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> hashMap = new HashMap<>();
        for(String str : strs){
            char [] ch = str.toCharArray();
            Arrays.sort(ch);
            if(!hashMap.containsKey(String.valueOf(ch))){
                hashMap.put(String.valueOf(ch), new ArrayList<>());
            }
            hashMap.get(String.valueOf(ch)).add(str);
        }
        return new ArrayList<>(hashMap.values());
    }
}
