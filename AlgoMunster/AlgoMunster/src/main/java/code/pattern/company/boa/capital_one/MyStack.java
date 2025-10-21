package code.pattern.company.boa.capital_one;

import java.util.ArrayDeque;
import java.util.Deque;

public class MyStack {
    private Deque<Integer> stack;
    public MyStack() {
        stack = new ArrayDeque<>();
    }

    public void push(int x) {
        Deque<Integer>deque = new ArrayDeque<>();
        deque.add(x);
        while (!stack.isEmpty()){
            deque.add(stack.poll());
        }
        stack = deque;
    }

    public int pop() {
        if (stack.isEmpty()){
            return 0;
        }
        return stack.poll();
    }

    public int top() {
        if (stack.isEmpty()){
            return 0;
        }
        return stack.peek();
    }

    public boolean empty() {
        return stack.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
