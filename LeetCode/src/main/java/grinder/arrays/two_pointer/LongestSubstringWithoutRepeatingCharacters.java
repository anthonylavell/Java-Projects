package grinder.arrays.two_pointer;

import grinder.json.LongestSubstringWithoutRepeatingCharJson;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        JSONObject jsonObject = new JSONObject(LongestSubstringWithoutRepeatingCharJson.getLeetCode());
        JSONObject leetCode = jsonObject.getJSONObject("data");
        System.out.println(lengthOfLongestSubstring(leetCode.getString("str")));


    }

    public static int lengthOfLongestSubstring(String str) {
        int left = 0;
        int total = 0;
        Map<Character,Integer> keepTrack = new HashMap<>();
        for (int right = 0; right < str.length();right++){
            char key = str.charAt(right);
            if(keepTrack.get(key) != null && keepTrack.get(key) > -1){
                total = Math.max(total,right-left);
                while (left < (keepTrack.get(key)+1)){
                    keepTrack.put(str.charAt(left++), -1);
                }
            }
            keepTrack.put(key, right);
        }
        return Math.max(total,str.length()-left);
    }
}
