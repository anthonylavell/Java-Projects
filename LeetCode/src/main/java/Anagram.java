public class Anagram {
    public static boolean isAnagram(String str1, String str2){
        if (str1.length()!=str2.length()){
            return false;
        }
        str1 = str1.trim();
        str2 = str2.trim();
        int [] letter = new int[26];

       for (char ch: str1.toCharArray()){
           letter[ch-'a']++;
       }
        for (int index = 0; index < str2.length(); index++){
            char ch = str2.charAt(index);
            letter[ch-'a']--;
            if (letter[ch-'a']<0){
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        /*String str1="ant";
        String str2 = "tan";*/
        String str1="room";
        String str2 = "rom";
        System.out.println("Is it an Anagram: " + isAnagram(str1,str2));
    }
}
