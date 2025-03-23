package code.pattern.dfs;

public class LowestCommonAncestorBST {
    public static class Node<T> {
        public T val;
        public Node<T> left;
        public Node<T> right;

        public Node(T val) {
            this(val, null, null);
        }

        public Node(T val, Node<T> left, Node<T> right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public static int lcaOnBst(Node<Integer> root, int p, int q) {
        // WRITE YOUR BRILLIANT CODE HERE
        if(root.val > p && root.val > q){
            return lcaOnBst(root.left,p,q);
        } else if (root.val < p && root.val < q) {
            return lcaOnBst(root.right,p,q);
        }

        return root.val;
    }
}
