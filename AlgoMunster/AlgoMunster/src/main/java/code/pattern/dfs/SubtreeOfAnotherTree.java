package code.pattern.dfs;

public class SubtreeOfAnotherTree {

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

    public static boolean subtreeOfAnotherTree(Node<Integer> root, Node<Integer> subRoot) {
        // WRITE YOUR BRILLIANT CODE HERE
        boolean isTorF =  findSubTree(root,subRoot);
        if(root.left !=null){
            if (!isTorF ){
                isTorF = subtreeOfAnotherTree(root.left, subRoot);
            }
        }
        if (root.right !=null){
            if (!isTorF){
                isTorF = subtreeOfAnotherTree(root.right, subRoot);
            }
        }
        return isTorF;
    }

    public static boolean findSubTree(Node<Integer> root, Node<Integer> subRoot) {
        if (root == null && subRoot != null){
            return false;
        }

        if (root == null){
            return true;
        }
        boolean isTorF = ((subRoot != null) && root.val == subRoot.val) ? true : false;
        if (isTorF) {
            isTorF = findSubTree(root.left, subRoot.left);
        }
        if (isTorF){
            isTorF = findSubTree(root.right, subRoot.right);
        }

        return isTorF;
    }
}
