package code_patterns.fastandslowpointers;

import ds.node.singly_node.CreateListNode;
import ds.node.singly_node.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListCycleTest {

    @Test
    void hasCycle() {
        int [] numbers = {3,2,0,-4};
        int pos = 1;
        ListNode listNode = CreateListNode.makeCycleNode(numbers,pos);
        assertTrue(LinkedListCycle.hasCycle(listNode));
    }

    @Test
    void hasNoCycle() {
        int [] numbers = {1,1,1,1};
        int pos = -1;
        ListNode listNode = CreateListNode.makeCycleNode(numbers,pos);
        assertFalse(LinkedListCycle.hasCycle(listNode));

        int [] numbers2 = {1,2};
        ListNode listNode2 = CreateListNode.makeCycleNode(numbers2,pos);
        assertFalse(LinkedListCycle.hasCycle(listNode2));
    }


}