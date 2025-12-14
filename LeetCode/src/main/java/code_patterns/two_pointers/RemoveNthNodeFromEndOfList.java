package code_patterns.two_pointers;

import ds.node.singly_node.ListNode;

public class RemoveNthNodeFromEndOfList {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode right = head;
        ListNode left = head;
        int rightCount = 0;
        int leftCount = 0;
        while (right != null || left!=null){
            if (right!=null){
                right = right.next;
                rightCount++;
            }else {
                if (leftCount +1 == (rightCount-n) ){
                    ListNode temp = left.next;
                    left.next = temp.next;
                }
                left = left.next;
                if (leftCount==(rightCount-n)&&leftCount==0){
                    head = left;
                }
                leftCount++;
            }
        }
        return head;
    }
}
