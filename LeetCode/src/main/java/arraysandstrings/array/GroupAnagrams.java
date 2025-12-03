package arraysandstrings.array;

import java.util.*;

public class GroupAnagrams {
   public List<List<String>> groupAnagrams(String[] strs) {
       Map<String,List<String>>mapOfStrs = new HashMap<>();
       for (String str : strs){
           char[]chars = str.toCharArray();
           Arrays.sort(chars);
           String key = new String(chars);
           mapOfStrs.computeIfAbsent(key,k->new ArrayList<>()).add(str);
       }
       return new ArrayList<>(mapOfStrs.values());
    }
}
