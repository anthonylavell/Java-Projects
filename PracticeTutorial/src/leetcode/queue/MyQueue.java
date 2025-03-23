package leetcode.queue;

import java.util.Stack;

public class MyQueue {
    private Stack<Integer> stack;
    public MyQueue() {
        stack = new Stack<>();
    }

    public void push(int x) {
        stack.insertElementAt(x,0);
    }

    public int pop() {
        return stack.pop();

    }

    public int peek() {
        return stack.peek();
    }

    public boolean empty() {
        return stack.isEmpty();
    }
}
