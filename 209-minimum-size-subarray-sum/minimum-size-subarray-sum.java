class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0;
        int windowSum = 0;
        int minIdx = Integer.MAX_VALUE;
        for (int j = 0; j < nums.length; j++) {
            windowSum += nums[j];
            while (windowSum >= target) {
                int Idx = j - i + 1;
                minIdx = Math.min(minIdx, Idx);
                windowSum -= nums[i];
                i += 1;
            }
        }
        return minIdx == Integer.MAX_VALUE ? 0 : minIdx;
    }
}