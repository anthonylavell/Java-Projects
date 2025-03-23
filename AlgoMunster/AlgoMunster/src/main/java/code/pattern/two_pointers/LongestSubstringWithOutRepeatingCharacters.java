package code.pattern.two_pointers;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithOutRepeatingCharacters {
    public static void main(String[] args) {
        String str = "aabaab!bb";
    }

    public static int lengthOfLongestSubstring(String str) {
        int leftIndex = 0;
        int total = 0;
        Map<Character,Integer> mapChar = new HashMap<>();
       for ( int rightIndex = 0;rightIndex < str.length();rightIndex++ ){
           total = Math.max(total,(rightIndex-leftIndex));
           mapChar.put(str.charAt(rightIndex),mapChar.getOrDefault(str.charAt(rightIndex),0)+1);
                while (mapChar.get(str.charAt(rightIndex)) > 1){
                    mapChar.put(str.charAt(leftIndex),mapChar.get(str.charAt(leftIndex++))-1);
            }
        }
        return Math.max(total,(str.length()-leftIndex));
    }

    public static int lengthOfLongestSubstring2(String str) {
        String tempStr = "";
        int total = 0;
        for(char ch : str.toCharArray()){
            int index = tempStr.indexOf(ch);
            if(index > -1){
                total = Math.max(total,tempStr.length());
                tempStr=tempStr.substring(index+1);
            }
            tempStr+=ch;
        }
        return Math.max(tempStr.length(),total);
    }
}
