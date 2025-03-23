package udemy.advanced_alg.main;

import udemy.advanced_alg.dfs.graph.DFSRecursion;
import practice.graph.Vertex;

import java.util.ArrayList;
import java.util.List;

public class DFSApp {
    public static void main(String[] args) {
        Vertex v1 = new Vertex("A");
        Vertex v2 = new Vertex("B");
        Vertex v3 = new Vertex("C");
        Vertex v4 = new Vertex("D");
        Vertex v5 = new Vertex("E");
        Vertex v6 = new Vertex("F");
        Vertex v7 = new Vertex("G");
        Vertex v8 = new Vertex("H");
        Vertex v9 = new Vertex("I");
        Vertex v10 = new Vertex("J");

        List<Vertex> list = new ArrayList<>();
        v1.addNeighbor(v2);
        v1.addNeighbor(v6);
        v1.addNeighbor(v7);
        v2.addNeighbor(v3);
        v2.addNeighbor(v4);
        v4.addNeighbor(v5);
        v7.addNeighbor(v8);
        v9.addNeighbor(v10);

        list.add(v1);
        list.add(v2);
        list.add(v3);
        list.add(v4);
        list.add(v5);
        list.add(v6);
        list.add(v7);
        list.add(v8);
        list.add(v9);
        list.add(v10);

        int i = 0;
        DFSRecursion dfs = new DFSRecursion();
        dfs.traversal(list);
        //dfs.dfsHelper(v1);
    }
}
