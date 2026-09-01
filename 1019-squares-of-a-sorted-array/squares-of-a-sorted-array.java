class Solution {
    public int[] sortedSquares(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        int[] arr = new int[nums.length];
        int k = arr.length - 1;

        while (i <= j) {
            if (nums[i] * nums[i] > nums[j] * nums[j]) {
                arr[k] = nums[i] * nums[i];
                i += 1;
            } else if (nums[i] * nums[i] < nums[j] * nums[j]) {
                arr[k] = nums[j] * nums[j];
                j -= 1;
            } else {
                arr[k] = nums[i] * nums[i];
                k -= 1;
                if (k >= 0 && i != j) {
                    arr[k] = nums[j] * nums[j];
                }

                i += 1;
                j -= 1;
            }
            k -= 1;
        }
        
        return arr;
    }
}