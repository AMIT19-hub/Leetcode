class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {

        int minSum = Integer.MAX_VALUE;
        int len = nums.size();
        for (int i = 0; i < len; i++) {
            int sum = 0;
            for (int j = i; j < len && j < i + r; j++) {
                sum += nums.get(j);
                if (j - i + 1 >= l) {
                    if (sum > 0) {
                        minSum = Math.min(minSum, sum);
                    }
                }
            }
        }
        return minSum == Integer.MAX_VALUE ? -1 : minSum;
    }
}