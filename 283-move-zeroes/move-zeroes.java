class Solution {
    public void moveZeroes(int[] nums) {
        if (nums.length < 2) {
            return;
        }

        int insertPos = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                swap(nums, insertPos, i);
                insertPos += 1;

            }
        }

    }

    void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}