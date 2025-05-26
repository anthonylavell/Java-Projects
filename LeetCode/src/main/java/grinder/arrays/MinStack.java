package grinder.arrays;

import java.util.Arrays;

public class MinStack {
    private int [] arrayStack;
    private int elemCount;
    private int minNum;

    public MinStack() {
        arrayStack = new int[50];
        elemCount = 0;
        minNum = Integer.MAX_VALUE;
    }

    public void push(int val) {
        if(elemCount == arrayStack.length){
            arrayStack = Arrays.copyOf(arrayStack,arrayStack.length*2);
        }
        arrayStack[elemCount++] = val;
        if(minNum > val){
            minNum = val;
        }

    }

    public void pop() {
        if(arrayStack[--elemCount] == minNum){
            minNum = Integer.MAX_VALUE;
            findMinNum();
        }
    }

    public int top() {
        return arrayStack[elemCount-1];
    }

    public int getMin() {
        return minNum;
    }

    private void findMinNum(){
        for(int i = 0; i < elemCount; i++){
            if(minNum > arrayStack[i]){
                minNum = arrayStack[i];
            }
        }
    }
}
