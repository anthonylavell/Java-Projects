package leetcode.node;

public class NodeRemove {
    public static void main(String[] args) {
        ListNode head = null;
        int n = 1;
        for(int i = 5; i >0; i--){
            ListNode tempNode = new ListNode(i,head);
            head = tempNode;
        }
        removeNthFromEnd(head,n);
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode tempNode = new ListNode(0,head);
        ListNode firstNode = tempNode;
        ListNode secondNode = tempNode;
        for(int i = 1; (i <= n+1); i++){
            firstNode=firstNode.next;
        }
        while (firstNode!=null){
            firstNode = firstNode.next;
            secondNode = secondNode.next;
        }
        secondNode.next= secondNode.next.next;
        return tempNode.next;
    }
}
