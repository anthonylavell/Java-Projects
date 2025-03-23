package code_patterns.fastandslowpointers;

/*
Write an algorithm to determine if a number n is happy.

A happy number is a number defined by the following process:

Starting with any positive integer, replace the number by the sum of the squares of its digits.
Repeat the process until the number equals 1 (where it will stay), or
it loops endlessly in a cycle which does not include 1.
Those numbers for which this process ends in 1 are happy.
 */
public class HappyNumber {
    public static void main(String[] args) {
        int n = 19;
        System.out.println(9/10);
        System.out.println(9%10);
        //System.out.println(isHappy(n));
    }

    public static boolean isHappy(int n) {
        while (n>4){
            int temp = 0;
            while (n>0){
                int reminder = n%10;
                temp += (reminder * reminder);
                n /=10;
            }
            n = temp;
        }
        return (n  == 1) ? true : false;
    }

    public static boolean isHappy2(int n) {
        int slowP = n;
        int fastP = n;
        do {
            slowP = squareNum(slowP);
            fastP = squareNum(squareNum(fastP));
            if(slowP == 1 || fastP == 1){
                return true;
            }
        }while (slowP != fastP);
        return false;
    }

    private static int squareNum(int num){
        int total = 0;
        while (num > 0){
            int temp = num%10;
            total+=(temp*temp);
            num/=10;
        }
        return total;
    }

}
