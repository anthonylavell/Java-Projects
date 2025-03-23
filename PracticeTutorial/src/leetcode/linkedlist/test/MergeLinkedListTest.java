package leetcode.linkedlist.test;

import leetcode.arrays.LinkListToArray;
import leetcode.linkedlist.MergeLinkedList;
import leetcode.node.ListNode;
import leetcode.node.SinglyLinkedList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MergeLinkedListTest {

    @Test
    public void testNonEmptyList(){
        int [] arr1 = {1,2,4};
        int [] arr2 = {1,3,4};
        ListNode list1 = SinglyLinkedList.getList(arr1);
        ListNode list2 = SinglyLinkedList.getList(arr2);
        ListNode resultList = MergeLinkedList.mergeTwoLists(list1,list2);
        int [] resultArr = LinkListToArray.convertLinkListToArray(resultList,(arr1.length+arr2.length));
        int [] testArr = {1,1,2,3,4,4};
        Assertions.assertEquals(Arrays.toString(testArr), Arrays.toString(resultArr));

    }

    @Test
    public void testEmptyList(){
        int [] arr1 = {};
        int [] arr2 = {};
        ListNode list1 = SinglyLinkedList.getList(arr1);
        ListNode list2 = SinglyLinkedList.getList(arr2);
        ListNode resultList = MergeLinkedList.mergeTwoLists(list1,list2);
        int [] resultArr = LinkListToArray.convertLinkListToArray(resultList,(arr1.length+arr2.length));
        int [] testArr = {};
        Assertions.assertEquals(Arrays.toString(testArr), Arrays.toString(resultArr));

    }

    @Test
    public void testOneListEmpty(){
        int [] arr1 = {};
        int [] arr2 = {5,6,7,8};
        ListNode list1 = SinglyLinkedList.getList(arr1);
        ListNode list2 = SinglyLinkedList.getList(arr2);
        ListNode resultList = MergeLinkedList.mergeTwoLists(list1,list2);
        int [] resultArr = LinkListToArray.convertLinkListToArray(resultList,(arr1.length+arr2.length));
        int [] testArr = {5,6,7,8};
        Assertions.assertEquals(Arrays.toString(testArr), Arrays.toString(resultArr));

        int [] arr3 = {1,2,3,4};
        int [] arr4 = {};
        ListNode list3 = SinglyLinkedList.getList(arr3);
        ListNode list4 = SinglyLinkedList.getList(arr4);
        ListNode resultList2 = MergeLinkedList.mergeTwoLists(list3,list4);
        int [] resultArr2 = LinkListToArray.convertLinkListToArray(resultList2,(arr3.length+arr4.length));
        int [] testArr2 = {1,2,3,4};
        Assertions.assertEquals(Arrays.toString(testArr2), Arrays.toString(resultArr2));

    }

}