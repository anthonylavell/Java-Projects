package challenges.practice_challenge.linked_list.singly;

import challenges.practice_challenge.node.Node;

public class SinglyLinkedList {

    // == fields ==
    private Node first;
    private Node last;
    private int size = 0;

    // == methods ==
    public boolean isEmpty (){
        return (first == null);
    }

    public void insertHead(int data){
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = first;
        if(isEmpty()){
            first = newNode;
            last = first;
        }else {
            first = newNode;
        }
        size++;
    }

    public void insertTail(int data){
        if(isEmpty()){
            insertHead(data);
        }else {
            Node current = last;
            Node newNode = new Node();
            newNode.data = data;
            current.next = newNode;
            last = current.next;
            size++;
        }
    }

    public Node deleteFirst(){
        // Since it deleting from the top the tail is not effected.
        if(isEmpty()){
            last = first;
            size = 0;
            return null;
        }
        Node temp = first;
        first = first.next;
        size--;
        return temp;
    }

    public int size(){
        return size;
    }

    public void displayList(){
        System.out.println("List (first --> last ");
        Node current = first;
        while (current !=null){
            current.displayNode();
            current = current.next;
        }

        System.out.println();
    }
}
