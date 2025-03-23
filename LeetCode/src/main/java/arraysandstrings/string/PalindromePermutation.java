package arraysandstrings.string;

public class PalindromePermutation {
    public static void main(String[] args) {
        String str = "aab";
        canPermutePalindrome(str);
    }

    public static boolean canPermutePalindrome(String str) {
        int [] arrayOfChars = new int[26];
        int oddCount = 0;
        for(char ch : str.toCharArray()){
           arrayOfChars[ch-'a']++;
        }
       for(int val : arrayOfChars){
            if(val % 2 == 1){
                oddCount++;
            }
        }
        return oddCount < 2;
    }
}
