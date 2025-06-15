package comp_p.hubspot;

import java.util.Arrays;

public class MinStack {
    private int [] stack;
    private int minNum;
    private int count;

    public MinStack() {
        this.stack = new int[10];
        this.minNum = Integer.MAX_VALUE;
        this.count = 0;
    }

    public void push(int val) {
        if (count == stack.length){
            reSize();
        }
        minNum = Math.min(minNum,val);
        stack[count++]=val;
    }

    public void pop() {
        if (stack[--count] == minNum){
            findMinNum();
        }
    }

    public int top() {
        return stack[count-1];
    }

    public int getMin() {
        return minNum;
    }

    private void reSize(){
        stack = Arrays.copyOf(stack,stack.length+10);
    }

    private void findMinNum(){
        minNum = Integer.MAX_VALUE;
        for (int index = count-1; index >=0 ; index--)
            minNum = Math.min(stack[index], minNum);
    }


}
