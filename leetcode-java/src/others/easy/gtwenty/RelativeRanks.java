package others.easy.gtwenty;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 506 Relative Ranks
 *
 * Given scores of N athletes, find their relative ranks and the people with the top three highest scores,
 * who will be awarded medals: "Gold Medal", "Silver Medal" and "Bronze Medal".
 *
 * Example 1:
 * Input: [5, 4, 3, 2, 1]
 * Output: ["Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"]
 * Explanation: The first three athletes got the top three highest scores, so they got "Gold Medal",
 * "Silver Medal" and "Bronze Medal".
 * For the left two athletes, you just need to output their relative ranks according to their scores.
 *
 * Note:
 * N is a positive integer and won't exceed 10,000.
 * All the scores of athletes are guaranteed to be unique.
 */

public class RelativeRanks {

    private static String[] findRelativeRanks(int[] nums) {
        int[] temp = nums.clone();
        Arrays.sort(temp);
        HashMap<Integer, String> hashMap = new HashMap<>();

        switch (nums.length) {
            default:
                for (int i = temp.length - 4; i >= 0; i--)
                    hashMap.put(temp[i], String.valueOf(temp.length - i));
            case 3:
                hashMap.put(temp[temp.length - 3], "Bronze Medal");
            case 2:
                hashMap.put(temp[temp.length - 2], "Silver Medal");
            case 1:
                hashMap.put(temp[temp.length - 1], "Gold Medal");
            case 0:
                break;
        }

        String[] res = new String[nums.length];
        for (int i = 0; i < nums.length; i++)
           res[i] = hashMap.get(nums[i]);

        return res;
    }
}
