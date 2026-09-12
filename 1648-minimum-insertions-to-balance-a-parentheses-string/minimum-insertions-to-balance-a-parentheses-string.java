class Solution {
    public int minInsertions(String s) {

        int i = 0;
        int len = s.length();
        int insertions = 0;
        int open = 0;
        while (i < len) {
            char c = s.charAt(i);
            if (c == '(') {
                open++;
                i++;
            } else {
                if (i + 1 < len && s.charAt(i + 1) == ')') {
                    i += 2;
                } else {
                    insertions += 1;
                    i++;
                }

                if (open > 0) {
                    open--;
                } else {
                    insertions += 1;
                }
            }
        }
        return insertions + (open * 2);
    }
}