package challenges.practice_challenge.graph;

public class TestGraph {


    public static void main(String[] args) {
           Graph graph = new Graph(5);
           graph.addEdge(1, 3);
           graph.addEdge(1, 4);
           graph.addEdge(2, 5);
           graph.addEdge(2, 6);
           graph.addEdge(3, 7);
           graph.addEdge(4, 8);
           graph.addEdge(0, 1);
           graph.addEdge(0, 2);
           graph.showConnections();


    }
}
