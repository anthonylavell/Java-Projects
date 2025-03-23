package practice.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Stack;

public class DFSGraph {
    //Adjacency list representation
    // array[1] -> list[..] - adjacent vertices for vertex 1
    private ArrayList<Integer>[] graph;
    private int v;
    private boolean visited[];

    public static void main(String[] args) {
        DFSGraph g = new DFSGraph(13);
        g.addEdge(1,2);
        g.addEdge(1,3);
        g.addEdge(1,5);
        g.addEdge(2,4);
        g.addEdge(2,10);
        g.addEdge(2,5);
        g.addEdge(2,7);
        g.addEdge(3,6);
        g.addEdge(4,7);
        g.addEdge(5,2);
        g.addEdge(5,8);
        g.addEdge(6,9);
        g.addEdge(8,11);
        g.addEdge(11,12);
        System.out.println("DFS traversal - recursive");
        g.dfsTraversal(1);

        System.out.println("\n\nDFS traversal - iterative");
        g.dfsTraversalIterator(1);



    }

    //Graph Constructor
    DFSGraph(int vertices){
        v = vertices;
        graph = new ArrayList[v];
        visited = new boolean[v];

        for(int i = 0; i < v; i++){
            graph[i] = new ArrayList<>();
        }
    }
    //adding edge
    void addEdge(int src, int dest){
        graph[src].add(dest);
    }

    void dfsTraversal(int vertex){
        visited[vertex] = true;
        System.out.print(vertex + " ");
        Iterator<Integer> i = graph[vertex].listIterator();
        while (i.hasNext()){
            int adj = i.next();
            if(!visited[adj]){
                dfsTraversal(adj);
            }
        }
    }

    //DFS iterative
    void dfsTraversalIterator(int s){
        Arrays.fill(visited,false);
        Stack<Integer> stack = new Stack<>();
        stack.push(s);
        while (!stack.empty()){
            s = stack.pop();
            if(!visited[s]){
                System.out.print(s+ " ");
                visited[s] = true;
            }
            Iterator<Integer> itr = graph[s].iterator();
            while (itr.hasNext()){
                int v = itr.next();
                if(!visited[v]){
                    stack.push(v);
                }
            }
        }
    }
}
