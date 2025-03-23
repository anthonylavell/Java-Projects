package udemy.advanced_alg.dfs.graph;

import practice.graph.Vertex;

import java.util.List;

public class DFSRecursion<T> {
    public void traversal(List<Vertex> vertexList){
        // it may happen that we have independent clusters
        for(Vertex v : vertexList){
            if(!v.isVisited()){
                v.setVisited(true);
                System.out.println("Calling method");
                dfsHelper(v);
            }
        }
    }

    private void dfsHelper(Vertex vertex){
        System.out.println(vertex);
        for(Vertex v : vertex.getAdjacencyList()){
            if(!v.isVisited()){
                v.setVisited(true);
                dfsHelper(v);
            }
        }
    }
}
