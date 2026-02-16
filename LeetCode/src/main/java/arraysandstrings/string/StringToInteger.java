package arraysandstrings.string;

public class StringToInteger {

    public int myAtoi(String s) {
        s=s.trim();
        boolean isNeg = !s.isEmpty() && s.charAt(0)=='-';
        int start = !s.isEmpty() && (s.charAt(0)=='-' ||s.charAt(0)=='+') ? 1 : 0;
        long num = 0;
        for (int idx = start; idx<s.length() && Character.isDigit(s.charAt(idx));idx++){
            char ch = s.charAt(idx);
            num = num*10 + ch-'0';
            if (num>2147483647){
                return isNeg ? -2147483648 : 2147483647;
            }
        }

        return isNeg ?- (int)num : (int)num;
    }
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

}
