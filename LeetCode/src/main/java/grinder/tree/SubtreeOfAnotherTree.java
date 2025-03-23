package grinder.tree;

import ds.node.singly_node.TreeNode;

public class SubtreeOfAnotherTree {
    public static void main(String[] args) {

    }

    public static boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null){
            return false;
        }
        boolean isTorF =  findSubTree(root,subRoot);
            if (!isTorF ){
                isTorF = isSubtree(root.left, subRoot);
            }
            if (!isTorF){
                isTorF = isSubtree(root.right, subRoot);
            }
        return isTorF;
    }

    public static boolean findSubTree(TreeNode root, TreeNode subRoot) {
        if (root == null && subRoot == null){
            return true;
        }

        if (root == null || subRoot == null){
            return false;
        }
        boolean isTorF = (root.val == subRoot.val);
        if (isTorF) {
            isTorF = findSubTree(root.left, subRoot.left);
        }
        if (isTorF){
            isTorF = findSubTree(root.right, subRoot.right);
        }

        return isTorF;
    }

    public static boolean isSubtree2(TreeNode root, TreeNode subRoot) {
        if(root == null){
            return false;
        }
        return findSubTree(root,subRoot) || isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    public static boolean findSubTree2(TreeNode root, TreeNode subRoot) {
        if (root == null && subRoot == null) {
            return true;
        }

        if (root == null || subRoot == null) {
            return false;
        }

        return (root.val == subRoot.val) && (findSubTree(root.left, subRoot.left) && findSubTree(root.right, subRoot.right));
    }
}
