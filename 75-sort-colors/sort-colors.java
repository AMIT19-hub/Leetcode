class Solution {
    public void sortColors(int[] nums) {
        int start=0;
        int mid=0;
        int end=nums.length-1;
        while(mid<=end){
            if(nums[mid]==0){
                swap(nums,start,mid);
                start+=1;
                mid+=1;


            }else if(nums[mid]==2){
                swap(nums,mid,end);
                end-=1;
                

            }else{
                    mid+=1;
            }
        }


    }

    void swap(int[] nums,int first,int second){
        int temp=nums[first];
        nums[first]=nums[second];
        nums[second]=temp;
    }
}