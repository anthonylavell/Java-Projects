package leetcode.node.main;

import leetcode.node.ListNode;

public class ReverseMain {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode tempNode = head;
        for(int x = 2; x < 6; x++){
            ListNode node = new ListNode(x);
            tempNode.next = node;
            tempNode = tempNode.next;
        }
        System.out.println(Reverse.reverseList(head));
    }
}
