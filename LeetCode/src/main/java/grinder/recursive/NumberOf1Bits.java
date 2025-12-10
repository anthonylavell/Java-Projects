package grinder.recursive;

public class NumberOf1Bits {
    public int hammingWeight(int n) {
        if (n == 0){
            return 0;
        }

        int rem = n/2;
        int val = hammingWeight(rem); // 1 2
        int mol = n%2;

        return mol==0 ? val : val + mol;
    }

    public static void main(String[] args) {

    }
}
