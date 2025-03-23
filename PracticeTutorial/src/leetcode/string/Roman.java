package leetcode.string;

import java.util.HashMap;
import java.util.Map;

public class Roman {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(romanToInt(s));
    }
    public static int romanToInt(String s) {
        Map<Character, Integer> hashMap = getRomanInt();
        int total = 0;
        int previous = 0;
        for(int i = s.length()-1; i >=0; i--){
            int current = getRomanInt2(s.charAt(i));
            previous = (current >= previous) ? current : -(current);
            total+=previous;
        }
        return total;
    }

    public static Map<Character, Integer> getRomanInt(){
        Map<Character, Integer> hashMap = new HashMap<>();
        hashMap.put('I',1);
        hashMap.put('V',5);
        hashMap.put('X',10);
        hashMap.put('L',50);
        hashMap.put('C',100);
        hashMap.put('D',500);
        hashMap.put('M',1000);
        return hashMap;
    }

    public static int getRomanInt2(Character ch){
        switch (ch){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            default: return 1000;
        }
    }

}
