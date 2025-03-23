package arraysandstrings.string;

import java.util.Arrays;

public class RansomNote {
    public static void main(String[] args) {
        String ransomNote = "ccf";
        String magazine = "ffccaa";
        int[] letters = new int[26];
        int index = magazine.indexOf('f', letters['f'- 'a']);
        System.out.println('a'+0);
        System.out.println('f'+0);
        System.out.println('f'-'a');
        System.out.println(index);
        letters['f'- 'a'] = index+1;
        index = magazine.indexOf('f', letters['f'- 'a']);
        System.out.println('a'+0);
        System.out.println('f'+0);
        System.out.println('f'-'a');
        System.out.println(index);
        canConstruct(ransomNote,magazine);
    }
    public static boolean canConstruct(String ransomNote, String magazine) {
        char[] noteChar = ransomNote.toCharArray();
        char [] magChar = magazine.toCharArray();
        Arrays.sort(noteChar);
        Arrays.sort(magChar);
        int count = 0;
        for(char ch : magChar){
            if(count == noteChar.length){
                break;
            } else if (ch == noteChar[count]) {
                count++;
            }
        }
        return noteChar.length == count;
    }

    public static boolean canConstruct2(String ransomNote, String magazine) {
        if(ransomNote.length() > magazine.length()){
            return false;
        }
        int [] letter = new int[26];
        for(char ch : ransomNote.toCharArray()){
            int index = magazine.indexOf(ch,(letter[ch-'a']));
            if(index < 0){
                return false;
            }
            letter[ch-'a'] = index+1;
        }
        return true;
    }
}
