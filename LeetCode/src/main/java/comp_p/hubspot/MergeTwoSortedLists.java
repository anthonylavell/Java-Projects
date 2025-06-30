package comp_p.hubspot;

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
        while (list1 != null || list2 != null){
            ListNode tempNode = new ListNode();
            if (list1 == null || (list2 != null && list2.val <= list1.val)){
                tempNode.val = list2.val;
                list2 = list2.next;
            }else {
                tempNode.val = list1.val;
                list1 = list1.next;
            }
            if (mergeLists==null){
                mergeLists = tempNode;
                tail = mergeLists;
            }else {
                tail.next = tempNode;
                tail = tail.next;
            }
        }
        return mergeLists;
    }
}
