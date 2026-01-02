package grinder;

import java.util.*;

class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}

public class Practice {
    public Node cloneGraph(Node node) {
        if (node==null){
            return null;
        }
        Map<Node,Node>nodeMap = new HashMap<>();
        Deque<Node>deque =new ArrayDeque<>();
        deque.add(node);
        nodeMap.put(node,new Node(node.val));
        while (!deque.isEmpty()){
            Node key = deque.poll();
            List<Node> neighbors = key.neighbors;
            for (Node neighbor: neighbors){
                if (!nodeMap.containsKey(neighbor)){
                    deque.add(neighbor);
                    nodeMap.put(neighbor, new Node(neighbor.val));
                }
                nodeMap.get(key).neighbors.add(nodeMap.get(neighbor));
            }
        }
        return nodeMap.get(node);
    }

    public static void main(String[] args) {
        Practice practice = new Practice();


    }
}
