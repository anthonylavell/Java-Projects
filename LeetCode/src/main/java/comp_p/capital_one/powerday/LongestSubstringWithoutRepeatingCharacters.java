package comp_p.capital_one.powerday;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String str = "tmmzuxt";
        System.out.println(lengthOfLongestSubstring(str));
    }
    public static int lengthOfLongestSubstring(String str) {
        int total = 0;
        int first = 0;
        Map<Character,Integer> letter = new HashMap<>();
        for (int index = 0; index < str.length(); index++){
            char key = str.charAt(index);
            if (letter.containsKey(key)){
                total = Math.max(total,(index-first));
                int count = letter.get(key) +1;
                while (first < count){
                    char ch = str.charAt(first++);
                    letter.remove(ch);
                }
            }
            letter.put(key,index);
        }
        return Math.max(total,(str.length()-first));
    }
}
