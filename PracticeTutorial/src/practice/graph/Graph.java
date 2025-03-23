package practice.graph;

import java.util.Iterator;
import java.util.LinkedList;

public class Graph {
    private LinkedList<Integer>[] adjLists;
    private boolean visited[];

    // Graph creation
    public Graph(int vertices) {
        adjLists = new LinkedList[vertices];
        visited = new boolean[vertices];
        for (int i = 0; i < vertices; i++)
            adjLists[i] = new LinkedList<Integer>();
    }
    // Add edges
    public void addEdge(int src, int dest) {
        adjLists[src].add(dest);
    }

    // DFS algorithm
    public void traversal(int vertex) {
        visited[vertex] = true;
        System.out.print(vertex + " ");

        Iterator<Integer> ite = adjLists[vertex].listIterator();
        while (ite.hasNext()) {
            int adj = ite.next();
            if (!visited[adj])
                traversal(adj);
        }
    }
}
