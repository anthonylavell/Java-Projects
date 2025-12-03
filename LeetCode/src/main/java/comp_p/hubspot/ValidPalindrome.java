/*
A phrase is a palindrome if, after converting all
uppercase letters into lowercase letters and removing
all non-alphanumeric characters, it reads the same forward
and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.
 */
package comp_p.hubspot;

public class ValidPalindrome {

    public static boolean isPalindrome(String s) {
        int count = 0;
        s = s.toLowerCase();
        char[] chars = new char[s.length()];
        for (char ch : s.toCharArray()){
            if (Character.isLetterOrDigit(ch)){
                chars[count++] = ch;
            }
        }
        for (int left = 0; left < --count; left++){
            if (chars[left]!= chars[count]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "0Pant";
        //isPalindrome(str);
        System.out.println(str.charAt(4));
        str = str.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        String str2 = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(str2));

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
