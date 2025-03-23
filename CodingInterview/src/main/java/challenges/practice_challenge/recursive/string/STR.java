package challenges.practice_challenge.recursive.string;

public class STR {
    public static String reverse(String str){
        if (str.isEmpty())
            return str;
        //Calling Function Recursively
        return reverse(str.substring(1)) + str.charAt(0);
    }
}
