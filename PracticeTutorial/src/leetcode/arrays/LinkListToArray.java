package leetcode.arrays;

import leetcode.node.ListNode;

public class LinkListToArray {
    public static int[] convertLinkListToArray(ListNode node, int size) {
        int [] arr = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = node.val;
            node = node.next;
        }
        return arr;
    }
}
