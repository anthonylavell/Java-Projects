package grinder.tree;


import ds.node.singly_node.TreeNode;

public class SumRootToLeafNumbers {
    public static int sumNumbers(TreeNode root) {
        if(root == null){
            return 0;
        }
        return findSum(root,0);
    }

    public static int findSum(TreeNode root, int num) {
        if(root == null){
            return -1;
        }
        num = (num * 10)+root.val;
        int leftNode = findSum(root.left,num);
        int rightNode = findSum(root.right,num);
        int total = (((leftNode+rightNode) ==-2) || (leftNode > -1 && rightNode > -1)) ? leftNode+rightNode : Math.max(leftNode,rightNode);
        return (total == -2) ? num : total;
    }

    public static int findSum2(TreeNode root, int num){
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            return (num * 10)+root.val;
        }
        int leftNode = findSum2(root.left,(num * 10)+root.val);
        int rightNode = findSum2(root.right,(num * 10)+root.val);
        return leftNode + rightNode;
    }

    public static int findSum3(TreeNode root, String num) {
        if(root == null){
            return -1;
        }
        num = num+root.val;
        int leftNode = findSum3(root.left,num);
        int rightNode = findSum3(root.right,num);
        int total = (((leftNode+rightNode) ==-2) || (leftNode > -1 && rightNode > -1)) ? leftNode+rightNode : Math.max(leftNode,rightNode);
        return (total == -2) ? Integer.parseInt(num) : total;

    }
}
