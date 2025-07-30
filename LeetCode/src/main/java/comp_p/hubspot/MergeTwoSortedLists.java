package comp_p.hubspot;

import ds.node.singly_node.CreateListNode;
import ds.node.singly_node.ListNode;

import java.util.PriorityQueue;

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        ListNode list1 = CreateListNode.makeNodeOdd();
        ListNode list2 = CreateListNode.makeNode();
        System.out.println(mergeTwoLists(list1,list2));

    }
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode mergeList = null;
        ListNode tail = null;
        while (list1!=null || list2!=null){
            ListNode tempNode;
            if (list2==null || (list1!=null) && list1.val < list2.val){
                tempNode = new ListNode(list1.val);
                list1 =list1.next;
            }else {
                tempNode = new ListNode(list2.val);
                list2 = list2.next;
            }
            if (mergeList ==null){
                mergeList = tempNode;
                tail = mergeList;
            }else {
                tail.next = tempNode;
                tail = tail.next;
            }
        }
        return mergeList;
    }

    public static ListNode mergeTwoLists2(ListNode list1, ListNode list2) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        ListNode mergeList = null;
        ListNode tail = null;
        while (list1 != null || list2!=null) {
            if (list1 != null) {
                queue.add(list1.val);
                list1 = list1.next;
            }
            if (list2 != null) {
                queue.add(list2.val);
                list2 = list2.next;
            }
        }
        while (!queue.isEmpty()) {
            if (mergeList == null) {
                mergeList = new ListNode(queue.poll());
                tail = mergeList;
            } else {
                tail.next = new ListNode(queue.poll());
                tail = tail.next;
            }
        }
        return mergeList;
    }
}
