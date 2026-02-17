package arraysandstrings.string;

public class StringToInteger {

    public static int myAtoi(String s) {
        s=s.trim();
        int startIndex =!s.isEmpty()&&(("-+").indexOf(s.charAt(0))>-1)?1:0;
        int sign = !s.isEmpty()&&(("-").indexOf(s.charAt(0))>-1)?-1:1;
        long sum = 0;
        for (int idx = startIndex; idx < s.length(); idx++){
            char ch = s.charAt(idx);
            if (!Character.isDigit(ch)){
                break;
            }
            sum = (sum*10)+(ch-'0');
            if (sum >Integer.MAX_VALUE){
                return sign==-1?Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
        }
        return (int) (sum*sign);
    }
    public static void main(String[] args) {
        //String str = "    -91283472332";
        String s = "    +042";
        //System.out.println(str);
        //System.out.println(str);
        //System.out.println('+'-'0');
        //int num = myAtoi(str);
        s=s.trim();
        System.out.println(("-+").indexOf(s.charAt(0)));
       //System.out.println(myAtoi(s));
    }

}
