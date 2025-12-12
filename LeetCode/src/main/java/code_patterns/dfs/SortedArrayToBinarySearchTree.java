package code_patterns.dfs;
/*
Given an integer array nums where the elements are sorted in ascending order,
convert it to a height-balanced binary search tree.

EX1:
Input: nums = [-10,-3,0,5,9]
Output: [0,-3,9,-10,null,5]
Explanation: [0,-10,5,null,-3,null,9] is also accepted:

EX2:
Input: nums = [1,3]
Output: [3,1]
Explanation: [1,null,3] and [3,1] are both height-balanced BSTs.

Constraints:

1 <= nums.length <= 104
-104 <= nums[i] <= 104
nums is sorted in a strictly increasing order.
 */

import ds.node.singly_node.TreeNode;

public class SortedArrayToBinarySearchTree {
    public static TreeNode sortedArrayToBST(int[] nums) {
        return bST(nums,0, nums.length-1);
    }

    private static TreeNode bST(int[] nums, int left, int right) {
        if (left > right){
            return null;
        }
        int mid = left + (right-left)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = bST(nums,left,mid-1);
        root.right = bST(nums,mid+1,right);
        return root;
    }

    public static void main(String[] args) {
        int[]nums = {-10,-3,0,5,9};
        //int[]nums = {-1,0,2,3,4,5,6,7,8,9};
        sortedArrayToBST(nums);
    }
}
