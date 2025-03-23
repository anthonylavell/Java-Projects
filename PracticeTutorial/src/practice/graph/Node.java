package practice.graph;

import java.util.LinkedList;

public class Node {
    public int id;
    public LinkedList<Node> adjacent = new LinkedList<>();
    public Node(int id){
        this.id = id;
    }

    @Override
    public String toString() {
        return String.valueOf(id);
    }
}
