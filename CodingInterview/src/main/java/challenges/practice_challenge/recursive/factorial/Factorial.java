package challenges.practice_challenge.recursive.factorial;

public class Factorial {
    public static int findFactorialRecursive(int number){
        if(number >2){
            number = number*findFactorialRecursive(number-1);

        }
        return number;
    }

    public static int findFactorial(int number){
        if(number > 2) {
            for (int count = number - 1; count > 0; count--) {
                number *= count;
            }
        }
        return number;
    }
}
