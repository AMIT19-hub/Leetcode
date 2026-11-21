class Solution {
    public boolean isPowerOfTwo(int n) {

        if (n < 1) {
            return false;
        }
        // by recursion
        // return n % 2 == 0 ? isPowerOfTwo(n / 2) : false;

        // by bit operation
        if ((n & (n - 1)) == 0) {
            return true;
        }
        return false;
    }
}