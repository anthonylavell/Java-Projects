package challenges.practice_challenge.linked_list.doubly;

public class DoublyApp {
    public static void main(String[] args) {
        DoublyLinkedList myList = new DoublyLinkedList();
        myList.insertHead(35);
        myList.insertHead(14);
        myList.insertHead(21);
        myList.insertHead(41);
        myList.insertAfterKey(41,20);
        myList.displayListForward();

        myList.insertAtIndex(3,23);

        myList.removeFirstNode();
        myList.removeFirstNode();
        myList.removeFirstNode();

        myList.insertTail(11);
        myList.insertTail(12);
        myList.displayListForward();

       // myList.removeNodeAtKey(11);
        //myList.removeNodeAtKey(20);
        myList.removeNodeAtIndex(2);

        /*myList.removeLastNode();
        myList.removeLastNode();
        myList.removeLastNode();*/

        System.out.println(myList.size());
        myList.displayListForward();
        myList.displayListBackWard();
    }


}
