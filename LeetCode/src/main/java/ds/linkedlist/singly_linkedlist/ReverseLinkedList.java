package ds.linkedlist.singly_linkedlist;

import ds.node.singly_node.ListNode;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode reverseNode=null;
        while (head!=null){
            ListNode tempNode = new ListNode(head.val);
                tempNode.next = reverseNode;
                reverseNode = tempNode;
        }

        return reverseNode;
    }
}
