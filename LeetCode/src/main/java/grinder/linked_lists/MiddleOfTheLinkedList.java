package grinder.linked_lists;

import ds.node.singly_node.ListNode;

public class MiddleOfTheLinkedList {

    public static void main(String[] args) {

    }

    public static ListNode middleNode(ListNode head) {
        ListNode tail = head;
        while (tail!=null && tail.next!=null){
            head = head.next;
            tail = tail.next.next;
        }
        return head;
    }

    public static ListNode middleNode2(ListNode head) {
        int count = 0;
        ListNode temp = head;
        while (temp!=null){
            count++;
            temp = temp.next;
        }
        count/=2;
        while (count-->=0){
            head = head.next;
        }
        return head;
    }
}
