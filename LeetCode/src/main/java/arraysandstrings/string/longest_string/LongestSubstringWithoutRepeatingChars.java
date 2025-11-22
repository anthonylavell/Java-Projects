package arraysandstrings.string.longest_string;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingChars {
    public static void main(String[] args) {
       // String str = "pickoutthelongestsubstring";
        //String str2 = "ppppppppppppp";
        String str3 = "abcabcbb";
        //String str4 = " ";
        //String str5 = "molly";
        int start = 0;
        int total = 0;
        //int len = str4.length();
        //int len2 = "".length();
       /* System.out.println("Len: "+ "  ".length());
        System.out.println("TorF: "+ "  ".equals(""));
        System.out.println("String one total: "+lengthOfLongestSubstring(str));
        System.out.println("String two total: "+lengthOfLongestSubstring(str2));
        System.out.println("String three total: "+lengthOfLongestSubstring(str3));*/
        System.out.println("String three total: "+lengthOfLongestSubstring(str3));
    }
    public static int lengthOfLongestSubstring(String str) {
        Map<Character,Integer> mapOfChars = new HashMap<>();
        int left = 0;
        int total = 0;
        for (int right = 0; right < str.length(); right++){
            char key = str.charAt(right);
            mapOfChars.putIfAbsent(key,0);
            mapOfChars.put(key,mapOfChars.get(key)+1);
            while (mapOfChars.get(key) > 1){
                total = Math.max(total,(right-left));
                char tmp = str.charAt(left++);
                mapOfChars.put(tmp,mapOfChars.get(tmp)-1);
            }
        }
        return Math.max(total,(str.length()-left));
    }

}
