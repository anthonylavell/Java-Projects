package ds.disjoint;

public class GraphValidTree {
    public static void main(String[] args) {
        int n =5;
        //int[][] edges = {{0,1},{0,2},{0,3},{1,4}};
        //validTree(n,edges);
        int[][] edges2 = {{0,1},{2,3}};
        n = 4;
        validTree(n,edges2);
    }
    public static boolean validTree(int n, int[][] edges) {
        UnionFindGraphValidTree uf = new UnionFindGraphValidTree(n);
        for (int[] points : edges) {
            if(!uf.union(points[0],points[1])){
                return false;
            }
        }
        return edges.length == n-1;
    }
}
