package arraysandstrings.string;

public class PracticeString extends StringMethod {
    private static String fName = "Michelle";
    public static boolean anagrams(String str, String str2){
        System.out.println("Str: " + str);
        System.out.println("Str2: " + str2);
        str =  sortString(str).trim();
        str2 = sortString(str2);
        System.out.println("Str: " + str);
        System.out.println("Str2: " + str2);
        return false;

    }
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        //System.out.println(anagrams(s,t));
    }

    private static String sortString(String str){
        String inputStr = str
                .chars()
                .sorted()
                .collect(
                        StringBuilder::new,
                        StringBuilder::appendCodePoint,
                        StringBuilder::append
                )
                .toString();
        return inputStr;
    }

}
