package algo.palindrome;

public class Palindrome {

   public boolean isPalindrome(int number){
       return Math.abs(number) == reverse(Math.abs(number));

   }

    public int reverse(int number){
        int reverseNum = 0;

        while(number >0){
            System.out.println( (number%10)%2 == 0 );
            int lastDigital = number%10;
            reverseNum*=10;
            reverseNum+=lastDigital;
            number = number /10;
        }
        System.out.println("reverseNum "+reverseNum);
        return reverseNum;
    }
}
