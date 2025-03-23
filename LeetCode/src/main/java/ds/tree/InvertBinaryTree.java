package ds.tree;

import ds.node.CreateTreeNode;
import ds.node.singly_node.TreeNode;

public class InvertBinaryTree {
    public static void main(String[] args) {
        int [] values = {4,2,7,1,3,6,9};
        int [] values2 = {1,-1,2};
        TreeNode root = CreateTreeNode.insert(values);
        invertTree(root);
        int i = 0;
    }
    public static TreeNode invertTree(TreeNode root) {
        if(root!= null) {
            TreeNode tempNode = root.left;
            root.left = root.right;
            root.right = tempNode;
            invertTree(root.left);
            invertTree(root.right);
        }
        return root;
    }

    private static void invertNodes(TreeNode root){

    }
}
