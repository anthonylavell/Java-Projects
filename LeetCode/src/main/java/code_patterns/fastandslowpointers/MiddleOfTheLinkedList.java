/*
Given the head of a singly linked list, return the middle node of the linked list.

If there are two middle nodes, return the second middle node.
 */
package code_patterns.fastandslowpointers;

import ds.node.singly_node.CreateListNode;
import ds.node.singly_node.ListNode;

public class MiddleOfTheLinkedList {
    public static void main(String[] args) {
        int [] numbers = {1,2,3,4,5};
        int pos = -1;
        ListNode listNode = CreateListNode.makeCycleNode(numbers,pos);
        ListNode middleNode = middleNode(listNode);
        System.out.println(middleNode);
    }

    public static ListNode middleNode(ListNode head) {
        ListNode tail = head;
        while (tail != null && tail.next != null){
            tail = tail.next.next;
            head = head.next;
        }
        return head;
    }
}
