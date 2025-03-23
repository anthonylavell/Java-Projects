package ds.stack;

import java.util.*;

public class MinStack {
    private Stack<Integer> minStack;
    private int minElem;
    public MinStack() {
        minStack = new Stack<>();
        minElem = Integer.MAX_VALUE;
    }

    public void push(int val) {
        minStack.add(val);
        if(minElem > val){
            minElem = val;
        }
    }

    public int pop() {
       int tempNum = minStack.pop();
       if(tempNum == minElem){
           getNewMin();
       }
       return tempNum;
    }

    public int top() {
        return minStack.peek();
    }

    public int getMin() {
        return minElem;
    }

    private void getNewMin(){
        minElem = (minStack.size() != 0) ? Collections.min(minStack) : Integer.MAX_VALUE;
    }
}
