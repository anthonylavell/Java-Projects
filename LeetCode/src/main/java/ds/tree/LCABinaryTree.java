package ds.tree;

import ds.node.singly_node.TreeNode;

public class LCABinaryTree {
    public static void main(String[] args) {

    }
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        return p;
    }

    public static TreeNode findLCA(TreeNode root, TreeNode p, TreeNode q){
        if(root == null){
            return null;
        }
        TreeNode leftNode = findLCA(root.left, p, q);
        TreeNode rightNode = findLCA(root.right, p, q);
        if(((leftNode==p || leftNode==q) && (rightNode==p || rightNode==q)) || (root==p || root==q)) {
            return root;
        }else if (leftNode==p || leftNode==q || leftNode!=null){
            return leftNode;

        } else if (rightNode==p || rightNode==q || rightNode!=null) {
            return rightNode;
        }else {
            return null;
        }
    }
}
