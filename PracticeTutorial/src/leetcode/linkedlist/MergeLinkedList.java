package leetcode.linkedlist;

import leetcode.node.ListNode;
import leetcode.node.SinglyLinkedList;

public class MergeLinkedList {
    public static void main(String[] args) {
        int [] arr1 = {};
        int [] arr2 = {};
        ListNode list1 = SinglyLinkedList.getList(arr1);
        ListNode list2 = SinglyLinkedList.getList(arr2);
        ListNode resultList = mergeTwoLists(list1,list2);


    }
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode resultList = null;
        ListNode node = null;
        while (list1!=null || list2!=null){
            int val = 0;
            if(list2 == null || ( list1 != null && list1.val < list2.val)){
                val = list1.val;
                list1 = list1.next;
            }else {
                val = list2.val;
                list2 = list2.next;
            }
            if(node == null){
                node = new ListNode(val,null);
                resultList = node;
                continue;
            }
            ListNode tempNode = new ListNode(val,null);
            node.next = tempNode;
            node = node.next;
        }
        int i = 0;
        return resultList;
    }
}
