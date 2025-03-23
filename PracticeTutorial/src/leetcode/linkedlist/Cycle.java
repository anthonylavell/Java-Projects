package leetcode.linkedlist;

import leetcode.node.ListNode;

public class Cycle {
    public static void main(String[] args) {
        ListNode node = setUpCycle(1,4);
        /*for(int i = 5; i >0; i--){
            ListNode tempNode = new ListNode(i,node);
            node = tempNode;
            System.out.println(i);
        }*/
        System.out.println(hasCycle(node));
    }
    public static boolean hasCycle(ListNode head) {
        /*ListNode fastNode = head;
        ListNode normalNode = head;
        while (fastNode !=null && fastNode.next!=null){
            fastNode = fastNode.next.next;
            normalNode = normalNode.next;
            if(fastNode == normalNode){
                return true;
            }
        }*/
        for(int i = 0; i < 6; i++){
            System.out.println(head.val);
            head.val = -1;
            head = head.next;
        }
        while (head !=null){
            head.val = -1;
            head = head.next;
            if(head.val == -1){
                return true;
            }
        }
        return false;
    }
    public static ListNode setUpCycle(int pos, int count){
        ListNode tempNode = null;
        ListNode head = null;
        ListNode node = null;
        for(int i = 0; i <count; i++){
            if(i == 0){
                node = new ListNode((i+1),null);
                head= node;
                continue;
            }
            ListNode help = new ListNode((i+1),null);
            node.next = help;
            node = node.next;
            if(pos==i){
                tempNode = node;
            }
            if(i == 3 && tempNode!=null){
                node.next = tempNode;
            }
        }

        int i = 0;
        return head;
    }
}
