class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int start = 0;
        int end = height.length - 1;
        while (start < end) {
            int min = Math.min(height[start], height[end]);
            int currMaxArea = (end - start) * min;
            if (maxArea < currMaxArea) {
                maxArea = currMaxArea;
            }
            if (height[start] <= height[end]) {
                start += 1;
            } else {
                end -= 1;
            }
        }
        return maxArea;
    }
}