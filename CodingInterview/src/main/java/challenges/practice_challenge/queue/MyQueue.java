package challenges.practice_challenge.queue;

import challenges.practice_challenge.stack.IStack;

/*
   Implement Queue using Stack interface.
 */

class Node{
    int data;
    Node next;
}

public class MyQueue implements IStack {

    // == fields ==
    private Node first;
    private Node last;
    private int size;

    // == constructor ==
    public MyQueue(){
        first = new Node();
        last = new Node();
        size =0;
    }

    // == methods ==
    @Override
    public void push(int data) {
        Node newNode = new Node();
        newNode.data = data;
        if(empty()){
            first = newNode;
            last = newNode;
        }else{
            last.next = newNode;
            last = last.next;
        }
        size++;
    }

    @Override
    public int pop() {
        Node tempNode = first;
        first = first.next;
        size--;
        return tempNode.data;
    }

    @Override
    public int peek() {
        return first.data;
    }

    @Override
    public boolean empty() {
        return size <= 0;
    }
}
