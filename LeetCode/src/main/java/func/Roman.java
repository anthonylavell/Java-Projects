package func;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class Roman {
    public static int toInt(String s){
        int result =0;
        Map<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("IV", 4);
        map.put("V", 5);
        map.put("IX", 9);
        map.put("X", 10);
        map.put("XL", 40);
        map.put("L", 50);
        map.put("XC", 90);
        map.put("C", 100);
        map.put("CD", 400);
        map.put("D", 500);
        map.put("CM", 900);
        map.put("M", 1000);
        BiFunction<String,String, Boolean> subRoman = (String str, String str2) ->
                (str.equals("I") &&( str2.equals("V") ||  str2.equals("X")))
                        ||(str.equals("X") && (str2.equals("L") || str2.equals("C")))
                        ||(str.equals("C") && (str2.equals("D") || str2.equals("M")));
        for(int i = 0; i < s.length(); i++){
            String str = s.substring(i, i+1);
            if((i+1) <= s.length()-1){
                if(subRoman.apply(str,s.substring(i+1,i+2))){
                    str = s.substring(i, i+2);
                    i++;
                }
            }
            result+=map.get(str);

        }

        return result;
    }
}
