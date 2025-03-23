package ds.stack;

public class Stack {
    private int maxSize;
    private long[] stackArray;
    private int top; //index position of last number

    public Stack(int size){
        this.maxSize = size;
        this.stackArray = new long[maxSize];
        this.top = -1;
    }

    public void push(long j){
        if(isFull()){
            System.out.println("Stack is full");
        }else {
            top++;
            stackArray[top] = j;
        }

    }

    public long pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return 0;
        } else {
            int oldTop = top;
            top--;
            return stackArray[oldTop];
        }
    }

    public long peek(){
        return stackArray[top];
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isFull(){
        return (top == (maxSize -1));
    }
}
