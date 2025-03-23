package challenges.practice_challenge.stack;

import challenges.practice_challenge.node.Node;

public class LinkedLinkStack implements IStack {

    // == fields ==
    private Node top;
    private int length;

    // == constructor ==
    public LinkedLinkStack(){
        this.top = new Node();
        this.length = 0;
    }


    // == methods ==

    @Override
    public boolean empty(){
        return top == null || length <= 0;

    }

    public int length(){
        return length;
    }

    @Override
    public void push(int data){
        Node newNode = new Node();
        newNode.data = data;
        if(empty()){
            top = newNode;
        }else {
            newNode.next = top;
            top = newNode;
        }
        length++;

    }

    public int pop(){
        if(empty()){
            System.out.println("LinkedLinkStack is empty");
            length =0;
            return -1;
        }
        int tempVal = peek();
        Node tempNode = top.next;
        top = tempNode;
        length--;
        return tempVal;
    }

    @Override
    public int peek(){
        if(empty()){
            System.out.println("LinkedLinkStack is empty");
            length=0;
            return -1;
        }
        return top.data;
    }
}
