package string;

import java.util.HashMap;
import java.util.Map;

public class ZigZag {
    public static void main(String[] args) {
        String str = "PAYPALISHIRING";
        int num =3;
        System.out.println(curve(str,num));
    }

    public static String curve(String str, int numRows){
        if(str.length()< 2){
            return str;

        }
        Map<Integer, String> storeStr = new HashMap<>();
        int counter = 0;
        int row = 0;
        for(char ch : str.toCharArray()){

            if(storeStr.get(counter) == null){
                storeStr.put(counter,(ch+"").trim());
            }else {
                storeStr.put(counter,storeStr.get(counter)+ch);
            }
            counter= (row == 0) ?counter+1 : counter-1;
            if(counter >= numRows){
                row = 3;
                counter=counter -2;
            }
            if(counter == 0){
                row = 0;
            }

        }
        String newStr = "";
        System.out.println(storeStr);
        for(String value : storeStr.values()){
            newStr+=value;
        };
        //System.out.println("newStr = " + newStr);
        return newStr;
    }
}
