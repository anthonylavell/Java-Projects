package ds.disjoint;

public class UnionFindNumberOfProvinces {
    private int [] root;
    // Use a rank array to record the height of each vertex, i.e., the "rank" of each vertex.
    private int [] rank;
    private int size;

    public UnionFindNumberOfProvinces(int size){
        this.size = size;
        root = new int[size];
        rank = new int[size];// The initial "rank" of each vertex is 1, because each of them is
                            // a standalone vertex with no connection to other vertices.
        for(int i = 0; i < size; i++){
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

    public void union(int x, int y){
        int rootX = find(x);
        int rootY = find(y);
        if(rootX != rootY) {
            if (rank[rootX] > rank[rootY]) {
                root[rootY] = root[rootX];
            } else if (rank[rootX] < rank[rootY]) {
                root[rootX] = root[rootY];
            } else {
                root[rootY] = root[rootX];
                rank[rootX] += 1;
            }
            size--;
        }
    }
    public boolean connected(int x, int y) {
        return find(x) == find(y);
    }

    public int getSize(){
        return size;
    }
}
