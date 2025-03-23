package ds.linkedlist.singly_linkedlist;

import ds.node.singly_node.CreateListNode;
import ds.node.singly_node.ListNode;

public class ReverseLinkedListII {
    public static void main(String[] args) {
        ListNode node = CreateListNode.makeNode();
        int left = 2;
        int right = 4;
        node = reverseBetween2(node, left,right);
    }

    public static ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode current =null;
        ListNode tail = head;
        ListNode reverseNode = null;
        ListNode previous= head;
        int counter = 1;
        while (head!=null){
            ListNode helper = head.next;
             if(counter>=left && counter <= right){
                head.next = reverseNode;
                reverseNode = head;
                if(counter == left){
                    tail = reverseNode;
                }
                if(counter == right){
                    if(current == null){
                        current = reverseNode;
                    }else {
                        previous.next = reverseNode;
                    }

                }
            } else {
                    if(current == null){
                        current = head;
                    }else {
                        tail.next = head;
                        tail = tail.next;
                        previous = previous.next;
                    }

            }
            head = helper;
           counter++;
        }
        return current;
    }

    public static ListNode reverseBetween2(ListNode head, int left, int right) {
        ListNode dummyNode = new ListNode(14);
        dummyNode.next = head;
        ListNode prevNode = dummyNode;
        for(int i = 0; i < left-1; i++){
            prevNode = prevNode.next;
        }
        ListNode currentNode = prevNode.next;
        for(int i = 0; i < (right-left); i++){
            ListNode forwardNode = currentNode.next;
            currentNode.next = forwardNode.next;
            forwardNode.next = prevNode.next;
            prevNode.next = forwardNode;
        }
        return dummyNode.next;
    }
}
