package leetcode.linkedlist.test;

import leetcode.arrays.LinkListToArray;
import leetcode.linkedlist.DuplicateLinkedList;
import leetcode.linkedlist.SinglyList;
import leetcode.node.ListNode;
import leetcode.node.SinglyLinkedList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class DuplicateLinkedListTest {

    @Test
    public void testNonEmptyReverseLinkedList(){
        int [] arr1 = {1,1,2,3,3,4,5,5};
        ListNode list1 = SinglyLinkedList.getList(arr1);
        ListNode resultList = DuplicateLinkedList.deleteDuplicates(list1);
        int [] resultArr = LinkListToArray.convertLinkListToArray(resultList,5);
        int [] testArr = {1,2,3,4,5};
        Assertions.assertEquals(Arrays.toString(testArr), Arrays.toString(resultArr));

        int [] arr2 = {6,6,6};
        ListNode list2 = SinglyLinkedList.getList(arr2);
        ListNode resultList2 = DuplicateLinkedList.deleteDuplicates(list2);
        int [] resultArr2 = LinkListToArray.convertLinkListToArray(resultList2,1);
        int [] testArr2 = {6};
        Assertions.assertEquals(Arrays.toString(testArr2), Arrays.toString(resultArr2));

        int [] arr3 = {1,1,2,3,3};
        ListNode list3 = SinglyLinkedList.getList(arr3);
        ListNode resultList3 = DuplicateLinkedList.deleteDuplicates(list3);
        int [] resultArr3 = LinkListToArray.convertLinkListToArray(resultList3,3);
        int [] testArr3 = {1,2,3};
        Assertions.assertEquals(Arrays.toString(testArr3), Arrays.toString(resultArr3));
    }

    @Test
    public void testEmptyReverseLinkedList() {
        int[] arr1 = {};
        ListNode list1 = SinglyLinkedList.getList(arr1);
        ListNode resultList = SinglyList.reverseList(list1);
        int[] resultArr = LinkListToArray.convertLinkListToArray(resultList, arr1.length);
        int[] testArr = {};
        Assertions.assertEquals(Arrays.toString(testArr), Arrays.toString(resultArr));
    }


}