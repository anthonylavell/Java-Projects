package grinder.tree;

import ds.node.singly_node.TreeNode;

public class BinarySearchTree {
    public static void main(String[] args) {

    }
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null){
            return new TreeNode(val);
        }
        if (val < root.val) {
            root.left = insertIntoBST(root.left,val);
        } else if(val > root.val) {
            root.right = insertIntoBST(root.right,val);
        }
        return root;
    }
}
