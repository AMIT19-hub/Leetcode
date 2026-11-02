class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null) {
            return "";
        }
        if (strs.length < 2) {
            return strs[0];
        }
        String base = strs[0];

        for (int i = 0; i < base.length(); i++) {
            char c = base.charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (i == strs[j].length() || c != strs[j].charAt(i)) {
                    return base.substring(0, i);
                }
            }
        }
        return base;
    }
}