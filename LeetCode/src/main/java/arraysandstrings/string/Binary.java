package arraysandstrings.string;

public class Binary {
    public static void main(String[] args) {
        String a = "11";
        String b = "1";
        /*System.out.println(0/2);
        System.out.println(1/2);
        System.out.println(2/2);
        System.out.println(3/2);*/
        System.out.println(0%2);
        System.out.println(1%2);
        System.out.println(2%2);
        System.out.println(3%2);
        //addBinary(a, b);
    }
    public static String addBinary(String a, String b) {
       String temp = helpToAddBinary(a,b);
        return temp;
    }

    private static String helpToAddBinary(String str, String str2){
        int [] arrayOfInt = {0,1,0,1};
        String binaryStr= "";
        int strCount = str.length()-1;
        int str2Count = str2.length()-1;
        int carry = 0;

        while (strCount >= 0 || str2Count >=0 || carry > 0){
            if(strCount < 0){
                carry+=(str.charAt(strCount)-'0');
            }
            if(str2Count < 0){
                carry+=(str2.charAt(str2Count)-'0');
            }

           binaryStr = arrayOfInt[carry] +binaryStr;
           carry /= 2;
           strCount--;
           str2Count--;

        }

        return binaryStr;
    }
}
