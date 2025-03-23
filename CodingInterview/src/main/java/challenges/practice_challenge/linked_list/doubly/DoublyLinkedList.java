package challenges.practice_challenge.linked_list.doubly;

import challenges.practice_challenge.node.Node;

public class DoublyLinkedList {

    // == fields ==
    private Node first;
    private Node last;
    private int size = 0;

    // == methods ==
    public boolean isEmpty (){
        return (first == null || size <=0);
    }

    public int size(){
        return size;
    }

    public void insertHead(int data){
        Node newNode = new Node();
        newNode.data = data;
        // *** every time the insertHead method is call, the new challenges.practice_challenge.node next will point to the old challenges.practice_challenge.node address *** 21->14->35->null ***
        newNode.next = first;
        if(isEmpty()){
            // *** if Empty both first and last to point to the first entry. last should not change until entry is from the tail ***
            first = newNode;
            last = first;
        }else {
            // *** point the old challenges.practice_challenge.node previous to the new challenges.practice_challenge.node address ***
            first.previous = newNode;
            // *** have first challenges.practice_challenge.node point to the new challenges.practice_challenge.node address ***
            first = newNode;
        }
        size++;
    }

    public void insertTail(int data){
        if(isEmpty()){
            insertHead(data);
        }else {
            Node newNode = new Node();
            newNode.data = data;
            // *** have the new Node previous point to last challenges.practice_challenge.node address ***
            newNode.previous = last;
            // *** to keep the link, have the last challenges.practice_challenge.node next point to the new challenges.practice_challenge.node address 35->11->12 last challenges.practice_challenge.node would be 12
            last.next = newNode;
            // *** now that old knows the new challenges.practice_challenge.node address and new challenges.practice_challenge.node knows the old challenges.practice_challenge.node address, have last challenges.practice_challenge.node point to new challenges.practice_challenge.node address but only if you are insert to tail
            last = newNode;
            size++;
        }
    }

    public void insertAfterKey(int key, int data){
        if(isEmpty()){
            insertHead(data);
        }else if(last.data == key) {
           insertTail(data);
        }else {
            Node tempNode = first;
            while (tempNode.data != key){
                tempNode = tempNode.next;
                if(tempNode == null){
                    System.out.println("Key not found");
                    return;
                }
            }

            // *** store tempNode.next the address
            Node rightNode = tempNode.next;

            Node newNode =  new Node();
            newNode.data = data;

            // *** Point newNode.previous to tempNode address ** //
            newNode.previous = tempNode;

            // *** Point newNode.next to rightNode address ** //
            newNode.next= rightNode;

            // *** point rightNode.previous and tempNode.next to newNode address to

            rightNode.previous = newNode;
            tempNode.next = newNode;

            size++;
        }
    }

    public void insertAtIndex(int index, int data){
        if(index <0 || index > size){
            System.out.println(index+" Do not exist, please pick index between 0 and "+size);
            return;
        }

        if(index == 0 || isEmpty()){
            insertHead(data);
        }else if(index == size){
            insertTail(data);
        }else {
            index--;
            Node current = findNode(first,index);
            insertAfterKey(current.data,data);
        }
    }

    public Node removeFirstNode(){
        // Since it deleting from the top the tail is not effected.
        if(isEmpty()){
            size = 0;
           return null;
        }
            Node temp = first;
            first = first.next;
            first.previous = null;
            size--;
            return temp;
    }

    public Node removeLastNode(){
        // Since it deleting from the top the tail is not effected.
        if(isEmpty()){
            size = 0;
            return null;
        }
        Node temp = last;
        last = last.previous;
        last.next=null;
        size--;
        return temp;
    }

    public String removeNodeAtKey(int key){
        if(isEmpty()){
            displayListForward();
            return null;
        }
        if(key == first.data){
            removeFirstNode();
        }else if(key == last.data){
            removeLastNode();
        }else {
            Node current = first;
            while (current.data != key){
                current = current.next;
                if(current == null){
                    return "Key not found";
                }
            }
                Node previousNode = current.previous;
                Node nextNode = current.next;
                previousNode.next = nextNode;
                nextNode.previous = previousNode;
                size--;

        }
        return key+" was removed";
    }

    public void removeNodeAtIndex(int index){
        if(isEmpty()){
            displayListForward();
            return;
        }

        if(index <0 || index > size){
            System.out.println(index+ " Do not exist");
            return;
        }

        if(index == 0){
            removeFirstNode();
        }else if(index == size){
            removeLastNode();
        }else {
            Node current = findNode(first, index);
            removeNodeAtKey(current.data);
        }
    }

    private Node findNode(Node current, int index){
        int count =0;
        while (count < index){
            current = current.next;
            count++;
        }

        return current;
    }

    public void displayListForward(){
        if(isEmpty()){
            System.out.println("List is Empty");
            return;
        }
        System.out.println("List (first --> last ");
        Node current = first;
        while (current !=null){
            current.displayNode();
            current = current.next;
        }

        System.out.println();
    }

    public void displayListBackWard(){
        if(isEmpty()){
            System.out.println("List is Empty");
            return;
        }
        System.out.println("List (last --> first ");
        Node current = last;

        while (current !=null){
            current.displayNode();
            current = current.previous;
        }

        System.out.println();
    }
}
