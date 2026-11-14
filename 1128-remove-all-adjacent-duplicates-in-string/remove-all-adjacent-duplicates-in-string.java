class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack();
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop();
            } else {
                stack.push(c);
            }

        }

        StringBuilder res = new StringBuilder();

        while (!stack.isEmpty()) {
            res.insert(0, stack.pop());
        }
        return res.toString();
    }
}