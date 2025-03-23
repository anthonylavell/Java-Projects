package arraysandstrings.string;

public class StringToInteger {
    public static void main(String[] args) {
        //String str = "    -91283472332";
        String str = "    -42";
        //System.out.println(str);
        str = str.stripLeading();
        //System.out.println(str);
        char ch = ' ';
        System.out.println('+'-'0');
        //int num = myAtoi(str);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
       // System.out.println(num);
    }
    public static int myAtoi(String str) {
        str = str.trim();
        int isNeg = (!str.isEmpty() && str.charAt(0) == '-') ? -1 : 1;
        int charToInt = 0;
        int counter = (!str.isEmpty() && str.charAt(0) != '-' && str.charAt(0) != '+') ? 0 : 1;
        for(int i = counter; i < str.length(); i++){
            char ch = str.charAt(i);
            if((ch-'0') < 0 || (ch-'0') > 9){
                break;
            }
            long temp = ((long)charToInt * 10) + (ch - '0');
            if(temp < -2147483648 || temp > 2147483647) {
                return (isNeg < 0) ? -2147483648 : 2147483647;
            }
            charToInt = (int)temp;
        }
        return charToInt*isNeg;
    }
}
