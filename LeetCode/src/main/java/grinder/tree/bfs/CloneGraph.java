package grinder.tree.bfs;

import ds.node.singly_node.Node;

import java.util.*;

public class CloneGraph {
    public static void main(String[] args) {

    }

    public static Node cloneGraph(Node node) {
        if(node == null){
            return node;
        }
        if(node.neighbors.isEmpty()){

            return new Node(1);
        }
        Map<Node,Node>mapOfClones = new HashMap<>();
        Deque<Node>deque = new ArrayDeque<>();
        deque.add(node);
        mapOfClones.put(node,new Node(node.val));
        Node key = node;
       while (!deque.isEmpty()){
           Node root = deque.pop();
           for (Node neighbor : root.neighbors){
               if (!mapOfClones.containsKey(neighbor)) {
                   deque.add(neighbor);
                   mapOfClones.put(neighbor,new Node(neighbor.val));
               }
               mapOfClones.get(root).neighbors.add(mapOfClones.get(neighbor));

           }
       }

        return mapOfClones.get(key);
    }
}
