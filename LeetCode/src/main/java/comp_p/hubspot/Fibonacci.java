package comp_p.hubspot;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fib(2));
    }
    public static int fib(int n) {
        int[] numbers = new int[n+1];
        for (int index = 0; index <= n; index++){
            numbers[index] = (index < 2) ? index : numbers[index-1]+numbers[index-2];
        }
        return numbers[n];
    }
}
