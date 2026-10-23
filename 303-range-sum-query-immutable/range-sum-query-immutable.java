class NumArray {
    int[] prefix;

    public NumArray(int[] nums) {
        int len = nums.length;
        prefix = new int[len];
        prefix[0] = nums[0];

        for (int i = 1; i < len; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }
    }

    public int sumRange(int left, int right) {
        if (left > 0) {
            return prefix[right] - prefix[left - 1];
        }
        return prefix[right];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */