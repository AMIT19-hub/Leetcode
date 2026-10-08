class Solution {
    public String removeOuterParentheses(String s) {
        char[] chArr = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        String str = "";

        int openBrc = 0;
        int closeBrc = 0;
        for (int i = 0; i < chArr.length; i++) {

            if (chArr[i] == '(') {
                stack.push(chArr[i]);
                openBrc++;
            } else {
                stack.push(chArr[i]);
                closeBrc++;
            }

            if (openBrc == closeBrc) {
                stack.pop();
                String st = "";
                while (stack.size() > 1) {
                    Character c = stack.pop();
                    st = c + st;
                }
                stack.pop();
                str += st;
            }
        }
        return str;
    }
}