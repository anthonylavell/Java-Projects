package code_patterns.sliding_window;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LongestSubStringWithAtMostKDistinct {

    public static void main(String[] args) {
        String str = "bacc";
        int k = 2;
        System.out.println(lengthOfLongestSubstringKDistinct(str,k));
        List<Integer>list = new ArrayList<>();
    }
    public static int lengthOfLongestSubstringKDistinct(String s, int k) {
        Map<Character,Integer> mapOfStr = new HashMap<>();
        int total = 0;
        for (int rightIndex =0; rightIndex < s.length(); rightIndex++){
            mapOfStr.put(s.charAt(rightIndex),mapOfStr.getOrDefault(s.charAt(rightIndex),0)+1);
            if(mapOfStr.size() <= k ){
               total++;
            } else{
                int leftIndex = rightIndex-total;
                mapOfStr.put(s.charAt(leftIndex),mapOfStr.getOrDefault(s.charAt(leftIndex),1) -1);
                if(mapOfStr.get(s.charAt(leftIndex))< 1){
                    mapOfStr.remove(s.charAt(leftIndex));
                }
            }
        }
        return total;
    }
}
