class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int j = 1;
        int count = 1;
        while (j < nums.length) {
            if (nums[i] >= nums[j]) {
                j += 1;
            } else {
                swap(nums,i+1,j);
                i += 1;
                j += 1;
                count += 1;
            }
        }
return count;
    }
    void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
        
    }
}