package string;

public class ConvertToRoman2 {
    public static void main(String[] args) {
       int num = 3105;
       roman(num);
    }

    public static String roman(int num){
        int[] intCode = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] code = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        String result = "";
        for(int i = 0; i < intCode.length; i++){
            while (num >=intCode[i]){
                result+=code[i];
                num-=intCode[i];
            }
        }
        return result;
    }




}
