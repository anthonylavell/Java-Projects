package grinder.heap;

import ds.node.singly_node.ListNode;

import java.util.PriorityQueue;

public class MergeKSortedLists {
    public static void main(String[] args) {
        ListNode[] lists = new ListNode[3];
        int [][] nums = {{1,4,5},{1,3,4},{2,6}};
        int count = 0;
        for (int[]row : nums){
            ListNode head = null;
            ListNode tail = null;
            for (int col:row){
                if (head == null){
                    head = new ListNode(col);
                    tail = head;
                }else {
                    tail.next= new ListNode(col);
                    tail = tail.next;
                }
            }
            lists[count++]=head;
        }
        System.out.println(mergeKLists(lists));
    }
    public static ListNode mergeKLists(ListNode[] lists) {
        ListNode merge = null;
        ListNode tail = null;
        PriorityQueue<Integer>queue = new PriorityQueue<>();
        for (ListNode list : lists){
            while (list!=null){
                queue.add(list.val);
                list = list.next;
            }
        }
        while (!queue.isEmpty()){
            if (merge==null){
                merge = new ListNode(queue.poll());
                tail = merge;
            }else {
                tail.next = new ListNode(queue.poll());
                tail = tail.next;
            }
        }
        return merge;
    }
}
