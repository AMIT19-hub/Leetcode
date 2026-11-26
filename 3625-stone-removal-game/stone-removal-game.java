class Solution {
    public boolean canAliceWin(int n) {
        boolean aliceTurn = true;
        int sub = 10;
        while (n >= 0) {
            if (n < sub && sub % 2 == 0) {
                return false;
            }
            n -= sub;
            sub--;
        }
        return true;
    }
}