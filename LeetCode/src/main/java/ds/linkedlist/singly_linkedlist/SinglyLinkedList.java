package ds.linkedlist.singly_linkedlist;

import ds.node.singly_node.ListNode;

public class SinglyLinkedList {
    private ListNode headNode;
    private ListNode tailNode;

    public void append(int val){
        ListNode newNode = new ListNode(val);
        if(headNode == null){
            headNode = newNode;
            tailNode = headNode;
        }else {
            tailNode.next = newNode;
            tailNode = tailNode.next;
        }
    }

    public void prepend(int val){
        ListNode newNode = new ListNode(val);
        if(tailNode == null) {
            tailNode = newNode;
        }
        newNode.next = headNode;
        headNode = newNode;
    }

    public void insert(int index, int val){
        ListNode tempNode = headNode;
        ListNode previousNode = null;
        int count = 0;
        while (tempNode !=null){
            if(count == index){
                ListNode shiftNode = new ListNode(val);
                shiftNode.next = tempNode;
                previousNode.next=shiftNode;
                break;
            }
            previousNode = tempNode;
            tempNode = tempNode.next;
            count++;
        }

    }

    public ListNode getList(){
        return headNode;
    }

    public void display(){
        ListNode tempNode = headNode;
        while (tempNode != null){
            System.out.print(tempNode.val + " ");
            tempNode = tempNode.next;
        }
        System.out.println("");
    }
}
