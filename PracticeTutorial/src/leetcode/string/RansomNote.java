package leetcode.string;

public class RansomNote {
    public static void main(String[] args) {
        String ransomNote = "cabc";
        String magazine = "cbbaaac";
        System.out.println(canConstruct(ransomNote,magazine));
    }
    public static boolean canConstruct(String ransomNote, String magazine) {
        int [] tempArr = new int[26];
        for(char ch: ransomNote.toCharArray()){
            int fromIndex = tempArr[ch-'a'];
            int index = magazine.indexOf(ch,fromIndex);
            if(index==-1){
                return false;
            }
            tempArr[ch-'a'] = index + 1;
        }
        return true;
    }
}
