class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {

        int ans = 0;
        int len = nums.length;
        int l = 0;
        int prod = 1;
        for (int r = 0; r < len; r++) {
            prod *= nums[r];
            while (prod >= k && l <= r) {
                prod /= nums[l];
                l++;
            }
            ans += r - l + 1;
        }
        return ans;
    }
}