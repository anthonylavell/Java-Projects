package grinder.linked_lists;

import ds.node.singly_node.ListNode;

public class MergeTwoSortedLists {
    public static void main(String[] args) {

    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode mergeList = null;
        ListNode tailList = null;
        while (list1 != null || list2 != null) {
            ListNode tempNode = null;
            if(list2 == null || (list1!=null && list1.val<= list2.val)){
                tempNode = new ListNode(list1.val);
                list1 = list1.next;
            }else {
                tempNode = new ListNode(list2.val);
                list2 = list2.next;
            }
            if(mergeList == null){
                mergeList = tempNode;
                tailList = mergeList;
            }else {
                tailList.next = tempNode;
                tailList = tailList.next;
            }
        }
        return mergeList;
        }


    }
