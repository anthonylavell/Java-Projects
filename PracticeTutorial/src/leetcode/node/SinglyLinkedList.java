package leetcode.node;

public class SinglyLinkedList {
    public static void main(String[] args) {

    }
    public static ListNode getList(int [] arr) {
        ListNode tempList = null;
        ListNode node = null;
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                tempList = new ListNode(arr[i], null);
                node = tempList;
                continue;
            }
            ListNode tempNode = new ListNode(arr[i], null);
            tempList.next = tempNode;
            tempList = tempList.next;
        }
        return node;
    }
}
