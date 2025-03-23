package wayfair.string;

public class AddStrings {
    public static void main(String[] args) {
       String num1 = "89";
       String num2 = "234";
      /* int temp = num1.charAt(num1.length()-1)-'0';
       char ch = '9';
        System.out.println(ch+2);
       System.out.println("num1: "+temp);
        //System.out.println("num1: "+num1.charAt(num1.length()-1));
       int temp2 = Integer.parseInt(num2.charAt(num2.length()-1)+"");
       System.out.println(temp2);*/
       System.out.println(addStrings(num1,num2));
    }
    public static String addStrings(String num1, String num2) {
        String total = "";
        int num1Count = num1.length()-1;
        int num2Count = num2.length()-1;
        int remainder = 0;
        while (num1Count>=0 || num2Count >=0){
            int convertNum1 = (num1Count >= 0)? num1.charAt(num1Count) - '0' : 0;
            int convertNum2 = (num2Count >= 0)? num2.charAt(num2Count) - '0' : 0;
            int temp = convertNum1 + convertNum2 + remainder;
            if(temp > 9){
                remainder = 1;
                temp = temp%10;
            }else {
                remainder=0;
            }
            num1Count--;
            num2Count--;
            total = ((num1Count<0 && num2Count<0) && remainder>0)? remainder +(temp +total) : (temp +total);
        }

        return total ;
    }

}
