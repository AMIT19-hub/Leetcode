class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        do {
            slow = numTosqr(slow);
            fast = numTosqr(numTosqr(fast));

            if (slow == 1)
                return true;
        } while (slow != fast);

        return false;

    }

    public int numTosqr(int num) {

        int sqrSum = 0;
        while (num > 0) {
            int rem = num % 10;
            sqrSum += rem * rem;
            num /= 10;
        }

        return sqrSum;
    }
}