package leetcode.linkedlist.test;

import leetcode.arrays.LinkListToArray;
import leetcode.linkedlist.SinglyList;
import leetcode.node.ListNode;
import leetcode.node.SinglyLinkedList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class SinglyListTest {

    @Test
    public void testNonEmptyReverseLinkedList(){
        int [] arr1 = {1,2,3,4,5};
        ListNode list1 = SinglyLinkedList.getList(arr1);
        ListNode resultList = SinglyList.reverseList(list1);
        int [] resultArr = LinkListToArray.convertLinkListToArray(resultList,5);
        int [] testArr = {5,4,3,2,1};
        Assertions.assertEquals(Arrays.toString(testArr), Arrays.toString(resultArr));

        int [] arr2 = {6,6,6};
        ListNode list2 = SinglyLinkedList.getList(arr2);
        ListNode resultList2 = SinglyList.reverseList(list2);
        int [] resultArr2 = LinkListToArray.convertLinkListToArray(resultList2,3);
        int [] testArr2 = {6,6,6};
        Assertions.assertEquals(Arrays.toString(testArr2), Arrays.toString(resultArr2));

        int [] arr3 = {1,2};
        ListNode list3 = SinglyLinkedList.getList(arr3);
        ListNode resultList3 = SinglyList.reverseList(list3);
        int [] resultArr3 = LinkListToArray.convertLinkListToArray(resultList3,2);
        int [] testArr3 = {2,1};
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