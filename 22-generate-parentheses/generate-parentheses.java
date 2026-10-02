class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        generate("", 0, 0, n, list);
        return list;
    }

    void generate(String str, int open_bracket, int close_bracket, int n, List<String> list) {
        if (open_bracket == n && close_bracket == n) {
            list.add(str);
            return;
        }

        if (open_bracket < n) {
            generate(str + "(", open_bracket + 1, close_bracket, n, list);
        }

        if (close_bracket < open_bracket) {
            generate(str + ")", open_bracket, close_bracket + 1, n, list);
        }
    }
}