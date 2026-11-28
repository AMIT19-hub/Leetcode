class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != ' ') {
                count += 1;
            } else if (ch == ' ' && count > 0) {
                sb.insert(0, s.substring(i - count, i));

                sb.insert(0, ' ');

                count = 0;
            }

        }
        sb.insert(0, s.substring(s.length() - count, s.length()));
        return sb.toString().strip();
    }
}