package grinder.tree;

import ds.node.CreateTreeNode;
import ds.node.singly_node.TreeNode;

public class InvertBinaryTree {
    public static void main(String[] args) {
        int [] num = {4,2,7,1,3,6,9};
        TreeNode root = CreateTreeNode.insert(num);
        TreeNode newTree = invertTree2(root);
        System.out.println("Hello");
    }

    public static TreeNode invertTree(TreeNode root) {
        if(root != null) {
            TreeNode tempLeft = root.left;
            root.left = root.right;
            root.right = tempLeft;
            invertTree(root.left);
            invertTree(root.right);
        }
        return root;
    }

    public static TreeNode invertTree2(TreeNode root) {
        if(root == null) {
            return null;
        }
        return new TreeNode(root.val,invertTree2(root.right),invertTree(root.left));
    }
}
