package ds.tree;

import ds.node.singly_node.TreeNode;

public class DiameterOfBinaryTree {
    private static  int total;

    public static void main(String[] args) {

    }
    public static int diameterOfBinaryTree(TreeNode root) {
        total = 0;
        return 0;
    }
    private static int getTreeMaxPath(TreeNode root){
        if(root == null){
            return 0;
        }
        int leftPath = 0;
        int rightPath = 0;

        if(root.left !=null){
            leftPath = getTreeMaxPath(root.left);
        }
        if(root.right!=null){
            rightPath = getTreeMaxPath(root.right);
        }
        if(total < (leftPath+rightPath)){
            total = leftPath+rightPath;
        }

        return (Math.max(leftPath, rightPath)+1);
    }
}
