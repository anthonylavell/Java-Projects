package challenges.amazon_challenge.client;

import challenges.amazon_challenge.linked_list.CircularlyLinkedListSorted;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CircularlyLinkedListSortedClient {
    public static void main(String[] args) {
        CircularlyLinkedListSorted linkedList = new CircularlyLinkedListSorted();
        linkedList.insert(8);
        linkedList.insert(30);
        linkedList.insert(23);
        linkedList.insert(24);
        linkedList.insert(25);
        linkedList.insert(25);
        linkedList.displayNodes();

    }
}
