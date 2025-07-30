package comp_p.hubspot;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String[] strings = {"babad","babab","cbbd","ac","abbcccbbbcaaccbababcbcabca","aaaabaaa"};
        for (int index = 0; index < strings.length; index++){
            //if (index == 5)
                System.out.println(longestPalindrome(strings[index]));
        }
    }

    public static String longestPalindrome(String s) {
        int start = 0;
        int end = 0;
        for (int i = 0; i < s.length(); i++){
            int len1 = expandFromMiddle(s,i,i);
            int len2 = expandFromMiddle(s,i,i+1);
            int maxLen = Math.max(len1,len2);
            if (maxLen > (end - start)){
                start = i-((maxLen-1)/2);
                end = i+(maxLen/2);
            }
        }
        return s.substring(start,end +1);
    }

    public static int expandFromMiddle(String s, int left, int right){
        if (s == null || left > right){
            return 0;
        }
        while (left >=0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;

        }
        return (right - left)  -1;
    }
}
