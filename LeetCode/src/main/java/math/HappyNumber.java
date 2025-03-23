package math;

public class HappyNumber {
    public static boolean isHappy(int n) {
        for(int count = 0; count < 6; count++){
            n = convertIntoDigit(n);
            if(n == 1){
                return true;
            }
        }

        return false;
    }

    private static int convertIntoDigit(int n){
       int tempNum = 0;
        while (n > 0){
           tempNum= getNumber(n%10,tempNum);
            n = n/10;
        }
        return tempNum;
    }

    private static int getNumber(int num, int result){
          result+= (int)Math.pow(num,2);
        return result;
    }

}
