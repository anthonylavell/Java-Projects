package challenges.practice_challenge.stack;

import java.util.Arrays;

public class ArrayStack implements IStack {
    private Integer [] intOfarrays;
    private int length;

    public ArrayStack(){
        this.intOfarrays = new Integer[5];
        this.length = 0;
    }

    @Override
    public boolean empty(){
        return length <= 0;
    }

    public int length(){
        return length;
    }

    @Override
    public void push(int data){
        if(length >= intOfarrays.length){
            reSizeArray();
        }
        intOfarrays[length] = data;
        length++;
    }

    private void reSizeArray(){
        Integer [] tempArray = Arrays.copyOf(intOfarrays,(intOfarrays.length*2));
        intOfarrays = tempArray;
    }

    @Override
    public int peek(){
        if(empty()){
            System.out.println("LinkedLinkStack is empty");
            length =0;
            return -1;
        }
        return intOfarrays[length-1];
    }

    @Override
    public int pop(){
        if(empty()){
            System.out.println("LinkedLinkStack is empty");
            length =0;
            return -1;
        }
        int tempNum = peek();
        intOfarrays[length] = null;
        length--;

        return tempNum;
    }
}
