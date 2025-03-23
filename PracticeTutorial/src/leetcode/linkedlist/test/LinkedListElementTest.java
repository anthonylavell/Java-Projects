package leetcode.linkedlist.test;

import leetcode.arrays.LinkListToArray;
import leetcode.linkedlist.LinkedListElement;
import leetcode.node.ListNode;
import leetcode.node.SinglyLinkedList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class LinkedListElementTest {

    @Test
    public void testNonEmptyList(){
        int [] arr1 = {1};
        ListNode list1 = SinglyLinkedList.getList(arr1);
        ListNode resultList = LinkedListElement.removeElements(list1,2);
        int [] resultArr = LinkListToArray.convertLinkListToArray(resultList,1);
        int [] testArr = {1};
        Assertions.assertEquals(Arrays.toString(testArr), Arrays.toString(resultArr));

        int [] arr2 = {6,1,2,6,3,4,5,6};
        ListNode list2 = SinglyLinkedList.getList(arr2);
        ListNode resultList2 = LinkedListElement.removeElements(list2,6);
        int [] resultArr2 = LinkListToArray.convertLinkListToArray(resultList2,5);
        int [] testArr2 = {1,2,3,4,5};
        Assertions.assertEquals(Arrays.toString(testArr2), Arrays.toString(resultArr2));

        int [] arr3 = {6,6,6};
        ListNode list3 = SinglyLinkedList.getList(arr3);
        ListNode resultList3 = LinkedListElement.removeElements(list3,2);
        int [] resultArr3 = LinkListToArray.convertLinkListToArray(resultList3,0);
        int [] testArr3 = {};
        Assertions.assertEquals(Arrays.toString(testArr3), Arrays.toString(resultArr3));
    }

    @Test
    public void testEmptyList(){
        int [] arr1 = {};
        ListNode list1 = SinglyLinkedList.getList(arr1);
        ListNode resultList = LinkedListElement.removeElements(list1,2);
        int [] resultArr = LinkListToArray.convertLinkListToArray(resultList,0);
        int [] testArr = {};
        Assertions.assertEquals(Arrays.toString(testArr), Arrays.toString(resultArr));
    }

}