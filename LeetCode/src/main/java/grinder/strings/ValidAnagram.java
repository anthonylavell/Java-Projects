package grinder.strings;

public class ValidAnagram {
    public static void main(String[] args) {
        String str = "rat";
        String str2 = "car";
        boolean isTorF = isAnagram(str,str2);
    }
    public static boolean isAnagram(String str, String str2) {
        if(str.length() != str2.length()){
            return false;
        }
        int len = str.length();
        char[] chars = new char[126];
        for (char ch : str.toCharArray()){
            chars[ch]++;
        }
        for(int index = 0; index < str2.length(); index++){
            if(chars[str2.charAt(index)] < 1){
                break;
            }
            chars[str2.charAt(index)]--;
            len--;
        }
        return (len == 0);

    }
}
