package challenges.practice_challenge.graph;

import java.util.ArrayList;

public class Graph {

    private int vertex;
    private ArrayList<Integer>[] adjListArray;

    public Graph(int vertex){
        this.vertex = vertex;
        adjListArray = new ArrayList[vertex];
        addVertex();
    }

    private void addVertex(){
        for(int i = 0; i < vertex; i++){
            adjListArray[i] = new ArrayList<>();
        }
    }

    public void addEdge(int src, int dest){
        adjListArray[src].add(dest);
    }

    public void showConnections(){
        for(int i = 0; i < vertex; i++){
            System.out.println(i+" ----> "+adjListArray[i]);
        }
    }
}
