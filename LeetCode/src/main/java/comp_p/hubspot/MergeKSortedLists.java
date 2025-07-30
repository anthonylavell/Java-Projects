package comp_p.hubspot;

import ds.node.singly_node.CreateListNode;
import ds.node.singly_node.ListNode;

import java.util.PriorityQueue;

public class MergeKSortedLists {
    public static void main(String[] args) {

        ListNode node = CreateListNode.makeNodeOdd();
        ListNode node2 = CreateListNode.makeNode();
        ListNode node3 = null;
        ListNode []lists = {node3,node,node2};
        int i = 0;
        System.out.println(mergeKLists(lists));

    }

    public static ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer>queue = new PriorityQueue<>();
        ListNode mergeList = null;
        ListNode tail = null;
        for (ListNode list : lists){
            while (list!=null){
                queue.add(list.val);
                list = list.next;
            }
        }
        while (!queue.isEmpty()){
            if (mergeList == null){
                mergeList = new ListNode(queue.poll());
                tail = mergeList;
            }else {
                tail.next = new ListNode(queue.poll());
                tail = tail.next;
            }
        }
        return mergeList;
    }
}
