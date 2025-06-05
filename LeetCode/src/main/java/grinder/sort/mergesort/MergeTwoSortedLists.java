package grinder.sort.mergesort;

import ds.node.singly_node.CreateListNode;
import ds.node.singly_node.ListNode;

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        ListNode list1 = CreateListNode.makeNodeOdd();
        ListNode list2 = CreateListNode.makeNode();
        System.out.println(mergeTwoLists(list1,list2));

    }
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode mergeLists = null;
        ListNode tail = null;
        while (list1 != null || list2 !=null){
            ListNode temp = null;
            if (list2 == null || (list1!=null) && list1.val < list2.val){
                temp = new ListNode(list1.val);
                list1 = list1.next;
            }else {
                temp = new ListNode(list2.val);
                list2 = list2.next;
            }
            if (mergeLists==null){
                mergeLists = temp;
                tail = temp;
                continue;
            }
            tail.next=temp;
            tail = tail.next;
        }
        return mergeLists;
    }
}
