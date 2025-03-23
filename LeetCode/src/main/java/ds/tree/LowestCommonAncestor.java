package ds.tree;

import ds.node.CreateTreeNode;
import ds.node.singly_node.TreeNode;

public class LowestCommonAncestor {
    public static void main(String[] args) {
        int [] values = {6,2,8,0,4,7,9,-1,-1,3,5};
        //int [] valueP = {2,0,4,-1,-1,3,5};
        //int [] valueQ = {8,7,9};
        //int [] valueQ = {4,-3,5};
        //int [] values = {2,1};
        //int [] valueP = {2,1};
        //int [] valueQ = {1};
        int [] valueP = {3,5};
        int [] valueQ = {5};
        TreeNode root = CreateTreeNode.insert(values);
        TreeNode root2 = root;
        System.out.println("root: "+ root);
        System.out.println("root2: "+ root2);
        System.out.println("is true: "+ root.equals(root2.right));
        /*TreeNode p = CreateTreeNode.insert(valueP);
        TreeNode q = CreateTreeNode.insert(valueQ);
        TreeNode resultTree = lowestCommonAncestor(root,p,q);*/
    }

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root.val > p.val && root.val > q.val){
            return lowestCommonAncestor(root.left,p,q);
        } else if (root.val < p.val && root.val < q.val) {
            return lowestCommonAncestor(root.right,p,q);
        }else {
            return root;
        }
    }




}
