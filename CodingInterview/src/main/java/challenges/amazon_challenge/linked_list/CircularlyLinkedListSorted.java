package challenges.amazon_challenge.linked_list;

import challenges.amazon_challenge.node.linked_list_node.Node;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CircularlyLinkedListSorted {

    // == fields ==
    private Node headNode;
    private Node tailNode;

    // == constructor ==
    public CircularlyLinkedListSorted(){
        headNode = null;
        tailNode = null;
    }

    // == methods ==

    public void insert(int data){
        Node newNode = new Node();
        newNode.data = data;
        if(headNode == null){
            headNode = newNode;
            tailNode = headNode;
        }else {
            if(data < headNode.data){
                insertAtBegin(newNode);
            } else if(data > tailNode.data){
                insertAtEnd(newNode);
            }else {
                insertAfterBegin(newNode);
            }
        }
    }

    private void insertAtBegin(Node newNode){
        Node tempNode = headNode;
        tempNode.previous = newNode;
        headNode = newNode;
        headNode.next = tempNode;
    }

    private void insertAfterBegin(Node newNode){
        Node tempNode = headNode;
        while(tempNode.next != null){
            if(newNode.data < tempNode.next.data){
                newNode.next = tempNode.next;
                tempNode.next = newNode;
                break;
            }
            tempNode = tempNode.next;
        }
    }

    private void insertAtEnd(Node newNode){
        Node tempNode = tailNode;
        tailNode = newNode;
        tempNode.next = tailNode;
        tailNode.previous = tempNode;
    }

    public void displayNodes(){
        Node tempNode = headNode;
        while (tempNode != null){
            tempNode.displayNode();
            tempNode = tempNode.next;
        }
    }


}
