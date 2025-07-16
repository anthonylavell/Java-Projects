package comp_p.hubspot;

import java.util.HashMap;
import java.util.Map;

public class MaximumNumberOfOccurrencesOfASubstring {
    public static void main(String[] args) {
        String s = "aababcaab";
        int maxLetters = 2, minSize = 3, maxSize = 4;
        System.out.println(maxFreq(s,maxLetters,minSize,maxSize));

    }

    public static int maxFreq(String s, int maxLetters, int minSize, int maxSize) {
        int[] letters = new int[26];
        int uniqueCharCount = 0;
        char[] chars = s.toCharArray();
        int leftIndx = 0;
        int totalCount = 0;
        Map<String,Integer>mapOfCount = new HashMap<>();
        for (int rightIndx = 0; rightIndx < chars.length; rightIndx++){
            char ch = chars[rightIndx];
            letters[ch-'a']++;
            if(letters[ch-'a'] == 1){
                uniqueCharCount++;
            }
            while (uniqueCharCount > maxLetters){
                char tempCh = chars[leftIndx++];
                letters[tempCh-'a']--;
                if (letters[tempCh-'a'] < 1){
                    uniqueCharCount--;
                }
            }
            int range = ((rightIndx-leftIndx) +1);
            if ( range >= minSize && range <= maxSize ){
                String key = s.substring(leftIndx,(rightIndx+1));
                mapOfCount.put(key,(mapOfCount.getOrDefault(key,0)) +1);
                totalCount = Math.max(mapOfCount.get(key),totalCount);
                char tempCh = chars[leftIndx++];
                letters[tempCh-'a']--;
                if (letters[tempCh-'a'] < 1){
                    uniqueCharCount--;
                }
            }
        }
        return totalCount;
    }
    public static int maxFreq2(String s, int maxLetters, int minSize, int maxSize) {
        int[] letters = new int[26];
        int[] uniqueCharCount = {0};
        char[] chars = s.toCharArray();
        int leftIndx = 0;
        int totalCount = 0;
        Map<String,Integer>mapOfCount = new HashMap<>();
        for (int rightIndx = 0; rightIndx < chars.length; rightIndx++){
            char ch = chars[rightIndx];
            letters[ch-'a']++;
            if(letters[ch-'a'] == 1){
                uniqueCharCount[0]++;
            }
            while (uniqueCharCount[0] > maxLetters){
                decreaseUniqueCharCount(letters,chars,uniqueCharCount,leftIndx);
                leftIndx++;
            }
            int range = ((rightIndx-leftIndx) +1);
            if ( range >= minSize && range <= maxSize ){
                String key = s.substring(leftIndx,(rightIndx+1));
                mapOfCount.put(key,(mapOfCount.getOrDefault(key,0)) +1);
                totalCount = Math.max(mapOfCount.get(key),totalCount);
                decreaseUniqueCharCount(letters,chars,uniqueCharCount,leftIndx);
                leftIndx++;
            }
        }
        return totalCount;
    }

    private static void decreaseUniqueCharCount(int[] letters, char[] chars, int[] uniqueCharCount, int indx){
        int count = decreaseLetterCount(letters,chars,indx);
        if (count < 1){
            uniqueCharCount[0]--;
        }
    }

    private static int decreaseLetterCount(int[] letters, char[] chars, int indx){
        char tempCh = chars[indx];
        letters[tempCh-'a']--;
        return letters[tempCh-'a'];
    }
}
