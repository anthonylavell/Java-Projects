
/*
Given the head of a linked list, return the node where the cycle begins.
If there is no cycle, return null.

There is a cycle in a linked list if there is some node in the list that
can be reached again by continuously following the next pointer. Internally,
pos is used to denote the index of the node that tail's next pointer is
connected to (0-indexed). It is -1 if there is no cycle. Note that pos is not
passed as a parameter.

Do not modify the linked list.
 */
package code_patterns.fastandslowpointers;

import ds.node.singly_node.CreateListNode;
import ds.node.singly_node.ListNode;

public class LinkedListCycleII {
    public static void main(String[] args) {
        int [] numbers = {3,2,0,-4};
        int pos = 0;
        ListNode listNode = CreateListNode.makeCycleNode(numbers,pos);
        ListNode cycleNode = detectCycle(listNode);
        System.out.println(cycleNode);
    }

    public static ListNode detectCycle(ListNode head) {
        ListNode fastNode = head;
        ListNode slowNode = head;
        while (fastNode != null && fastNode.next !=null){
            fastNode = fastNode.next.next;
            slowNode = slowNode.next;
            if(slowNode == fastNode){
                ListNode current = head;
                while (current != slowNode){
                    current = current.next;
                    slowNode = slowNode.next;
                }
                return slowNode;
            }

        }

        return null;
    }
}
