package ds.linkedlist.singly_linkedlist;

import ds.node.singly_node.ListNode;

public class middleLinkedList {

    public ListNode middleNode(ListNode head) {
        ListNode [] arrayOfNodes = new ListNode[100];
        int count =0;
        while(head!=null){
            arrayOfNodes[count] = head;
            head = head.next;
            count++;
        }
        return arrayOfNodes[(count/2)];
    }



}
