package ds.linkedlist.singly_linkedlist.clients;

import ds.node.singly_node.ListNode;

public class OddLinkedListClient {
    public static void main(String[] args) {

        ListNode linkedList = new ListNode(1);
        ListNode linkedList2 = new ListNode(2);
        ListNode list = linkedList;
        ListNode list2 = linkedList2;
        for(int i = 2; i <=3; i++){
            ListNode tempNode = new ListNode(i);
            list.next = tempNode;
            list = list.next;
        }
        list = linkedList;
        for(int i = 2; i <=3; i++){
            if(i != 3) {
                ListNode tempNode = new ListNode(i);
                list2.next = tempNode;
                list2 = list2.next;
            }else {
                list2.next = list;
                list2 = list2.next;
            }
            list= list.next;
        }

       // ListNode lists = linkedList.next;
       /* ListNode lists = OddLinkedList.oddEvenList(linkedList);
        while (lists != null){
            System.out.println(lists.val);
            lists = lists.next;
        }*/


        while (linkedList != null){
            System.out.println("list1 "+linkedList.val);
            System.out.println("list2 "+linkedList2.val);
            linkedList = linkedList.next;
            linkedList2 = linkedList2.next;
        }



    }
}
