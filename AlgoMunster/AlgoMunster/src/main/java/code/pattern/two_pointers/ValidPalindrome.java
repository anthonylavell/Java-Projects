package code.pattern.two_pointers;

public class ValidPalindrome {
    public static void main(String[] args) {
        String str = " A man, a plan, a canal: Panama";
        String str2 = " Do geese see God?";
        String str3 = " ";
        String str4 = "A brown fox jumping over ";

        System.out.println("First Str:" + isPalindrome(str));
        System.out.println("Second Str:" + isPalindrome(str2));
        System.out.println("Third Str:" + isPalindrome(str3));
        System.out.println("Fourth Str:" + isPalindrome(str4));
    }

    public static boolean isPalindrome(String str) {
        str = str.replaceAll("[^A-Za-z0-9]","").toLowerCase();
        int leftIndex = 0;
        int rightIndex = str.length()-1;
        while (leftIndex < rightIndex){
            if(str.charAt(leftIndex) != str.charAt(rightIndex)){
                return false;
            }
            leftIndex++;
            rightIndex--;
        }
        return true;
    }
}
