package leetcode.string;

public class LongestSubStr {
    public static void main(String[] args) {
        String str = "abcAbcza";
        System.out.println(lengthOfLongestSubstring(str));
        //System.out.println(str.indexOf('a'));
    }
    public static int lengthOfLongestSubstring(String s) {
        if(s.equals(" ")){
            return 1;
        }
        String tempStr = "";
        int result=0;
        for(char ch : s.toCharArray()){
            if(tempStr.indexOf(ch) > -1){
                if(result< tempStr.length()){
                    result = tempStr.length();
                }
                int index = (tempStr.indexOf(ch)+1);
                tempStr = tempStr.substring(index);
            }
            tempStr+=ch;
        }
        return (result>tempStr.length()) ? result : tempStr.length();
    }
}
