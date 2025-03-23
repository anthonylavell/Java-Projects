package code.pattern.dfs;

import concrete.node.Node;

public class BalancedBinaryTree {

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

    public static boolean isBalanced(Node<Integer> tree) {
        return (findTreeLevel(tree) >= 0);
    }

    private static int findTreeLevel(Node<Integer>  root) {
        if(root == null){
            return 0;
        }

        int leftNde = findTreeLevel(root.left);
        int rightNde = findTreeLevel(root.right);

        if((leftNde < 0 || rightNde < 0) ||  Math.abs(leftNde-rightNde) > 1){
            return -1;
        }
        return (Math.max(leftNde,rightNde)) +1;
    }
}
