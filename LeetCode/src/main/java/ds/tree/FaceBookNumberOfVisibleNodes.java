package ds.tree;

import ds.node.CreateTreeNode;
import ds.node.singly_node.TreeNode;

public class FaceBookNumberOfVisibleNodes {
    public static void main(String[] args) {
        int [] arrayOfNodes = {5,4,3,8,6};
        TreeNode node = CreateTreeNode.insert(arrayOfNodes);
        visibleTreeNode(node);
        System.out.println("");
    }

    public static int visibleTreeNode(TreeNode root) {
        int visibleTreeNode = ((root == null) ? 0 : findVisibleTreeNode(root,new int[]{1}));
        int visibleTreeNode2 = ((root == null) ? 0 : findVisibleTreeNode2(root,Integer.MIN_VALUE));
        return visibleTreeNode2;
    }
    private static int findVisibleTreeNode(TreeNode root, int[] sum) {
        if (root == null){
            return 0;
        }

        if(root.left != null) {
            if (root.left.val < root.val) {
                root.left.val = root.val;
            } else {
                sum[0]++;
            }
        }
        findVisibleTreeNode(root.left,sum);

        if(root.right != null) {
            if (root.right.val < root.val) {
                root.right.val = root.val;
            } else {
                sum[0]++;
            }
        }
        findVisibleTreeNode(root.right,sum);
        return sum[0];
    }

    private static int findVisibleTreeNode2(TreeNode root, int maxNodeSoFar) {
        if (root == null){
            return 0;
        }
        int totalFind = 0;
        if(root.val >= maxNodeSoFar){
            totalFind++;
        }

        totalFind+=findVisibleTreeNode2(root.left,Math.max(root.val,maxNodeSoFar));
        totalFind+=findVisibleTreeNode2(root.right,Math.max(root.val,maxNodeSoFar));
        return totalFind;
    }
}
