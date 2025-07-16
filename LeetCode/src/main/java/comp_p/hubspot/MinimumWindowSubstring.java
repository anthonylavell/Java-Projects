package comp_p.hubspot;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println(minWindow(s,t));

    }

    public static String minWindow(String s, String t) {
        int[]letters = new int[128];
        for (char ch : t.toCharArray()){
            letters[ch-'A']++;
        }
        int leftIdx = 0;
        int trackChars = 0;
        String minStr = "";
        char[] chars = s.toCharArray();
        for (int rightIdx = 0; rightIdx < chars.length; rightIdx++){
            char ch = chars[rightIdx];
            if (--letters[ch-'A'] >=0){
                trackChars++;
            }
            while (trackChars == t.length()){
                if (minStr.isEmpty() || (minStr.length() > (rightIdx-leftIdx)+1)){
                    minStr = s.substring(leftIdx,(rightIdx+1));
                }
                char tempCh = chars[leftIdx++];
                if (++letters[tempCh-'A'] > 0){
                    trackChars--;
                }
            }
        }
        return minStr;
    }

    public static String minWindow2(String s, String t) {
        Map<Character, Integer> mapOfT = new HashMap<>(t.length());
        String minStr = "";
        int limit = 0;
        for (char ch : t.toCharArray()){
            if (!mapOfT.containsKey(ch)){
                mapOfT.put(ch,0);
                limit++;
            }
            mapOfT.put(ch, mapOfT.get(ch) +1);
        }

        char[] chars = s.toCharArray();
        int trackChar = 0;
        int[]letters = new int[128];
        int leftIndx = 0;
        for (int rightIndx = 0; rightIndx < chars.length; rightIndx++){
            char ch = chars[rightIndx];
            if (mapOfT.containsKey(ch)){
                letters[ch-'A']++;
                if (letters[ch-'A'] == mapOfT.get(ch)){
                    trackChar++;
                }
                while (trackChar == limit){
                    String tempStr = s.substring(leftIndx,rightIndx+1);
                    if(minStr.isEmpty() || (minStr.length() > tempStr.length())){
                        minStr = s.substring(leftIndx,rightIndx+1);
                    }
                    char tempKey = chars[leftIndx++];
                    if (mapOfT.containsKey(tempKey)){
                        int letterCount  = --letters[tempKey-'A'];
                        if (letterCount < mapOfT.get(tempKey))
                            trackChar--;
                    }
                }
            }
        }
        int i = 0;
        return minStr;
    }
}
