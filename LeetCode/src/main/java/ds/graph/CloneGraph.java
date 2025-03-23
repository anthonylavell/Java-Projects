package ds.graph;

import ds.node.singly_node.Node;

import java.util.*;

public class CloneGraph {
    public static void main(String[] args) {

    }
    public static Node cloneGraph(Node node) {
        if(node == null){
            return node;
        }
        Queue<Node> queueOfNodes = new LinkedList<>();
        Map<Node, Node> hashMapOfNodes = new HashMap<>();
        queueOfNodes.add(node);
        hashMapOfNodes.put(node,new Node(node.val));
        while (!queueOfNodes.isEmpty()){
            Node currentNode = queueOfNodes.remove();
            for(Node neighbor : currentNode.neighbors){
                if(!hashMapOfNodes.containsKey(neighbor)){
                    queueOfNodes.add(neighbor);
                    hashMapOfNodes.put(neighbor,new Node(neighbor.val));
                }
                hashMapOfNodes.get(currentNode).neighbors.add(hashMapOfNodes.get(neighbor));
            }
        }
        hashMapOfNodes.forEach((k,v) -> {
            System.out.println(k.val);
            Node currentNode = k;
            for(Node neighbor : currentNode.neighbors){
                System.out.print(neighbor.val+", ");
            }
            System.out.println(" ");
        });
        return hashMapOfNodes.get(node);
    }
}
