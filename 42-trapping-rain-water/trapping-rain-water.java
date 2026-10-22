class Solution {
    public int trap(int[] height) {
        int len = height.length;
        int[] SuffixMax = new int[len];
        int total = 0;

        for (int i = len - 1; i > 0; i--) {
            if (i < len - 1 && SuffixMax[i + 1] > height[i]) {
                SuffixMax[i] = SuffixMax[i + 1];
            } else {
                SuffixMax[i] = height[i];
            }
        }
        int leftMax = height[0];
        for (int i = 0; i < len; i++) {
            if (height[i] < leftMax && height[i] < SuffixMax[i]) {
                total += (Math.min(leftMax, SuffixMax[i]) - height[i]);
            } else if (height[i] > leftMax) {
                leftMax = height[i];
            }
        }
        return total;
    }
}