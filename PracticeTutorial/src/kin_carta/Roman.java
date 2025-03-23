package kin_carta;

public class Roman {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        String s2 = "III";
        System.out.println(romanToInt(s));
    }

    public static int romanToInt(String s) {
        int total = 0;
        int prev = 0;
        int current = 0;
        for(int i = s.length()-1; i >=0; i--){
            current = getRomanInteger(s.charAt(i)+"");
            if(current >= prev){
                prev = current;
            }else {
                prev=-(current);
            }
            total+= prev;

        }
        int i = 0;
        return total;
    }

    private static int getRomanInteger(String str){
        int total = 0;
        switch (str) {
            case "I" -> total = 1;//no break needed
            case "IV" -> total = 4;
            case "V" -> total = 5;
            case "X" -> total = 10;
            case "L" -> total = 50;
            case "C" -> total = 100;
            case "D" -> total = 500;
            case "M" -> total = 1000;
        }
            return total;
    }
}
