package code_patterns.fastandslowpointers;

public class MinimumWindowSubstring {
    public static void main(String[] args) {

    }

    public String minWindow(String s, String t) {
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
}
