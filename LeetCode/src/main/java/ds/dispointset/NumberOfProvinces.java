package ds.dispointset;

public class NumberOfProvinces {
    public static void main(String[] args) {
        int[][] isConnected = {{1,1,0},{1,1,0},{0,0,1}};
        findCircleNum(isConnected);

    }
    public static int findCircleNum(int[][] isConnected) {
        UnionFindNumberOfProvinces uf = new UnionFindNumberOfProvinces(isConnected.length);
        for (int row = 0; row < isConnected.length; row++){
            for (int col = 0; col < isConnected[row].length; col++){
                if(isConnected[row][col] == 1){
                    uf.union(row,col);
                }
            }
        }
        return uf.getSize();
    }
}
