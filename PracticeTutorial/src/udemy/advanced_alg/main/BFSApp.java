package udemy.advanced_alg.main;

import udemy.advanced_alg.bfs.BFSTraversal;
import practice.graph.Node;

public class BFSApp {
    public static void main(String[] args) {
        Node node = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

        node.adjacent.add(node2);
        node.adjacent.add(node4);

        node2.adjacent.add(node);
        node2.adjacent.add(node3);

        node3.adjacent.add(node2);
        node3.adjacent.add(node4);

        node4.adjacent.add(node);
        node4.adjacent.add(node3);

        BFSTraversal.traversal(node);



    }
}
