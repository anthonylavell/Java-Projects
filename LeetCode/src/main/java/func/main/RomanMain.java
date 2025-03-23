package func.main;

import java.util.Arrays;

public class RomanMain {
    public static void main(String[] args) {
       // String s ="LVIII";
        String s = "MCMXCIV";
        //String s = "III";
        //System.out.println(Roman.toInt(s));
        char [] ch = s.toCharArray();
        Arrays.sort(ch);
        
        System.out.println(s);


    }
}
