package ds.tree;

import ds.node.CreateTreeNode;
import ds.node.singly_node.TreeNode;

public class BalancedBinaryTree {
    public static void main(String[] args) {
        int [] values = {3,9,20,-1,-1,15,7};
        System.out.println(Math.max(1,1));
        TreeNode root = CreateTreeNode.insert(values);
    }
    public static boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }
        int leftNode = balanceHeight(root.left);
        int rightNode = balanceHeight(root.right);
        return ((leftNode!=-1 || rightNode !=-1) && Math.abs(leftNode-rightNode) <=1);

    }
    private static int balanceHeight (TreeNode currentNode){
        if(currentNode == null){
            return 0;
        }

        int leftNode = balanceHeight(currentNode.left);
        if(leftNode == -1){
            return leftNode;
        }
        int rightNode = balanceHeight(currentNode.right);
        if(rightNode == -1){
            return rightNode;
        }

        if(Math.abs(leftNode-rightNode) > 1){
            return -1;
        }
        return Math.max(leftNode,rightNode) +1;

    }

    /*private static int heightBalance(TreeNode root, int trackHeight){
        if(root == null){
            return trackHeight;
        }
        if(root.left !=null || root.right !=null){
            trackHeight++;
        }
        if(root.left !=null){
            trackHeight= heightBalance(root.left,trackHeight);
        }
        if(root.right !=null){
            trackHeight= heightBalance(root.right,trackHeight);
        }
        return trackHeight;
    }*/

}
