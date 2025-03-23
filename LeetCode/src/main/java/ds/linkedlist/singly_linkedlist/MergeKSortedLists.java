package ds.linkedlist.singly_linkedlist;

import ds.node.singly_node.ListNode;

import java.util.PriorityQueue;

public class MergeKSortedLists {
    public static void main(String[] args) {

    }
    public static ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0 || lists[0] == null){
            return new ListNode();
        }
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (ListNode list : lists){
            while (list!=null){
                queue.add(list.val);
                list = list.next;
            }
        }
        ListNode node = null;
        ListNode tail = null;
        while (!queue.isEmpty()){
            if(node == null){
                node = new ListNode(queue.poll());
                tail = node;
            }
            ListNode temp = new ListNode(queue.poll());
            tail.next = temp;
            tail = tail.next;
        }
        return node;
    }
}
