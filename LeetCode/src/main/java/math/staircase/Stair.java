package math.staircase;

public class Stair {
    static int fib(int n)
    {
        int num = n;
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }

    // Returns number of ways to reach s'th stair
    public static int countWays(int s)
    {
        int num = s;
        return fib(s + 1);
    }

    public static int climbStairs(int n) {
        int first = 0, second = 1;
        for (int i = 0; i < n; i ++) {
            int tmp = first + second;
            first =second;
            second = tmp;
        }
        return second;
    }//climb

}
