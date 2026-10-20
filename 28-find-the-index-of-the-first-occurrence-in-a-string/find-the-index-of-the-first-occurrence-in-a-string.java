class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();
        int strHash=needle.hashCode();
        for (int i = 0; i <= n - m; i++) {
            if (haystack.substring(i, i + m).hashCode()== strHash) {
                return i;
            }
        }
        return -1;
    }
}