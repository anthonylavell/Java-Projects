package grinder;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
         this.left = left;
         this.right = right;
     }
  }

public class Practice {

    public boolean isValidBST(TreeNode root) {
        long min = Long.MIN_VALUE;
        long max = Long.MAX_VALUE;
        return foundValidBST(root,min,max);
    }

    public boolean foundValidBST(TreeNode root, long min, long max) {
        if (root == null){
            return true;
        }
        if (root.val <= min && root.val >= max){
            return false;
        }
        return foundValidBST(root.left,min, root.val) || foundValidBST(root.right, root.val,max);
    }

    public static void main(String[] args) {
        Practice trie = new Practice();


    }
}
