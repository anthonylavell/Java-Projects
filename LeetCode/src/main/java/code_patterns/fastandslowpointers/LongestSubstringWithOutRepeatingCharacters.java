package code_patterns.fastandslowpointers;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithOutRepeatingCharacters {
    public static void main(String[] args) {
        String str = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(str));
    }

    public static int lengthOfLongestSubstring(String str) {
        Map<Character,Integer> window = new HashMap<>();
        int leftIndx = 0;
        int total = 0;
        for(int rightIndx = 0; rightIndx < str.length(); rightIndx++){
            char letter = str.charAt(rightIndx);
            window.put(letter,(window.getOrDefault(letter,0))+1);
            total = Math.max(total,(rightIndx-leftIndx));
            while (window.get(letter) > 1){
                window.put(str.charAt(leftIndx),window.get(str.charAt(leftIndx++))-1);
            }
        }
        return Math.max(total,str.length()-leftIndx);
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
