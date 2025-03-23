package code.pattern.dfs;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConstructBinaryTreeFromPreorderAndInorder {
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
    private static Node<Integer> buildTreeRecursive(List<Integer> preorder, Map<Integer, Integer> inorderIndexMap, int preorderStart, int inorderStart, int size) {
        if (size <= 0) {
            return null;
        }

        int rootValue = preorder.get(preorderStart);
        int inorderIndex = inorderIndexMap.get(rootValue);
        int leftSize = inorderIndex - inorderStart;

        Node<Integer> left = buildTreeRecursive(preorder, inorderIndexMap, (preorderStart + 1), inorderStart, leftSize);
        Node<Integer> right = buildTreeRecursive(preorder, inorderIndexMap, (preorderStart + 1 + leftSize), inorderIndex + 1, size - 1 - leftSize);

        return new Node<Integer>(rootValue, left, right);
    }

    public static Node<Integer> constructBinaryTree(List<Integer> preorder, List<Integer> inorder) {
        Map<Integer, Integer> inorderIndexMap = new HashMap<>();
        for (int i = 0; i < inorder.size(); ++i) {
            inorderIndexMap.put(inorder.get(i), i);
        }
        return buildTreeRecursive(preorder, inorderIndexMap, 0, 0, inorder.size());
    }
}
