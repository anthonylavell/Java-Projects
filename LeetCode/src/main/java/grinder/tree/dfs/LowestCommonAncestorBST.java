package grinder.tree.dfs;

import ds.node.singly_node.TreeNode;

public class LowestCommonAncestorBST {
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root.val > p.val && root.val > q.val){
            return lowestCommonAncestor(root.left,p,q);
        } else if (root.val < p.val && root.val < q.val) {
            return lowestCommonAncestor(root.right,p,q);
        }

        return root;
    }
}
