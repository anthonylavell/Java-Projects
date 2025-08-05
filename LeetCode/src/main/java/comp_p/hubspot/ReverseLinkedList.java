package comp_p.hubspot;

import ds.node.singly_node.CreateListNode;
import ds.node.singly_node.ListNode;

public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode head = reverseList(CreateListNode.makeNode());
        System.out.println(head.val);
        System.out.println(head.next.val);
        System.out.println(head.next.next.val);
        reverseList(head);
    }

    public static ListNode reverseList(ListNode head) {
       ListNode tail = null;
       while (head !=null){
           if (tail == null){
               tail = new ListNode(head.val);
           }else {
               ListNode forward = new ListNode(head.val);
               forward.next = tail;
               tail = forward;
           }
           head = head.next;
       }
       int i = 0;
       return tail;
    }

    public static ListNode reverseList2(ListNode head) {
        if (head == null){
            return head;
        }
        ListNode tail =reverseList2(head.next);
        if (tail == null){
            tail = new ListNode(head.val);
        }else {
            ListNode tempNode = new ListNode(head.val);
            tempNode.next = tail;
            tail = tempNode;
        }
        return tail;
    }
}
