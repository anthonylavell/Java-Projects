package code.pattern.dfs;

public class FaceBookNumberOfVisibleNodes {

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

    public static int visibleTreeNode(Node<Integer> root) {
        return ((root == null) ? 0 : findVisibleTreeNode(root,new int[]{1}));
    }
    private static int findVisibleTreeNode(Node<Integer> root, int[] sum) {
        if (root == null){
            return 0;
        }
        if(root.left != null) {
            if (root.left.val < root.val) {
                root.left.val = root.val;
            } else {
                sum[0]++;
            }
        }
        findVisibleTreeNode(root.left,sum);

        if(root.right != null) {
            if (root.right.val < root.val) {
                root.right.val = root.val;
            } else {
                sum[0]++;
            }
        }
        findVisibleTreeNode(root.right,sum);
        return sum[0];
    }
}
