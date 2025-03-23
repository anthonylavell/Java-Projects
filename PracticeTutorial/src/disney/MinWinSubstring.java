package disney;

import java.util.HashMap;
import java.util.Map;

public class MinWinSubstring {
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        String s2 = "ABA";
        String t2 = "AA";
        System.out.println(minWindow2(s2,t2));
        /*int[] letterCount = new int[128];
        for(char ch: t.toCharArray()){
            letterCount[ch]--;
        }*/

    }

    public static String minWindow2(String s, String t) {
        String resultStr = "";
        int[] letterCount = new int[128];
        int left = 0;
        int count = 0;
        for(char ch: t.toCharArray()){
            letterCount[ch]++;
        }
        for(int right = 0; right < s.length(); right++){
            if(--letterCount[s.charAt(right)] >= 0){
                count++;
            }
            while (count==t.length()){
                if(resultStr.isEmpty() || resultStr.length() > ((right-left)+1)){
                    resultStr = s.substring(left,(right+1));
                }
                if(++letterCount[s.charAt(left)] > 0){
                    count--;
                }
                left++;
            }
        }
        return resultStr;
    }

    public static String minWindow(String s, String t) {
        String resultStr = "";
        int i = 0;
        int j = 0;
        Map<Character,Integer> map = new HashMap<>();
        for(char ch : t.toCharArray()){
            if(!map.containsKey(ch)){
                map.put(ch,0);
            }
            map.put(ch,map.get(ch)+1);
        }
        int count = t.length();
        while (j <= s.length()){
           if(count > 0){
              if(j < s.length() && map.containsKey(s.charAt(j))){
                 if(map.get(s.charAt(j)) > 0){
                     count--;
                 }
                  map.put(s.charAt(j),map.get(s.charAt(j))-1);
               }
              j++;
           }else {
               if(map.containsKey(s.charAt(i))){
                   map.put(s.charAt(i),map.get(s.charAt(i))+1);
                       if(map.get(s.charAt(i)) > 0){
                           count++;
                       }
               }
               i++;
           }
            if(count == 0){
                if(resultStr.isEmpty() || resultStr.length()>j-i){
                    resultStr = s.substring(i,j);
                }
            }
        }
        return resultStr;
    }
}
