class MyQueue {
    Stack<Integer> fs = new Stack<>();
    Stack<Integer> sc = new Stack<>();

    public MyQueue() {

    }

    public void push(int x) {
        fs.push(x);
    }

    public int pop() {
        // empty first stack and put values in second
        while (fs.size() > 0) {
            sc.push(fs.pop());

        }
        // now pop the top value from sc 
        int val = sc.pop();
        // reset again all values to stack 1
        while (sc.size() > 0) {
            fs.push(sc.pop());

        }
        return val;
    }

    public int peek() {
        // copy all values from stack 1 to second stack
        while (fs.size() > 0) {
            sc.push(fs.pop());
        }
        int val = sc.peek();
        // reassign all values to stack 1
        while (sc.size() > 0) {
            fs.push(sc.pop());
        }
        return val;
    }

    public boolean empty() {
        if (fs.size() > 0) {
            return false;
        }
        return true;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */