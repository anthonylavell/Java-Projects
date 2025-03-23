package ds.node;

import ds.node.singly_node.TreeNode;

public class CreateTreeNode {

    public static void main(String[] args) {
        int [] nums = {4,2,7,1,3,6,9};
        for(int num : nums){

        }
    }

    public static TreeNode insert(int [] nums){
        TreeNode root = null;
        for(int num : nums){
           root = addRecursive(root,num);

        }
        int i = 0;
        return root;
    }

    private static TreeNode addRecursive(TreeNode current, int value) {
        if (current == null) {
            return new TreeNode(value);
        }

        if (value < current.val) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.val) {
            current.right = addRecursive(current.right, value);
        } else {
            // value already exists
            return current;
        }

        return current;
    }
}
