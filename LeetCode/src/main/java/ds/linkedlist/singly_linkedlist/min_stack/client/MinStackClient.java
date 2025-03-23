package ds.linkedlist.singly_linkedlist.min_stack.client;

import ds.linkedlist.singly_linkedlist.min_stack.MinStack;

public class MinStackClient {
    public static void main(String[] args) {
       MinStack obj = new MinStack();
        obj.push(-2);
        obj.push(0);
        obj.push(-3);
        obj.pop();
        obj.pop();
        obj.pop();
        obj.pop();
        int param_3 = obj.top();
        int param_4 = obj.getMin();
        System.out.println(param_3);
        System.out.println(param_4);
    }
}
