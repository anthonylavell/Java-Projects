package code_patterns.In_place_reversal_linked_list;

import ds.node.singly_node.CreateListNode;
import ds.node.singly_node.ListNode;

public class ReverseLinkedListII {
    public static void main(String[] args) {
        ListNode node = CreateListNode.makeNode(5);
        ListNode revNode = reverseLinkedList(node);
        ListNode copyNode = copyLinkedList(node);
        ListNode reverseBetweenNode = reverseBetween(node,1,4);
        System.out.println(node);
    }

    public static ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode tail = null;
        ListNode previous = null;
        ListNode front = null;

        int count = 1;
        while (head!=null){
            ListNode newNode = new ListNode(head.val);
            if(previous==null) {
                front = newNode;
                tail = newNode;
                previous = newNode;
            } else if (count>left && count <=right) {
                ListNode tempNode = (left == 1) ? previous :previous.next;
                newNode.next = tempNode;
                if(left == 1){
                    previous = newNode;
                    front = previous;
                }else {
                    previous.next = newNode;
                }

            }else {
                tail.next = newNode;
                if(count <= left){
                    previous = tail;
                }
                tail = tail.next;
            }
            count++;
            head = head.next;
        }
        return front;
    }



    public static ListNode reverseLinkedList(ListNode head) {
        ListNode tail = null;
        ListNode previous = null;
        while (head!=null){
            ListNode newNode = new ListNode(head.val);
            if(previous==null){
                tail = newNode;
                previous = tail;
            }else {
                ListNode tempNode = previous;
                previous = newNode;
                previous.next = tempNode;
            }
            tail = previous;
            head = head.next;
        }
        return tail;
    }

    public static ListNode copyLinkedList(ListNode head) {
        ListNode tail = null;
        ListNode previous = null;
        while (head!=null){
            ListNode newNode = new ListNode(head.val);
            if(previous==null){
                tail = newNode;
                previous = newNode;
            }else {
                previous.next = newNode;
                previous = previous.next;
            }
            head = head.next;
        }
        return tail;
    }
}
