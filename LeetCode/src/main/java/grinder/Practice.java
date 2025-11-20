package grinder;

import java.util.*;

public class Practice {
    public static int romanToInt(String s) {
        Set<String>setOfExcept = new HashSet<>(new ArrayList<>(Arrays.asList("IV","IX","XL","XC","CD","CM")));
        int total = 0;
        char[] chars = s.toCharArray();
        int index = 0;
        while (index < chars.length){
            String str = "";
            if (index+1<chars.length && setOfExcept.contains(str+chars[index]+chars[index+1])){
                str=str+ chars[index]+chars[index+1];
                index+=2;
            }else {
                str = str+chars[index];
                index++;
            }
            total+=convertRomanToInt(str);
        }
        return total;
    }
    private static void helper(String roman){
        String[] parts = roman.split(",",-1);
        for (String str : parts){
            System.out.printf("%s convert to: %d%n",str,romanToInt(str));
        }

    }
    private static int convertRomanToInt(String str) {
        switch (str) {
            case "IV":
                return 4;
            case "IX":
                return 9;
            case "XL":
                return 40;
            case "XC":
                return 90;
            case "CD":
                return 400;
            case "CM":
                return 900;
            case "I":
                return 1;
            case "V":
                return 5;
            case "X":
                return 10;
            case "L":
                return 50;
            case "C":
                return 100;
            case "D":
                return 500;
            case "M":
                return 1000;
            default:
                return 0;
        }
    }
    public static void main(String[] args) {
       String str = "III,LVIII,MCMXCIV,MMMXLV";
        String str2 = "MCMXCIV,MMMXLV";
        String str3 = "MMMXLV";
        helper(str2);
    }
}
