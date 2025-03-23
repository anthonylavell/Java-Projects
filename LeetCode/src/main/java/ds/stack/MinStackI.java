package ds.stack;

import java.util.Arrays;

public class MinStackI {
    private int [] arrayStack;
    int elemCount;
    int minNum;

    public MinStackI() {
        arrayStack = new int[50];
        elemCount = 0;
        minNum = Integer.MAX_VALUE;

    }
    public void push(int val) {
        if(elemCount == arrayStack.length){
            int [] temp = Arrays.copyOf(arrayStack,arrayStack.length*2);
            arrayStack = temp;
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
