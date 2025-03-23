package array.minimum_bribes;

public class Bribes {
    // Complete the minimumBribes function below.
    public static void minimumBribes(int[] q) {
        int bribe = 0;
        int n = q.length;
        for (int i = 0; i < n; i++) {
            if (q[i] - (i + 1) > 2) {
                System.out.println("Too chaotic");
                return;
            }
            int num = Math.max(0, q[i] - 1 - 1);
            for (int j = Math.max(0, q[i] - 1 - 1); j < i; j++)
                if (q[j] > q[i])
                    bribe++;
        }
        System.out.println(bribe);
    }
}
