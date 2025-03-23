package grinder.dp;

public class ClimbingStairs {
    public static void main(String[] args) {
        System.out.println(climbStairs(45));
    }

    public static int climbStairs(int n) {
        int num = 0;
        int num2 = 1;
        int subTotal = 0;
        for(int count = 0; count < n; count++){
            subTotal = num + num2;
            num = num2;
            num2 = subTotal;
        }
        return subTotal;
    }


}
