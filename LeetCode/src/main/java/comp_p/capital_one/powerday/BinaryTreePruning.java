/*
Given the root of a binary tree, return the same tree where every subtree
(of the given tree) not containing a 1 has been removed.

A subtree of a node is node plus every node that is a descendant of node.
Example 1
Input: root = [1,null,0,0,1]
Output: [1,null,0,null,1]
Explanation:
Only the red nodes satisfy the property "every subtree not containing a 1".
The diagram on the right represents the answer.

Example 2:
Input: root = [1,0,1,0,0,0,1]
Output: [1,null,1,null,1]

Example 3:
Input: root = [1,1,0,1,1,0,1,0]
Output: [1,1,0,1,1,null,1]
 */

package comp_p.capital_one.powerday;

import ds.node.singly_node.TreeNode;

public class BinaryTreePruning {
    public TreeNode pruneTree(TreeNode root) {
        return findVal(root) == 1 ? root : null;
    }

    private int findVal(TreeNode root){
            if (root == null){
                return 0;
            }
            int left = findVal(root.left);
            int right = findVal(root.right);
            if (left==0){
                root.left=null;
            }
            if (right==0){
                root.right=null;
            }
            return Math.max(Math.max(left, root.val),right);
    }
}
