package grinder.sort;

import ds.node.singly_node.ListNode;

import java.util.PriorityQueue;

public class MergeKSortedLists {
    public static void main(String[] args) {

    }

    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (ListNode node : lists){
            while (node != null){
                queue.add(node.val);
                node = node.next;
            }
        }
        ListNode mergeNode = null;
        ListNode tail = null;
        while (!queue.isEmpty()){
            if (mergeNode == null){
                mergeNode = new ListNode(queue.poll());
                tail = mergeNode;
                continue;
            }
                tail.next = new ListNode(queue.poll());
                tail = tail.next;
        }
        return mergeNode;
    }
}
