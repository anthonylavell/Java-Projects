package code.pattern.two_pointers;

import java.util.List;

public class TeleporterArrays {

    public static final int MODULO_AMT = 1000000007;

    public static void main(String[] args) {

    }

    public static int maximumScore(List<Integer> arr1, List<Integer> arr2) {
        // WRITE YOUR BRILLIANT CODE HERE
        int ptr1 = 0, ptr2 = 0;
        int n1 = arr1.size(), n2 = arr2.size();
        // We use long for these attributes because they can exceed integer limit.
        // The max score, summed up and modded
        long result = 0;
        // The sum of the subarray between the previous teleporter and the pointer for each array
        long sectionSum1 = 0, sectionSum2 = 0;
        // As long as the two arrays are not both at the end, we advance the pointers
        while (ptr1 < n1 || ptr2 < n2) {
            // If they match, we sum up the max score of that section and the score of
            // the current position, then shrink result by using modulo
            // Reset the sums and move the pointers afterwards
            if (ptr1 < n1 && ptr2 < n2 && arr1.get(ptr1).equals(arr2.get(ptr2))) {
                result += Math.max(sectionSum1, sectionSum2) + arr1.get(ptr1);
                result %= MODULO_AMT;
                sectionSum1 = 0;
                sectionSum2 = 0;
                ptr1++;
                ptr2++;
                continue;
            }
            // If either "ptr1" reaches the end, or "ptr2" is smaller than "ptr1"
            // we move "ptr2" and keep track of the sum.
            if (ptr1 == n1 || (ptr2 != n2 && arr1.get(ptr1) > arr2.get(ptr2))) {
                sectionSum2 += arr2.get(ptr2);
                ptr2++;
            } else {
                // Otherwise, we move "ptr1" and keep track of that sum
                sectionSum1 += arr1.get(ptr1);
                ptr1++;
            }
        }
        // Add the remaining max section sum to the result, then return the result
        // modulo
        result += Math.max(sectionSum1, sectionSum2);
        return (int) (result % MODULO_AMT);
    }
}
