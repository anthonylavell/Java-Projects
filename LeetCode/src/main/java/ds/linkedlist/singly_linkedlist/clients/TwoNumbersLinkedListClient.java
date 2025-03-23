package ds.linkedlist.singly_linkedlist.clients;

import ds.linkedlist.singly_linkedlist.TwoNumbersLinkedList;
import ds.node.singly_node.ListNode;

public class TwoNumbersLinkedListClient {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(5);
        ListNode tempNode = l1;
        ListNode newNode = new ListNode(5);
        tempNode.next = newNode;
        tempNode = tempNode.next;
       /* newNode = new ListNode(3);
        tempNode.next = newNode;
        tempNode = tempNode.next;
        tempNode = l1;*/

        /*while (tempNode != null){
            System.out.println(tempNode.val);
            tempNode = tempNode.next;
        }*/

        ListNode l2 = new ListNode(5);
        /* tempNode = l2;
         newNode = new ListNode(6);
        tempNode.next = newNode;
        tempNode = tempNode.next;
        newNode = new ListNode(4);
        tempNode.next = newNode;
        tempNode = tempNode.next;
        tempNode = l2;*/

       /* while (tempNode != null){
            System.out.println(tempNode.val);
            tempNode = tempNode.next;
        }*/

        TwoNumbersLinkedList list = new TwoNumbersLinkedList();
        list.AddTwoNumbers(l1,l2);

    }
}
