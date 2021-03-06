package others.easy.dtwenty;

/**
 * 258 Add Digits
 *
 * Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
 *
 * Example:
 *
 * Input: 38
 * Output: 2
 * Explanation: The process is like: 3 + 8 = 11, 1 + 1 = 2.
 *              Since 2 has only one digit, return it.
 * Follow up:
 * Could you do it without any loop/recursion in O(1) runtime?
 */

public class AddDigits {

    private static int addDigits(int num) {

//        char[] charsNum = String.valueOf(num).toCharArray();
//        int result = 0;
//        for (char aCharsNum : charsNum) result += aCharsNum - '0';
//        if (result < 10) return result;
//        else return addDigits(result);

        return ((num - 1) % 9) + 1;
    }
}
