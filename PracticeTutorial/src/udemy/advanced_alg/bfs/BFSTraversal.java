package udemy.advanced_alg.bfs;

import practice.graph.Node;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class BFSTraversal {
    public static void traversal(Node root){
        Queue<Node> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        queue.add(root);
        visited.add(root.id);
        while (!queue.isEmpty()){
            Node tempNode = queue.remove();
            System.out.println("Visited: " + tempNode);
            for(Node node : tempNode.adjacent){
                if(!visited.contains(node.id)){
                    visited.add(node.id);
                    queue.add(node);
                }
            }
        }
    }
}
