package leetcode.linkedlist.test;

import leetcode.linkedlist.Cycle;
import leetcode.node.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CycleTest {
    @Test
    public void testCycleWithTrue(){
        ListNode node = Cycle.setUpCycle(1,4);
        Assertions.assertTrue(Cycle.hasCycle(node));
    }

    @Test
    public void testCycleWithFalse(){
        ListNode node = Cycle.setUpCycle(-1,1);
        Assertions.assertFalse(Cycle.hasCycle(node));

    }

}