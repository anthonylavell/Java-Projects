package ds.disjoint;

public class UnionFindGraphValidTree {
    private int [] root;
    private int [] rank;

    public UnionFindGraphValidTree(int size){
        root = new int[size];
        rank = new int[size];
        for (int i = 0; i < size; i++){
            root[i] = i;
            rank[i] = 1;
        }
    }
    public int find(int x){
        if(x == root[x]){
            return x;
        }
        return root[x] = find(root[x]);
    }

    public boolean union(int x, int y){
        int rootX = find(x);
        int rootY = find(y);
        if(rootX!= rootY){
            if(rank[rootX] > rank[rootY]){
                root[rootY] = root[rootX];
            }else if(rank[rootX] < rank[rootY]){
                root[rootX] = root[rootY];
            }else {
                root[rootY] = root[rootX];
                rank[rootX]+=1;
            }
            return true;
        }
        return false;
    }
}
