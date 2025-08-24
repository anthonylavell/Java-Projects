package comp_p.capital_one.powerday;

import ds.node.doubly_linked.DoublyNode;

public class CustomStack {
    private DoublyNode head;
    private DoublyNode tail;
    int maxSize;
    int count;
    public CustomStack(int maxSize) {
        this.head = null;
        this.tail = null;
        this.maxSize = maxSize;
        this.count = 0;
    }

    public void push(int x) {
        if (count < maxSize) {
            DoublyNode newNode = new DoublyNode(x);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                newNode.prev = tail;
                tail.next = newNode;
                tail = tail.next;
            }
            count++;
        }
    }

    public int pop() {
        int tempNum = -1;
        if (tail!=null){
            tempNum = tail.val;
            tail = tail.prev;
            count--;
        }
        if (tail == null){
            head = null;
        }
        return tempNum;
    }

    public void increment(int k, int val) {
        DoublyNode tempNode = head;
        int len = Math.min(k,count);
        while (tempNode!=null && len-- > 0){
                tempNode.val = tempNode.val + val;
                tempNode = tempNode.next;
        }
    }
}
