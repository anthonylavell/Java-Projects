package leetcode.node.main;

import leetcode.node.ListNode;

public class Reverse {
    private ListNode node = null;
    public static ListNode reverseList(ListNode head) {
        ListNode tail = null;
        while (head !=null){
            if(tail == null){
                tail = new ListNode(head.val);
            }else {
                ListNode tempNode = new ListNode(head.val);
                tempNode.next = tail;
                tail = tempNode;
            }
            head = head.next;
        }
        System.out.println(tail);
        return tail;
    }


}
