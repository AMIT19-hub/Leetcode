class Solution {
    public int pivotIndex(int[] nums) {
        int len = nums.length;
        int[] suffixSum = new int[len];
        int prefixSum = 0;
        for (int i = len - 1; i >= 0; i--) {
            if (i < len - 1) {
                suffixSum[i] = nums[i + 1] + suffixSum[i + 1];
            } else {
                suffixSum[i] = 0;
            }
        }

        // compare prefix and suffix
        for (int i = 0; i < len; i++) {

            if (prefixSum == suffixSum[i ]) {
                return i;
            }
            prefixSum += nums[i];
        }

        return -1;
    }
}