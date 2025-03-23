package ds.linkedlist.singly_linkedlist.clients;

import ds.linkedlist.singly_linkedlist.SinglyLinkedList;

public class SinglyLinkedListClient {
    public static void main(String[] args) {
        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(6);
        //System.out.println(linkedList.getList());
        linkedList.display();
        linkedList.insert(2,4);
        linkedList.display();
    }
}
