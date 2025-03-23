package ds.linkedlist.singly_linkedlist.merge_two_sorted_lists;

import ds.node.singly_node.CreateListNode;
import ds.node.singly_node.ListNode;

public class MergeLinkedList2 {
    public static void main(String[] args) {
        ListNode list1 = CreateListNode.makeNodeOdd();
        ListNode list2 = CreateListNode.makeNode2Even();
        mergeTwoLists(list1,list2);
    }
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = null;
        ListNode tail =null;
        while (list1 !=null || list2 != null){
            ListNode tempNode = null;
            if( list1!=null && (list2 ==null ||list1.val <= list2.val)){
                tempNode = list1;
                list1 = list1.next;
            }else {
               tempNode = list2;
                list2 = list2.next;
            }
            if(head == null){
                head = tempNode;
                tail = head;
            }else{
                tail.next = tempNode;
                tail = tail.next;
            }
        }
        return head;

    }
}
