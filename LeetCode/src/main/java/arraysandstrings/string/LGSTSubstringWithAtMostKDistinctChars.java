package arraysandstrings.string;

import java.util.HashMap;
import java.util.Map;

public class LGSTSubstringWithAtMostKDistinctChars {
    public static void main(String[] args) {
        String  s = "abaccc";
        int k = 2;
        lengthOfLongestSubstringKDistinct(s,k);
    }
    public static int lengthOfLongestSubstringKDistinct(String s, int k) {
        int leftIndex = 0;
        int total = 0;
        Map<Character,Integer> mapOfChars = new HashMap<>();
        for (int rightIndex = 0; rightIndex < s.length(); rightIndex++){
            char rightChar = s.charAt(rightIndex);
            if(!mapOfChars.containsKey(rightChar)){
                mapOfChars.put(rightChar,0);
            }
            mapOfChars.put(rightChar,mapOfChars.get(rightChar)+1);
            while (mapOfChars.size() > k){
                char leftChar = s.charAt(leftIndex);
                mapOfChars.put(leftChar,mapOfChars.get(leftChar)-1);
                if(mapOfChars.get(leftChar) < 1){
                    mapOfChars.remove(leftChar);
                }
                leftIndex++;
            }
            total = Math.max(total,(rightIndex-leftIndex)+1);
        }
        return total;
    }
}
