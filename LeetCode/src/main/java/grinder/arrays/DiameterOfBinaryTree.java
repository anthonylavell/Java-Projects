package grinder.arrays;

import ds.node.singly_node.TreeNode;

public class DiameterOfBinaryTree {
    public static void main(String[] args) {

    }

    public static int diameterOfBinaryTree(TreeNode root) {
        int max = 0;
        maxDiameterOfBinaryTree(root, max);
        return max;
    }

    public static int maxDiameterOfBinaryTree(TreeNode root, int max) {
        if(root == null){
            return 0;
        }
        int leftN = maxDiameterOfBinaryTree(root.left,max);
        int rightN = maxDiameterOfBinaryTree(root.right,max);
        int subTotal = leftN+rightN;
        if ( subTotal > max){
            max = subTotal;
        }
        return Math.max(leftN,rightN) + 1;
    }
}
