package arraysandstrings.string;

public class Digits {
    public static String GetCheckDigitAndCheckCode(String num){
        String nineOut=num;
        int result =0;
        int tempNum =0;
        int count =0;
        for(int i =0; i < num.length(); i++){
            if(i%2 == 0){
                result =  (Integer.valueOf(num.charAt(i))*3)+result ;
                continue;
            }
            result += Integer.valueOf(num.charAt(i));
        }
         while(nineOut.length() <=1){
             tempNum+= Integer.valueOf(nineOut.charAt(count));
             if(count >= nineOut.length()){
                 nineOut=String.valueOf(tempNum);
                 count = 0;

                 continue;
             }
             count++;
         }

        result = ((10 - (result%10))+result)- result;


        return "";
    }
}
