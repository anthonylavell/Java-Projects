package challenges.amazon_challenge.node.linked_list_node;

public class Node {
    // == fields ==
    public int data;
    public Node next = null;
    public Node previous = null;

    // == methods ==
    public void displayNode(){
        System.out.println("{ "+data+" }");
    }
}
