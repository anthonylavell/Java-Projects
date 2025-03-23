package code.pattern.dfs;

public class BinarySearchTree {
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
    public Node<Integer> insertBst(Node<Integer> root, int val) {
        if(root == null){
            return new Node<Integer>(val);
        }
        if (val < root.val) {
            root.left = insertBst(root.left,val);
        } else if (val > root.val){
            root.right = insertBst(root.right,val);
        }
        return root;
    }
}
