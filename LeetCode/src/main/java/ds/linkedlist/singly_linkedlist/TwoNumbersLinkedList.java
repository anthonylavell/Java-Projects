package ds.linkedlist.singly_linkedlist;

import ds.node.singly_node.ListNode;

public class TwoNumbersLinkedList {
    private ListNode headNode;
    private ListNode tailNode;
    public ListNode AddTwoNumbers(ListNode l1, ListNode l2) {
        int remainder = 0;
        while (l1 != null || l2 != null){
            int num1 = (l1 != null) ? l1.val : 0;
            int num2 = (l2 != null) ? l2.val : 0;
            if((l1 != null))
            l1 =  l1.next;

            if((l2 != null))
            l2 = l2.next;
            int sum = (num1 + num2)+remainder;
            remainder = 0;
            if(sum >=10){
                remainder = sum /10;
                sum %=10;
            }
            insertTail(sum);
            if(remainder >0 && (l1 == null && l2 == null)){
                insertTail(remainder);
            }

        }
        return headNode;
    }

    private void insertTail(int data){
        if(headNode == null){
            headNode = new ListNode(data);
            tailNode = headNode;
            return;
        }
        ListNode newNode = new ListNode(data);
        ListNode tempNode = tailNode;
        tailNode = newNode;
        tempNode.next = tailNode;
    }

    public void displayNode(ListNode list){
        ListNode tempNode = list;
        while(tempNode !=null){
            System.out.print(tempNode.val+" ");
            tempNode = tempNode.next;
        }
    }
}
