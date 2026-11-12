class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int j = 0;
        int incLen = 1;
        int decLen = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                incLen = Math.max(i - j + 1, incLen);
            } else {
                j = i;
            }
        }
        j = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                decLen = Math.max(i - j + 1, decLen);
            } else {
                j = i;
            }
        }
        return Math.max(incLen, decLen);
    }
}