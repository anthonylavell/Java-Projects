package arraysandstrings.string;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String str = "babad";
        String str2 = "bacxfgebbacabc";
        //String str2 = str.charAt(0)+"";
        //System.out.println(str2.equals(str2));
        System.out.println(longestPalindrome(str2));
    }

    public static String longestPalindrome(String str) {
       if(str.length() < 2){
           return str;
       }
       int leftIndex = 0;
       int rightIndex = 0;
       for (int i = 0; i < str.length(); i++){
           int oddLen = getLen(str,i,i);
           int evenLen = getLen(str,i,i+1);
           int maxLen = (evenLen > oddLen)? evenLen : oddLen;
           if(maxLen > (rightIndex-leftIndex)){
               leftIndex =  i - (maxLen-1)/2;
               rightIndex = i + (maxLen/2);
           }
       }
       return str.substring(leftIndex,rightIndex+1);
    }

    private static int getLen(String str, int leftIndex, int rightIndex){
        if(str == null ){
            return 0;
        }
        while (leftIndex >= 0 && rightIndex < str.length() && str.charAt(leftIndex) == str.charAt(rightIndex)){
            leftIndex--;
            rightIndex++;
        }
        return rightIndex-leftIndex - 1;
    }
}
