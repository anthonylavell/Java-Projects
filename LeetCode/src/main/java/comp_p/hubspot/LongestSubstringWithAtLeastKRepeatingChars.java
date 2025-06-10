package comp_p.hubspot;

public class LongestSubstringWithAtLeastKRepeatingChars {
    public static void main(String[] args) {
        System.out.println('z'-'a');
    }

    public static int longestSubstring(String s, int k) {
        int maxlen = 0;
        int len = s.length();
        char[] chars = s.toCharArray();

        for (int row = 0; row < len; row++){
            if (maxlen>=(len - row)){
                break;
            }
            if(row>0 && chars[row] == chars[row-1]){
                continue;
            }
            int [] freq = new int[26];
            int invalidChar = 0;
            int windowLen = 0;
            for (int col = row; col < len; col++){
                if (freq[chars[col]-'a'] == 0){
                    invalidChar++;
                }
                freq[chars[col]-'a']++;
                windowLen++;
                if (freq[chars[col]-'a'] == k){
                    invalidChar = Math.max(invalidChar-1,0);
                }

                if (invalidChar ==0){
                    maxlen = Math.max(maxlen,windowLen);
                }
            }
        }
        return maxlen;
    }
}
