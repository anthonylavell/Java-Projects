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

        int leftNode = findTreeLevel(root.left);
        int rightNode = findTreeLevel(root.right);

        if((leftNode < 0 || rightNode < 0) ||  Math.abs(leftNode-rightNode) > 1){
            return -1;
        }
        return (Math.max(leftNode,rightNode)) +1;
    }
}
