/*
A phrase is a palindrome if, after converting all
uppercase letters into lowercase letters and removing
all non-alphanumeric characters, it reads the same forward
and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.
 */
package grinder.strings;

public class ValidPalindrome {
    public static void main(String[] args) {
        String str = "0Pant";
        //isPalindrome(str);
        System.out.println(str.charAt(4));
        str = str.replaceAll("[^a-zA-Z0-9]","").toLowerCase();

    }

    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        String tempStr = "";
        for(char ch : str.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                tempStr+=ch;
            }
        }
        int length = tempStr.length();
        for(int index = 0; index < length/2; index++){
            if(tempStr.charAt(index) != tempStr.charAt((length-1)-index)){
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome2(String str) {
        str = str.replaceAll("[^\\p{Alnum}]", "").toLowerCase();
        int length = str.length();
        for(int index = 0; index < length/2; index++){
            if(str.charAt(index) != str.charAt((length-1)-index)){
                return false;
            }
        }
        return true;
    }
}
