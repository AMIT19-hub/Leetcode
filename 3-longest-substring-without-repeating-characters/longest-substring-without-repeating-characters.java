class Solution {
    // a b c a b c b b
    public int lengthOfLongestSubstring(String s) {
        int res = 0;
        int left = 0;
        int right = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (; right < s.length(); right++) {
            int idx = map.getOrDefault(s.charAt(right), -1);
            if (idx != -1 && left <= idx) {
                res = Math.max(res, right - 1 - left + 1);
                left = idx + 1;
            }

            map.put(s.charAt(right), right);
        }
        return Math.max(res, right-1 - left + 1);
    }
}