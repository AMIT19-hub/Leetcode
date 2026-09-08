class Solution {
    public int minAddToMakeValid(String s) {
        int count = 0;

        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
                count+=1;
            } else {
                if (ch == ')') {
                    if (!stack.isEmpty() && stack.peek() == '(') {
                        stack.pop();
                        count-=1;
                    } else {
                        count += 1;
                    }
                }
                if (ch == '}') {
                    if (!stack.isEmpty() && stack.peek() == '{') {
                        stack.pop();
                    } else {
                        count += 1;
                    }
                }
                if (ch == ']') {
                    if (!stack.isEmpty() && stack.peek() == '[') {
                        stack.pop();
                    } else {
                        count += 1;
                    }
                }
            }

        }
        return count;
    }
}