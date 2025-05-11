package grinder.tree.bfs;

import ds.node.singly_node.TreeNode;

import java.util.*;

public class BinaryTreeLevelOrderTraversal {
    public static void main(String[] args) {
        System.out.println();

    }
    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> levels = new ArrayList<>();
        Deque<TreeNode>deque = new ArrayDeque<>();
        if (root!=null){
            deque.add(root);
        }

        while (!deque.isEmpty()){
            int size = deque.size();
            List<Integer>list = new ArrayList<>();
            while (size-->0){
                TreeNode node = deque.pop();
                list.add(node.val);
                if (node.left != null){
                    deque.add(node.left);
                }
                if (node.right !=null){
                    deque.add(node.right);
                }
            }
            levels.add(list);
        }
        return levels;
    }
}
