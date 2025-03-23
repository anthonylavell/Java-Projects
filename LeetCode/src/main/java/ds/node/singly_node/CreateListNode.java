package ds.node.singly_node;

public class CreateListNode {
    public static void main(String[] args) {
        makeNodeOdd();
    }

    public static ListNode makeNode(){
        ListNode head = null;
        ListNode tail = null;
        for(int i = 1; i < 6; i++){
            ListNode temp = new ListNode(i);
            if(head == null){
                head= temp;
                tail = head;
                continue;
            }
            tail.next = temp;
            tail = tail.next;
        }
        return head;
    }

    public static ListNode makeNode(int num){
        ListNode head = null;
        ListNode tail = null;
        for(int i = 1; i < 6; i++){
            ListNode temp = new ListNode(i);
            if(head == null){
                head= temp;
                tail = head;
                continue;
            }
            tail.next = temp;
            tail = tail.next;
        }
        return head;
    }
    public static ListNode makeNodeOdd(){
        ListNode head = null;
        ListNode tail = null;
        int number = 3;
        for(int i = 0; i < 5; i++){
            ListNode temp = new ListNode(number);
            number+=2;
            if(head == null){
                head= temp;
                tail = head;
                continue;
            }
            tail.next = temp;
            tail = tail.next;
        }
        return head;
    }

    public static ListNode makeNode2Even(){
        ListNode head = null;
        ListNode tail = null;
        int number = 0;
        for(int i = 0; i < 3; i++){
            ListNode temp = new ListNode(number);
            number+=2;
            if(head == null){
                head= temp;
                tail = head;
                continue;
            }
            tail.next = temp;
            tail = tail.next;
        }
        return head;
    }

    public static ListNode makeCycleNode(int[] number,int pos){
        ListNode head = null;
        ListNode tail = null;
        ListNode cycle = null;
        for(int i = 0; i < number.length; i++){
            ListNode temp = new ListNode(number[i]);
            if (i == number.length-1) {
                temp.next = cycle;
            }
            if(head == null){
                head= temp;
                tail = head;
            }else {
                tail.next = temp;
                tail = tail.next;
            }
            if(i == pos){
                cycle = tail;
            }
        }
        return head;
    }

}
