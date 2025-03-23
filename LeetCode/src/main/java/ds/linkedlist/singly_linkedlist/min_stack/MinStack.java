package ds.linkedlist.singly_linkedlist.min_stack;

import ds.node.singly_node.ListNode;

public class MinStack {
    private ListNode headNode;
    private ListNode sortNode;
    /** initialize your data structure here. */
    public MinStack() {
        headNode = null;
        sortNode = null;
    }

    public void push(int x) {
        ListNode newNode = new ListNode(x);
        if(headNode == null){
            headNode = newNode;
            sortNode = headNode;
        }else {
            newNode.next = headNode;
            headNode = newNode;
            sortedNode(x);
        }

    }
    private void sortedNode(int x){
            ListNode newNode = new ListNode(x);
            if (x <= sortNode.val) {
                newNode.next = sortNode;
                sortNode = newNode;
            } else {
                ListNode tempNode = sortNode;
                while (tempNode.next != null) {
                    if (x < tempNode.next.val) {
                        newNode.next = tempNode.next;
                        tempNode = newNode;
                        break;
                    }
                    tempNode = tempNode.next;
                }
            }
    }

    public void pop() {
        if(headNode == null){
            throw new NullPointerException("Add to the stack");
        }
            popSortNode( headNode.val);
            headNode = headNode.next;
    }
    private void popSortNode(int x){
        if(x == sortNode.val){
            sortNode = sortNode.next;
            return;
        }
        ListNode tempNode = sortNode;
        while (tempNode.next != null){
            if(x == tempNode.next.val){
                tempNode = tempNode.next.next;
                 break;
            }
            tempNode = tempNode.next;
        }
    }

    public int top() {
        if(headNode == null){
            throw new NullPointerException("Add to the Stack");
        }
        return headNode.val;

    }

    public int getMin() {
        if(headNode == null){
            throw new NullPointerException("Add to the Stack");
        }
        return sortNode.val;
    }
}
