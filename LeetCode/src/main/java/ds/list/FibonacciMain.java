package ds.list;

public class FibonacciMain {
    public static void main(String[] args) {
            int number = 2;
            Fibonacci fibonacci = new Fibonacci();
        System.out.println( fibonacci.sequence(number));
        System.out.println( fibonacci.sequence(3));
        System.out.println( fibonacci.sequence(4));
        System.out.println( fibonacci.sequence(5));
        System.out.println( fibonacci.sequence(6));
    }
}
