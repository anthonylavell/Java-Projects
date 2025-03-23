package arraysandstrings.string;

import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
        String str = "team";
        String str2 = "maer";
       System.out.println(isAnagram(str,str2));
    }

    public static boolean isAnagram(String str, String str2) {
        char [] ch = str.toCharArray();
        char [] ch2 = str2.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ch2);
        return String.valueOf(ch).equals(String.valueOf(ch2));
    }
    public static boolean isAnagram2(String str, String str2) {
        if(str.length() < str2.length()){
            return false;
        }
        int [] arrayOfInt = new int[26];
        for(char ch : str2.toCharArray()){
            int chIndex = ch-'a';
            int index = str.indexOf(ch,arrayOfInt[ch-'a']);
            if(index < 0){
                return false;
            }
            arrayOfInt[ch-'a'] = index+1;
        }
       return true;
    }

}
