package grinder.linked_lists;

import ds.node.singly_node.ListNode;

public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        ListNode tailNode = head;
        while (tailNode !=null && tailNode.next != null ){
            tailNode = tailNode.next.next;
            if(tailNode == head){
                return true;
            }
            head = head.next;
        }
        return false;
    }
}
