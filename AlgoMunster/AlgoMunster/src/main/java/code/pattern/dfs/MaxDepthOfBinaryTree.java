package code.pattern.dfs;

import org.w3c.dom.Node;

public class MaxDepthOfBinaryTree {

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

    public static void main(String[] args) {

    }

    public static int treeMaxDepth(Node<Integer> root) {
        int result = findTreeMaxDepth(root);
        return (result < 1) ? result  : result-1;
    }

    public static int findTreeMaxDepth(Node<Integer> root) {
        if (root == null){
            return 0;
        }
        int leftNode = findTreeMaxDepth(root.left);
        int rightNode = findTreeMaxDepth(root.right);
        return (Math.max(leftNode,rightNode) +1);
    }
}
