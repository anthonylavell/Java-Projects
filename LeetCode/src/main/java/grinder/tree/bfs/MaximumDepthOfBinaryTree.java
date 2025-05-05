package grinder.tree.bfs;

import ds.node.singly_node.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

public class MaximumDepthOfBinaryTree {
    public static void main(String[] args) {

    }

    public static int maxDepth(TreeNode root) {
        Deque<TreeNode> deque = new ArrayDeque<>();
        if (root!=null)
            deque.add(root);
        int level = 0;
        while (!deque.isEmpty()){
            int size = deque.size();
            while (size-->0){
                TreeNode tempNode = deque.pop();
                if (tempNode.left != null){
                    deque.add(tempNode.left);
                }
                if (tempNode.right != null){
                    deque.add(tempNode.right);
                }
            }
            level++;
        }
        return level;
    }
}
