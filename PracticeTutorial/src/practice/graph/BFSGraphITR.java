package practice.graph;

import leetcode.graph.Node;

import java.util.*;

public class BFSGraphITR {

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
        searchGraph(first);
    }

    public static void searchGraph(Node node){
        Queue<Node> queueOfNodes = new LinkedList<>();
        queueOfNodes.add(node);
        Set<Integer> setOfIntegers = new HashSet<>();
        while (!queueOfNodes.isEmpty()){
            Node tempNode = queueOfNodes.poll();
            setOfIntegers.add(tempNode.val);
            System.out.println("Visited: "+tempNode);
            for(Node n : tempNode.neighbors){
                if(!setOfIntegers.contains(n.val)){

                    setOfIntegers.add(n.val);
                    queueOfNodes.add(n);
                }
            }
        }

    }
}
