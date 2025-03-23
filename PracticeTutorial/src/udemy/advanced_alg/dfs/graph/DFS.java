package udemy.advanced_alg.dfs.graph;

import practice.graph.Vertex;

import java.util.List;
import java.util.Stack;

public class DFS {

    private Stack<Vertex> stack;

    public DFS(){
        stack = new Stack<>();
    }

    public void traversal(List<Vertex> vertexList){
        // it may happen that we have independent clusters
        for(Vertex v : vertexList){
            if(!v.isVisited()){
                v.setVisited(true);
                dfsHelper(v);
            }
        }
    }

    private void dfsHelper(Vertex rootVertex){
        //LIFO structure
        stack.add(rootVertex);
        rootVertex.setVisited(true);
        while (!stack.isEmpty()){
            Vertex actualVertex = stack.pop();
            System.out.println(actualVertex);
            // consider all the neighbors
            for (Vertex v: actualVertex.getAdjacencyList()){
                if(!v.isVisited()){
                    v.setVisited(true);
                    stack.add(v);
                }
            }
        }
    }
}
