//https://leetcode.com/problems/minimum-size-subarray-sum/

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minWindowSize = Integer.MAX_VALUE;
        int currentWindowSum = 0;
        int windowStart = 0;
        boolean foundSubArray = false;

        for (int windowEnd = 0; windowEnd < nums.length; windowEnd++) {
            currentWindowSum += nums[windowEnd];
            while (currentWindowSum >= target) {
                foundSubArray = true;
                minWindowSize = Math.min(minWindowSize, windowEnd - windowStart + 1);
                currentWindowSum -= nums[windowStart];
                windowStart++;
            }
        }
        return foundSubArray ? minWindowSize : 0;
    }
}
