package comp_p.hubspot;

public class LongestSubstringWithAtLeastKRepeatingChars {
    public static void main(String[] args) {
        System.out.println('z'-'a');
    }

    public static int longestSubstring(String s, int k) {
        int maxLen = 0;
        char[] chars = s.toCharArray();
        int charLen = chars.length;
        for (int row = 0; row < charLen; row++) {
            if (maxLen >=(charLen-row)){
                break;
            }
            if (row > 0 && (chars[row] == chars[row-1])){
                continue;
            }
            int[] letters = new int[26];
            int numOfVal = 0;
            for (int subRow = row; subRow < charLen;subRow++) {
                char ch = chars[subRow];

                if (letters[ch - 'a']++ == 0) {
                    numOfVal++;
                }
                if (letters[ch - 'a'] == k) {
                    numOfVal--;
                }

                if (numOfVal == 0) {
                    int tempLen = (subRow-row) + 1;
                    maxLen = Math.max(tempLen,maxLen);
                }
            }
        }
        return maxLen;
    }
}
