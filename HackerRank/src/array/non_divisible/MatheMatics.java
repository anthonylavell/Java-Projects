package array.non_divisible;

public class MatheMatics {
    // Complete the nonDivisibleSubset function below.
    static int nonDivisibleSubset(int k, int[] S) {
        // **** declare and populate array of remainders ****
        int[] remainderArr = new int[k];

        for (int n : S) {

            // ???? ????
            System.out.println("n % k (" + n + " % " + k + "): " + n % k);

            remainderArr[n % k]++;
        }

        // ???? ????
        System.out.print("remainderArr: ");
        for (int s : remainderArr)
            System.out.print(s + " ");
        System.out.println("\n");

        // **** set initial number of elements in the subset ****
        int zeroRemainder = remainderArr[0];

        // ???? ????
        System.out.println("        zeroRemainder: " + zeroRemainder);

        // **** consider only one of the numbers ****
        int numOfElementsInSubset = (zeroRemainder > 0) ? 1 : 0;

        // ???? ????
        System.out.println("numOfElementsInSubset 1: " + numOfElementsInSubset + "\n");

        // **** ****
        for (int i = 1; i <= (k / 2); i++) {

            // ???? ????
            System.out.println("i: " + i + " k - i: " + (k - i));

            // **** ****
            if (i != k - i) {
                numOfElementsInSubset += Math.max(remainderArr[i], remainderArr[k - i]);
            } else {
                numOfElementsInSubset++;
            }

            // ???? ????
            System.out.println("numOfElementsInSubset 2: " + numOfElementsInSubset);
        }

        // **** return the number of elements in the subset ****
        return numOfElementsInSubset;
    }
}
