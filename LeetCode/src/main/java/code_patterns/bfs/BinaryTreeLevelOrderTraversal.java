package code_patterns.bfs;

import ds.node.CreateTreeNode;
import ds.node.singly_node.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class BinaryTreeLevelOrderTraversal {
    public static void main(String[] args) {
        int [] arr = {3,9,20,5,6,15,7};
        TreeNode root = CreateTreeNode.insert(arr);
        TreeNode root2 = new TreeNode();
        Deque<TreeNode>nodeDeque = new ArrayDeque<>();
        Deque<TreeNode>nodeDeque2 = new ArrayDeque<>();
        nodeDeque.add(root);
        nodeDeque2.add(root2);
        System.out.println(nodeDeque.isEmpty());
        System.out.println(nodeDeque2.isEmpty());
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> nodeLst = new ArrayList<>();
        Deque<TreeNode>nodeDeque = new ArrayDeque<>();
        if(root != null){
            nodeDeque.add(root);
        }
        while (!nodeDeque.isEmpty()){
            int count = nodeDeque.size();
            List<Integer> lst = new ArrayList<>();
            while (count-- > 0){
                TreeNode tmpNode = nodeDeque.pop();
                lst.add(tmpNode.val);
                if(tmpNode.left!=null){
                    nodeDeque.add(tmpNode.left);
                }
                if(tmpNode.right!=null){
                    nodeDeque.add(tmpNode.right);
                }
            }
            nodeLst.add(lst);
        }
        return nodeLst;
    }
}
