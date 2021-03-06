package others.easy.ctwenty;

/**
 * 191 Number of 1 Bits
 *
 * Write a function that takes an unsigned integer and returns the number of '1' bits it has (also known as the Hamming weight).
 *
 * Example 1:
 *
 * Input: 11
 * Output: 3
 * Explanation: Integer 11 has binary representation 00000000000000000000000000001011
 *
 * Example 2:
 *
 * Input: 128
 * Output: 1
 * Explanation: Integer 128 has binary representation 00000000000000000000000010000000
 */

public class NumberOfOneBits {

    // Copied
    private static int hammingWeight(int n) {
        int count = 0;
        long x = n & 0x0FFFFFFFFL;
        while (x > 0) {
            if (x % 2 == 1)
                count++;
            x /= 2;
        }

        return count;
    }
}
