package code_patterns.bfs;

import ds.node.singly_node.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

public class MinimumDepthOfBinaryTree {
    public static void main(String[] args) {

    }

    public static int minDepth(TreeNode root) {
        int level = 0;
        Deque<TreeNode>dequeOfTree = new ArrayDeque<>();
        if (root != null){
            dequeOfTree.add(root);
        }
        while (!dequeOfTree.isEmpty() ){
            int size = dequeOfTree.size();
            level++;
            while (size-- > 0){
                TreeNode tmpRoot = dequeOfTree.pop();
                if(tmpRoot.left==null && tmpRoot.right==null){
                    return level;
                }
                if(tmpRoot.left!=null){
                    dequeOfTree.add(tmpRoot.left);
                }

                if(tmpRoot.right!=null){
                    dequeOfTree.add(tmpRoot.right);
                }

            }
        }
        return level;
    }
}
