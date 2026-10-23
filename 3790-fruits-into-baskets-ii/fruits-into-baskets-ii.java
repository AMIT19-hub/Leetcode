class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        boolean[] arr = new boolean[baskets.length];
        int ans = fruits.length;
        for (int fruit : fruits) {
            for (int i = 0; i < baskets.length; i++) {
                if (baskets[i] >= fruit && !arr[i]) {
                    arr[i] = true;
                    ans--;
                    break;
                }
            }
        }
        return ans;
    }
}