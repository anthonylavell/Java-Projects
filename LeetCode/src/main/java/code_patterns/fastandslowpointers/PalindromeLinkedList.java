/*
Given the head of a singly linked list, return true if it is a
palindrome
 or false otherwise.
 */
package code_patterns.fastandslowpointers;

import ds.node.singly_node.CreateListNode;
import ds.node.singly_node.ListNode;

public class PalindromeLinkedList {
    public static boolean isPalindrome(ListNode head) {
        ListNode tempNode = head;
        ListNode middleNode = head;
        while (tempNode.next!=null && tempNode.next.next !=null){
            tempNode= tempNode.next.next;
            middleNode = middleNode.next;
        }
        ListNode reverseNode = null;
        while (middleNode!=null){
            tempNode = middleNode.next;
            middleNode.next = reverseNode;
            reverseNode = middleNode;
            middleNode = tempNode;
        }
        while (head!=null && reverseNode!=null){
            if (head.val != reverseNode.val){
                return false;
            }
            head = head.next;
            reverseNode = reverseNode.next;
        }
        return true;
    }

    public static void main(String[] args) {
        int [] numbers = {1,2,2,1};
        int pos = -1;
        ListNode listNode = CreateListNode.makeCycleNode(numbers,pos);
        System.out.println(isPalindrome2(listNode));
    }

    public static boolean isPalindrome2(ListNode head) {
        int [] arrayOfIntegers = new int[100000];
        int count = 0;
        while (head!=null) {
            arrayOfIntegers[count++] = head.val;
            head = head.next;
        }
        int length = count /2;
        count--;
        for(int index = 0; index < length; index++){
            if(arrayOfIntegers[index] != arrayOfIntegers[count--]){
                return false;
            }
        }
        return true;
    }
}
