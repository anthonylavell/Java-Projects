package code.pattern.two_pointers;

import code.pattern.node.Node;

public class MiddleOfTheLinkedList {
    public static int middleOfLinkedList(Node<Integer> head) {
        // WRITE YOUR BRILLIANT CODE HERE
        Node<Integer> tail = head;
        while (tail != null && tail.next != null){
            tail = tail.next.next;
            head = head.next;
        }
        return (head!=null) ? head.val : 0;
    }
}
