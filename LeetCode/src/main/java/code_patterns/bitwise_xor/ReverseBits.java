/*
Reverse bits of a given 32 bits signed integer.
Example 1:

Input: n = 43261596

Output: 964176192

Explanation:

Integer	Binary
43261596	00000010100101000001111010011100
964176192	00111001011110000010100101000000
Example 2:

Input: n = 2147483644

Output: 1073741822

Explanation:

Integer	Binary
2147483644	01111111111111111111111111111100
1073741822	00111111111111111111111111111110

Constraints:
0 <= n <= 231 - 2
n is even.

Follow up: If this function is called many times, how would you optimize it?
 */
package code_patterns.bitwise_xor;

public class ReverseBits {

    public static int reverseBits(int n) {
        int result = 0;

        for (int i = 0; i < 32; i++) {
            result <<= 1;          // Shift result left to make room
            result |= (n & 1);     // Add the last bit of n
            n >>= 1;               // Shift n right to process the next bit
        }

        return result;
    }

    public static int reverseBits2(int n) {
        StringBuilder revBitStr = new StringBuilder();
        for(int index = 0; index < 32; index++){
            revBitStr.append(n%2);
            n/=2;
        }
        int i = 0;
        return Integer.parseInt(revBitStr.toString(),2);
    }

    public static void main(String[] args) {

    }
}
