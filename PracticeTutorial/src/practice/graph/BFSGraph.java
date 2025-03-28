package practice.graph;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class BFSGraph {
    //Adjacency list representation
    // array[1] -> list[..] - adjacent vertices for vertex 1
    private ArrayList<Integer>[] graph;
    private int v;
    private boolean visited[];

    public static void main(String[] args) {
        BFSGraph g = new BFSGraph(12);
        g.addEdge(1,2);
        g.addEdge(2,6);
        g.addEdge(6,8);
        g.addEdge(1,3);
        g.addEdge(8,10);
        g.addEdge(1,4);
        g.addEdge(3,7);
        g.addEdge(2,5);
        g.addEdge(6,9);
        g.addEdge(3,6);
        g.addEdge(8,11);
        g.addEdge(5,8);
        g.addEdge(7,9);

        g.bfsTraversal(1);
    }

    //Graph Constructor
    BFSGraph(int vertices){
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

    //BFS
    void bfsTraversal(int s){
        LinkedList<Integer> queue = new LinkedList<>();
        //adding first node
        queue.add(s);
        visited[s] = true;

        while (queue.size() != 0){
            int current = queue.poll();
            Iterator<Integer> itr = graph[current].listIterator();
            while (itr.hasNext()){
                int next = itr.next();
                if(!visited[next]){
                    //adding adjacent nodes of current node
                    visited[next] =true;
                    queue.add(next);
                }
            }
            System.out.print(current+" ");
        }
    }
}
