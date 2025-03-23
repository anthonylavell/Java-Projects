package challenges.practice_challenge.queue;

import challenges.practice_challenge.node.Node;

public class LinkedListQueue implements IQueue {

    // == fields ==
    private Node first;
    private Node last;
    private int length;

    // == constructor ==
    public LinkedListQueue(){
        this.first = new Node();
        this.length = 0;
    }

    // == methods ==
    @Override
    public boolean isEmpty() {
        return length <= 0;
    }

    @Override
    public void enqueue(int data) {
        Node newNode = new Node();
        newNode.data = data;
        if(isEmpty()){
            first = newNode;
            last = newNode;
        }else {
            last.next=newNode;
            last = last.next;
        }
        length++;
    }

    @Override
    public int peek() {
        if(isEmpty()){
           return emptyQueue();
        }
        return first.data;
    }

    @Override
    public int dequeue() {
        if(isEmpty()){
            return emptyQueue();
        }
        Node current = first;
        first = first.next;
        length--;
        return current.data;
    }

    private int emptyQueue(){
        System.out.println("The challenges.practice_challenge.queue is Empty");
        length =0;
        return -1;

    }
}
