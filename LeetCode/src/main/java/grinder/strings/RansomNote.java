package grinder.strings;

public class RansomNote {
    public static void main(String[] args) {
        String ransomNote = "aab", magazine = "baa";
        System.out.println(canConstruct(ransomNote,magazine));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        int count = ransomNote.length();
        int[] letter = new int[26];
        for (char ch: ransomNote.toCharArray()){
            letter[ch-'a']++;
        }
        for (char ch: magazine.toCharArray()){
                if(letter[ch-'a'] > 0){
                    count--;
                    letter[ch-'a']--;
                }
        }
        return count == 0;
    }
}
