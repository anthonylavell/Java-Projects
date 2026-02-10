package ds.linkedlist.singly_linkedlist.merge_two_sorted_lists;

import ds.node.singly_node.ListNode;

public class MergeLinkedList {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(Integer.MIN_VALUE);
        ListNode current = head;
        while(list1 != null && list2!=null){
            if(list1.val < list2.val){
                current.next = list1;
                list1 = list1.next;
            }else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }
        current.next = list1 != null ? list1 : list2;
        return head.next;
    }
}
