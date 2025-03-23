package leetcode.linkedlist;

import leetcode.node.ListNode;
import leetcode.node.SinglyLinkedList;

public class DuplicateLinkedList {
    public static void main(String[] args) {
        //int [] arr = {1,1,2,3,4,4,5};
        int [] arr = {1,2,1,3,4,5,4};
        ListNode head = SinglyLinkedList.getList(arr);
        ListNode reverseNode = deleteDuplicates(head);
    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode node = head;
        while(head!=null){
           if(head.next == null || head.val != head.next.val){
               head = head.next;
           }else {
               head.next = head.next.next;
           }
        }
        return node;

    }
}
