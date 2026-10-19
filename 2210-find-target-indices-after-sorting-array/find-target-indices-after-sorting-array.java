class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        int targetFreq = 0;
        int beforTargetNum = 0;
        for (int num : nums) {
            if (num == target) {
                targetFreq += 1;
            }
            if (num < target) {
                beforTargetNum += 1;
            }
        }

        for (int i = beforTargetNum; i < beforTargetNum + targetFreq; i++) {
            list.add(i);
        }
        return list;
    }
}