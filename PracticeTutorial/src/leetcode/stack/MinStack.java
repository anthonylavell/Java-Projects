package leetcode.stack;

import leetcode.node.ListNode;

public class MinStack {
    /** initialize your data structure here. */
    ListNode stackNode;
    ListNode orderedStackNode;
    public MinStack() {
        stackNode = null;
    }

    public void push(int x) {
        if(stackNode == null){
            stackNode = new ListNode(x);
            orderedStackNode = stackNode;
        }else {
            ListNode node = new ListNode(x);
            node.next = stackNode;
            stackNode = node;
            sortNode(x);
        }

    }

    private void sortNode(int x){
       if(x <= orderedStackNode.val){
           ListNode node = new ListNode(x);
           node.next = orderedStackNode;
           orderedStackNode = node;

       }else {
           ListNode node = orderedStackNode;
           while (node != null) {
               if (node.next == null) {
                   ListNode tempNode = new ListNode(x);
                   node.next = tempNode;
                   break;
               }
               else if (x <= node.next.val) {
                   ListNode tempNode = new ListNode(x);
                   tempNode.next = node.next;
                   node.next = tempNode;
                   break;
               }
               node = node.next;
           }
       }
    }

    public void pop() {
        remove(stackNode.val);
        stackNode = stackNode.next;
    }

    private void remove(int x){
        if(x == orderedStackNode.val){
            orderedStackNode = orderedStackNode.next;
        }else {
            ListNode node = orderedStackNode;
            while (node != null) {
                if (x == node.val) {
                    ListNode tempNode = node.next;
                    node = tempNode;
                    break;
                }
                node = node.next;
            }
        }
    }

    public int top() {

        return stackNode.val;
    }

    public int getMin() {

      return orderedStackNode.val;

    }

}
