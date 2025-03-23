package ds.linkedlist.singly_linkedlist.merge_two_sorted_lists.client;

import ds.linkedlist.singly_linkedlist.merge_two_sorted_lists.MergeLinkedList2;
import ds.node.singly_node.CreateListNode;
import ds.node.singly_node.ListNode;

public class MergeLinkedListClient2 {
    public static void main(String[] args) {
        ListNode list1 = CreateListNode.makeNodeOdd();
        ListNode list2 = CreateListNode.makeNode2Even();
        ListNode resultNode = MergeLinkedList2.mergeTwoLists(list1,list2);
    }
}
