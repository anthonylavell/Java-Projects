package leetcode.linkedlist;

import leetcode.node.ListNode;
import leetcode.node.SinglyLinkedList;

public class LinkedListElement {
    public static void main(String[] args) {
        //int [] arr = {6,1,2,6,3,4,5,6};
        //int [] arr = {6,6,6};
        //int [] arr = {};
        int [] arr = {1};
        ListNode head = SinglyLinkedList.getList(arr);
        int val = 2;
        removeElements(head,val);
        int i =9;

    }
    public static ListNode removeElements(ListNode head, int val) {
        ListNode node = null;
        while (head!=null ){
            if(head.val == val){
                head = head.next;
                continue;
            }
            if(node == null){
                node = head;
            }
            if(head.next!= null && head.next.val == val ){
                head.next = head.next.next;
            }else {
                head = head.next;
            }
        }
        int i =0;
        return node;
    }
}
