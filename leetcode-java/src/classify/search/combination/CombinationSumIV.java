package classify.search.combination;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CombinationSumIV {
    private int res = 0;
    private int[] dp;

    /**
     * 26ms 6.17%
     * 36.3MB 5.05%
     */
    public int combinationSum4(int[] nums, int target) {
        backtrace(new HashMap<>(), nums, target);

        return res;
    }

    private void backtrace(Map<Integer, Integer> map, int[] nums, int target) {
        if (target < 0) {
            return;
        }

        if (target == 0) {
            res++;
            return;
        }

        if (map.containsKey(target)) {
            res += map.get(target);
            return;
        }

        map.put(target, res);
        for (int num : nums) {
            target -= num;
            backtrace(map, nums, target);
            target += num;
        }
    }

    /**
     * 动态规划
     * 0ms 100.00%
     * 33.2MB 66.17%
     */
    public int combinationSum42(int[] nums, int target) {
        dp = new int[target + 1];
        Arrays.fill(dp, -1);
        dp[0] = 1;

        return dfs(nums, target);
    }

    private int dfs(int[] nums, int target) {
        if (dp[target] != -1) {
            return dp[target];
        }

        int res = 0;
        for (int num : nums) {
            if (target >= num) {
                res += dfs(nums, target - num);
            }
        }
        dp[target] = res;

        return res;
    }


    /**
     * Time Limit Exceeded
     */
    public int combinationSum43(int[] nums, int target) {
        if (nums == null || nums.length == 0 || target < 1) {
            return 0;
        }

        Arrays.sort(nums);
        backtrack(nums, target);

        return res;
    }

    private void backtrack(int[] nums, int target) {
        if (target == 0) {
            res++;
            return;
        }

        for (int i = 0; i < nums.length && nums[i] <= target; i++) {
            target -= nums[i];
            backtrack(nums, target);
            target += nums[i];
        }
    }
}
