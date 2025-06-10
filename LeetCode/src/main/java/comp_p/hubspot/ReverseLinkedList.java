package comp_p.hubspot;

import ds.node.singly_node.CreateListNode;
import ds.node.singly_node.ListNode;

public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode head = reverseList(CreateListNode.makeNode());
        System.out.println(head.val);
        System.out.println(head.next.val);
        System.out.println(head.next.next.val);
    }

    public static ListNode reverseList(ListNode head) {
        ListNode tail = null;
        while (head!=null){
            ListNode tempNode = new ListNode(head.val);
            tempNode.next = tail;
            tail = tempNode;
            head = head.next;
        }
        return tail;
    }
}
