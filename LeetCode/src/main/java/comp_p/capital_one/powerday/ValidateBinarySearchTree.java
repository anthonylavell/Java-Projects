package comp_p.capital_one.powerday;

import ds.node.singly_node.TreeNode;

public class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        long min = Long.MIN_VALUE;
        long max = Long.MAX_VALUE;
        return findValidBST(root,min,max);
    }
    private boolean findValidBST(TreeNode root, long min, long max){
        if (root==null){
            return true;
        }
        if (min > root.val || max < root.val)
            return false;
        return findValidBST(root.left,min,root.val) && findValidBST(root.right,root.val,max);
    }
}
