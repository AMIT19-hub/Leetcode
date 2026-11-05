class Solution {
    public int minMoves(int[] nums) {
        int max = nums[0];
        for (int val : nums) {
            if (val > max) {
                max = val;
            }
        }
        int moves = 0;
        for (int val : nums) {
            moves += max - val;
        }
        return moves;
    }
}