package ds.tree;

import ds.node.singly_node.TreeNode;

public class ValidateBinarySearchTree {

    public static boolean isValidBST(TreeNode root) {
        return findValidBST(root,null,null);
    }

    private static boolean findValidBST(TreeNode root, Integer max, Integer min){
        if(root == null){
            return true;
        } else if ((max != null && root.val >= max) || (min!=null && root.val <= min) ){
            return false;
        }
        return (findValidBST(root.left,root.val,min) && findValidBST(root.right, max, root.val));
    }
}
