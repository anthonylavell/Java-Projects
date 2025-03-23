package ds.linkedlist.singly_linkedlist.merge_two_sorted_lists.client;

import ds.linkedlist.singly_linkedlist.SinglyLinkedList;
import ds.linkedlist.singly_linkedlist.merge_two_sorted_lists.MergeLinkedList;
import ds.node.singly_node.ListNode;

public class MergeLinkedListClient {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.append(1);
        list.append(2);
        list.append(4);
        SinglyLinkedList list2 = new SinglyLinkedList();
        list2.append(1);
        list2.append(3);
        list2.append(4);
       /* list.display();
        list2.display();*/
        ListNode mergeLinkedList = MergeLinkedList.mergeTwoLists(list.getList(),list2.getList());
       while (mergeLinkedList != null){
            System.out.println(mergeLinkedList.val);
            mergeLinkedList = mergeLinkedList.next;
        }
    }
}
