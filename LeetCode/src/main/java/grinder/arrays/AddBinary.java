package grinder.arrays;

public class AddBinary {
    public static void main(String[] args) {
       String a = "1010";
       String b ="1011";
        System.out.println(addBinary(a,b));
    }

    public static String addBinary(String a, String b) {
        int aLen = a.length();
        int bLen = b.length();
        char [] chars = new char[Math.max(aLen,bLen)+1];
        int remainder = 0;
        for (int index = chars.length -1; index >=0; index--){
            int num = (aLen > 0) ? a.charAt(aLen-1) - '0' : 0;
            int num2 = (bLen > 0) ? b.charAt(bLen-1) - '0' : 0;
            int total = num + num2 + remainder;
            if (total > 1) {
                total = (total > 2) ? 1 : 0;
                remainder=1;
            }else if(remainder > 0) {
                total = 1;
                remainder = 0;
            }
            chars[index] = (char) (total +'0');
            aLen--;
            bLen--;
        }
        return chars.length > 1 && chars[0] == '0' ? new String(chars).substring(1) : new String(chars);
    }
}
