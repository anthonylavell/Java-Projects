package ds.linkedlist.singly_linkedlist.merge_two_sorted_lists;

import ds.node.singly_node.ListNode;

public class MergeLinkedList {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null){
            return l2;
        }else  if(l2 == null){
            return l1;
        }
       ListNode head = null;
       if(l1.val <= l2.val){
           head = l1;
           l1 = l1.next;
       }else{
           head = l2;
           l2 = l2.next;
       }
        ListNode tail = head;
        while(l1 != null || l2 != null){
            if(l1 == null){
                tail = insertTail(l2, tail);
                l2 = l2.next;
            }else if(l2 == null){
                tail = insertTail(l1, tail);
                l1 = l1.next;
            }else {
                if(l1.val <= l2.val){
                    tail = insertTail(l1, tail);
                    l1 = l1.next;
                }else {
                    tail = insertTail(l2, tail);
                    l2 = l2.next;
                }
            }
        }
        return head;
    }
    private static ListNode insertTail(ListNode currentNode, ListNode tail){
        tail.next = currentNode;
        tail = tail.next;
        return tail;
    }
}
