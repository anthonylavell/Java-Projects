package recursive;

public class Str {
    public static void main(String[] args) {
        String val = "ward";
        System.out.println(Reverse(val));

    }
    public static String Reverse(String val){
        if(val.length()< 2){
            return val;
        }
        return (val.length() <2? "" : val.charAt(val.length()-1)) + Reverse(val.substring(0, val.length()-1)).trim();
    }
}
