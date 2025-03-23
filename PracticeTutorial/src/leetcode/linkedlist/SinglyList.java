package leetcode.linkedlist;

import leetcode.node.ListNode;

import java.util.Stack;

public class SinglyList {
    public static void main(String[] args) {
       // int [] arr = {1,2,3,4,5};
       // ListNode head = SinglyLinkedList.getList(arr);
       // ListNode reverseNode = reverseList(head);
        Stack<Integer>stack = new Stack<>();
        stack.insertElementAt(1,0);
        stack.insertElementAt(2,0);
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
    }
    public static ListNode reverseList(ListNode head) {
        ListNode node = null;
       while (head!=null){
           ListNode tempNode = new ListNode(head.val);
           tempNode.next=node;
           node=tempNode;
           head = head.next;
       }
       int i =0;
       return node;
    }

    /*public static ListNode helpReverseList(){

    }*/
}
