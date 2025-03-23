package ds.tree;

import ds.node.singly_node.TreeNode;

public class ConstructBTFromPreorderAndInorderTraversal {
    int preIndex = 0;
    int inIndex = 0;

    public static void main(String[] args) {
        int [] preorder = {3,9,20,15,7};
        int [] inorder = {9,3,15,20,7};
        ConstructBTFromPreorderAndInorderTraversal bt = new ConstructBTFromPreorderAndInorderTraversal();
        bt.helpBuildTree(Integer.MIN_VALUE,preorder,inorder);
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return helpBuildTree(Integer.MIN_VALUE,preorder,inorder);
    }

    private TreeNode helpBuildTree(int currVal, int[] preorder, int[] inorder) {
        if(preIndex > preorder.length-1){
            return null;
        }

        if(inorder[inIndex] == currVal ){
            inIndex++;
            return null;
        }

        TreeNode root = new TreeNode(preorder[preIndex++]);
        root.left = helpBuildTree(root.val,preorder,inorder);
        root.right = helpBuildTree(currVal,preorder,inorder);
        return root;
    }
}
