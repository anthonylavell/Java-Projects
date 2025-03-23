package challenges.practice_challenge.linked_list.singly;

public class SinglyApp {
    public static void main(String[] args) {
        SinglyLinkedList myList = new SinglyLinkedList();
        myList.insertHead(35);
        myList.insertHead(14);
        myList.insertHead(21);
        /*myList.displayList();
        myList.deleteFirst();
        myList.deleteFirst();
        myList.deleteFirst();*/
        myList.insertTail(11);
        myList.insertTail(12);
        System.out.println(myList.size());

        myList.displayList();

    }


}
