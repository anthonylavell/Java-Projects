package leetcode.node.main;

import leetcode.node.ListNode;

import java.util.ArrayList;
import java.util.List;

public class FindMiddleNode {
    public static void main(String[] args) {
        ListNode head =new ListNode() ;
        for(int i = 6; i > 0; i--) {
            if(i ==6){
                head.val = i;
                continue;
            }
            ListNode tempNode = new ListNode(i, head);
            head = tempNode;
        }
        ListNode node = middleNode(head);
        System.out.println("node = " + node.val);

    }
    public static ListNode middleNode(ListNode head) {
        List<Integer> listOfNodes = InsertNodeToList(head);
        for(int i =(listOfNodes.size() -1); i >= listOfNodes.size()/2; i-- ){
            if(i ==listOfNodes.size() -1){
                ListNode tempNode = new ListNode(listOfNodes.get(i));
                head = tempNode;
                continue;
            }
            ListNode tempNode = new ListNode(listOfNodes.get(i),head);
            head = tempNode;
        }
        return head;
    }
    private static List<Integer>InsertNodeToList(ListNode head){
        List<Integer> listOfNodes = new ArrayList<>();
        while (head!=null){
            listOfNodes.add(head.val);
            head = head.next;
        }
        return listOfNodes;
    }
}
