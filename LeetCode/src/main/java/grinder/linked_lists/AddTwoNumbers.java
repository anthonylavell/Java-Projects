/*
You are given two non-empty linked lists representing two non-negative integers. The digits
are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers
and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example 1:
Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.
Example 2:

Input: l1 = [0], l2 = [0]
Output: [0]
Example 3:

Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]
 */
package grinder.linked_lists;

import ds.node.singly_node.ListNode;

public class AddTwoNumbers {
    public static void main(String[] args) {
        System.out.println(10%10);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode tail = null;
        ListNode rem = null;
        while (l1 != null || l2!=null){
            int subtotal = 0;
            if (l1!=null){
                subtotal+=l1.val;
                l1 =l1.next;
            }
            if (l2!=null){
                subtotal+=l2.val;
                l2 =l2.next;
            }
            if (rem!=null ){
                subtotal+=rem.val;
                rem =rem.next;
            }
            if (subtotal>9){
                rem = new ListNode(subtotal/10);
                subtotal%=10;
            }
            if (head==null){
                head = new ListNode(subtotal);
                tail = head;
            }else {
                tail.next = new ListNode(subtotal);
                tail = tail.next;
            }

        }
        if (rem!=null ){
            tail.next = rem;
        }

        return head;
    }
}
