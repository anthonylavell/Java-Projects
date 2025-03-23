package ds.linkedlist.singly_linkedlist;

import ds.node.singly_node.ListNode;

public class LinkedListCycle {
    public static void main(String[] args) {


    }

    public static boolean hasCycle(ListNode head) {
        ListNode tail = head;
        while (tail !=null && tail.next !=null){
            head = head.next;
            tail = tail.next.next;
            if(head.equals(tail)){
                return true;
            }
        }
        return false;
    }

    public ListNode detectCycle(ListNode head) {
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
