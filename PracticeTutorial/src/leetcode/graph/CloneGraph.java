package leetcode.graph;

import java.util.Iterator;

public class CloneGraph {
    public static void main(String[] args) {
        Node first  = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        fourth.neighbors.add(0,first);
        fourth.neighbors.add(1,third);
        third.neighbors.add(0,second);
        third.neighbors.add(1,fourth);
        second.neighbors.add(0,first);
        second.neighbors.add(1, third);
        first.neighbors.add(0, second);
        first.neighbors.add(1,fourth);
        cloneGraph(first);
    }
    public static Node cloneGraph(Node node) {
        Node cloneGraph = node;
        System.out.println(node.val);
        System.out.println(node.neighbors.get(0).val+" "+node.neighbors.get(1).val);

        System.out.println(node.neighbors.get(0).val);
        System.out.println(node.neighbors.get(0).neighbors.get(0).val+" "+node.neighbors.get(0).neighbors.get(1).val);

        System.out.println(node.neighbors.get(1).val);
        System.out.println(node.neighbors.get(1).neighbors.get(0).val+" "+node.neighbors.get(1).neighbors.get(1).val);

        System.out.println(node.neighbors.get(1).neighbors.get(1).val);
        System.out.println(node.neighbors.get(1).neighbors.get(1).neighbors.get(0).val+" "+node.neighbors.get(1).neighbors.get(1).neighbors.get(1).val);

        Iterator<Node> i = cloneGraph.neighbors.listIterator();

        return cloneGraph;
    }
}
