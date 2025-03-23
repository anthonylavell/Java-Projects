package arraysandstrings.string;
/*
Manacher's algorithm
 */
public class Palindrome {

    public static void main(String[] args) {
        String str = "a nt#h o";
        String str2 = "ab_a";
        String str3 = "cbfc";
        String str4 = "rrrrrrrrrreeetyuvb";
        String str5 = "rrrrrrrrrreeetyuvb";
        //isPalindrome(str);
        System.out.println(longestPalindrome2(str4));
    }

    public static int longestPalindrome2(String str) {
        int[] arrayOfInt = new int[126];
        int result = 0;
        for(char ch: str.toCharArray()){
            arrayOfInt[ch]+=1;
            if(arrayOfInt[ch]%2 == 0){
                result+=2;
            }
        }
        int i = 0;
        return (result == str.length())?result:result+1;

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

    public String longestPalindromeOld(String s) {
        if(s.length() < 2){
            return s;
        }
        String tempStr = "!#";
        for (char ch : s.toCharArray()){
            tempStr += ch+"#";
        }
        int [] position = new int [tempStr.length()];
        int center =0;
        int mostRight=0;
        int resultCenter=0;
        int resultLength=0;

        for(int index = 0; index < tempStr.length(); index++){
            int mirror = (center * 2 )- index;
            position[index] = (mostRight > index) ? Math.min(mostRight-index, mirror) : 1;
            while ( (index + position[index]) < tempStr.length()) {
                int leftSide = tempStr.charAt(index - position[index]);
                int rightSide = tempStr.charAt(index + position[index]);
                if(leftSide == rightSide){
                    position[index]++;
                }else{
                    break;
                }
            }
            if( mostRight < (index+position[index]) ){
                center = index;
                mostRight = index + position[index];
            }

            if( resultLength < position[index]){
                resultCenter = index;
                resultLength = position[index];
            }
        }
        return s.substring( (resultCenter-resultLength)/2, (resultCenter-resultLength)/2 + resultLength-1 );
    }

    public static boolean isPalindrome(String str) {
        str = str.toLowerCase().replaceAll("[^\\p{Alnum}]", "");
        int leftIndex = 0;
        int rightIndex = str.length()-1;
        boolean isTorF = true;
        while (leftIndex < rightIndex){
            if(str.charAt(leftIndex++) != str.charAt(rightIndex--)){
                isTorF = false;
                break;
            }
        }
        return isTorF;
    }

    public static boolean isPalindrome2(String str) {
        str = str.replaceAll("[^\\p{Alnum}]", "");
        String reverseStr =new StringBuffer(str).reverse().toString();
        return str.equalsIgnoreCase(reverseStr);
    }

    public static boolean isPalindrome3(String str) {
        str = str.replaceAll("[^\\p{Alnum}]", "");
        String reverseStr =reverseStr(str);
        System.out.println("String: "+ reverseStr);
        return str.equalsIgnoreCase(reverseStr);
    }
    private static String reverseStr(String str){
        String resultStr = "";
        for(int i = str.length()-1; i >=0; i--){
            resultStr+=str.charAt(i);
        }
        return resultStr.trim();
    }


}
