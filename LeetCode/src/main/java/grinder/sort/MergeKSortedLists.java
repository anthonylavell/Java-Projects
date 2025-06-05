package grinder.sort;

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
        System.out.println(mergeKLists2(lists));

    }

    public static ListNode mergeKLists(ListNode[] lists) {
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

    public static ListNode mergeKLists2(ListNode[] lists) {
        ListNode mergeNode = null;
        for (int index = 1; index < lists.length; index++){
            ListNode tempNode = (mergeNode!=null) ? mergeNode : lists[index-1];
            if (tempNode != null && lists[index] !=null){
                mergeNode = merge(tempNode,lists[index]);
            }else if (mergeNode == null && lists[index]==null && tempNode != null){
                mergeNode = tempNode;
            }else if (mergeNode == null && lists[index]!=null && tempNode == null){
                mergeNode = lists[index];
            }

        }
        return lists.length ==1 ? lists[0] : mergeNode;
    }

    private static ListNode merge(ListNode node, ListNode node2){
        ListNode head = null;
        ListNode tail = null;
        while (node!=null || node2!=null){
            ListNode temp = null;
            if(node2 ==null || (node!=null) && node.val < node2.val){
                temp = new ListNode(node.val);
                node = node.next;
            }else {
                temp = new ListNode(node2.val);
                node2 = node2.next;
            }
            if (head ==null){
                head = temp;
                tail = temp;
            }else {
                tail.next = temp;
                tail = tail.next;
            }
        }
        return head;
    }
}
