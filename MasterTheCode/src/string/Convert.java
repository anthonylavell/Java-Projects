package string;


import recursive.Str;

public class Convert {
    public static void main(String[] args) {
        //String str = "4193 with words";//--9 3.14159 12a23 --12.23 . .09 - -91283472332 4193 with words
        //System.out.println(stringToNumber(str));
        /* boolean strB = str.matches("\\d+");
        System.out.println(strB);
        String num = "25 6";
        long num2=0;
        for(char ch: num.toCharArray()){
                if(String.valueOf(ch).matches("\\d")) {
                    num2 = (num2 == 0) ? Long.valueOf(ch + "") : Long.valueOf(String.valueOf(num2) + ch + "");
                    continue;
                }
                break;
            }
        System.out.println("num2 = " + num2);*/
        final int max = (int) Math.pow(2, 31);
        final int min = (int) Math.pow(-2, 31);
        System.out.println( 2000000000L>max);
    }

    public static int stringToNumber(String str){
        str= str.stripLeading().stripTrailing();
        if(str.replaceAll("[\\s]","").isEmpty()){
            return 0;
        }
        boolean sign = false;
        if(str.charAt(0) == '-'){
            str= str.replaceFirst("[\\-]","");
            sign = true;
        }else if(str.charAt(0) == '+'){
            str= str.replaceFirst("[+]","");
        }
        if(str.isEmpty()|| findCharacters(str)){
            return 0;
        }

            int num =0;
        for(char ch : str.toCharArray()){
            if(String.valueOf(ch).matches("\\d") ) {
                long tempNum = (num == 0) ?  (Integer.parseInt(ch + "")) :Long.parseLong(String.valueOf(num) + ch + "");
                if(num!=0) {
                    final int max = (int) Math.pow(2, 31);
                    final int min = (int) Math.pow(-2, 31);
                    if (tempNum >= max) {
                        num = max;
                        break;
                    } else if (tempNum <= min) {
                        num = min;
                        break;
                    }
                }
                num =  (int)tempNum;
                if(sign && num>0){
                    num*=-1;
                    sign = false;
                }

                continue;
            }
            break;
        }

        return num;
    }

    private static boolean findCharacters(String str){
        return str.substring(0,1).matches("[^0-9]");
    }
}
