package code.pattern.dfs;

public class ValidateBinarySearchTree {
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
    public static boolean validBst(Node<Integer> root) {
        // WRITE YOUR BRILLIANT CODE HERE
        return findValidBST(root,-2147483649l,2147483648l);
    }

    private static boolean findValidBST(Node<Integer> root, long min, long max) {
        if(root == null){
            return true;
        }
        if(!(min < root.val && root.val < max)){
            return false;
        }
        return findValidBST(root.left,min, root.val) && findValidBST(root.right, root.val, max);
    }
}
