class Solution {
    public int minMoves(int[] nums) {
        int count = 0;
        int min = nums[0];
        for (int val : nums) {
            if (val < min) {
                min = val;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            count += (nums[i] - min);
        }
        return count;
    }
}