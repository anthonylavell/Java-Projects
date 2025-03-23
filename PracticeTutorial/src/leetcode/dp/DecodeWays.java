package leetcode.dp;

public class DecodeWays {
    public static void main(String[] args) {
        String s = "226";
        String s2 = "12131";
        String s3 = "06";
        String s4 = "12031";
        String s5 = "1201234";
        String s6 = "10011";
        System.out.println(numDecodings(s6));
    }
    public static int numDecodings(String s) {
        if(s.charAt(0) == '0'){
            return 0;
        }
        if(s.length() < 2){
            return 1;
        }
        int oneBack = 1;
        int twoBack = 1;

        for(int i = 1; i < s.length(); i++){
            int current = 0;
            int num = Integer.valueOf(s.charAt(i)+"");

            if(num >0){
               current= oneBack;
            }

            num = Integer.valueOf(s.substring((i-1),i+1));
            if(num>9 && num<=26){
                current+=twoBack;
            }
            twoBack = oneBack;
            oneBack = current;
        }
        return oneBack;
    }
}
