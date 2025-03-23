package grinder.arrays;

public class RansomNote {
    public static void main(String[] args) {
        System.out.println('z'-'a');
    }
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length() > magazine.length()){
            return false;
        }
        int [] arrayOfChars = new int[26];
        for (char ch : magazine.toCharArray()){
            arrayOfChars[ch-'a']++;
        }
        for(char ch : ransomNote.toCharArray()){
           if(--arrayOfChars[ch-'a'] < 0){
               return false;
           }
        }
        return true;
    }
}
