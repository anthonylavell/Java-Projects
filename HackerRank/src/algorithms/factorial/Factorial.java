package algorithms.factorial;

import java.math.BigInteger;

public class Factorial {
    private static BigInteger factorial;
    public static void extraLongFactorials(int n) {
        BigInteger factorial = new BigInteger(String.valueOf(n));
        for(int num = n-1; num >0; num--) {

            factorial = factorial.multiply(BigInteger.valueOf(num));
        }
        System.out.println(factorial);
    }

}
