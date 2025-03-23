package code_patterns.bfs;

import ds.node.CreateTreeNode;
import ds.node.singly_node.TreeNode;

import java.util.*;

public class BinaryTreeZigzagLevelOrderTraversal {
    public static void main(String[] args) {
        Deque<Integer> stack = new LinkedList<>();
        stack.addFirst(7);
        stack.addFirst(15);
        int[] nums = {20,14,28,12,16,25,30,11,13,15,17,23,26,29,31};
        TreeNode root = CreateTreeNode.insert(nums);
        System.out.println(zigzagLevelOrder(root));
    }

    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> nodeLst = new ArrayList<>();
        Deque<TreeNode>dequeOfNde = new ArrayDeque<>();
        if(root != null){
            dequeOfNde.addFirst(root);
        }
        int level = 0;
        while (!dequeOfNde.isEmpty()){
            int size = dequeOfNde.size();
            List<Integer>lst = new ArrayList<>();
            while (size-- > 0){
                TreeNode tmpNode = dequeOfNde.pop();
                if(tmpNode.left != null)
                    dequeOfNde.add(tmpNode.left);
                if (tmpNode.right != null)
                    dequeOfNde.add(tmpNode.right);
                if(level%2==1){
                    lst.add(0,tmpNode.val);
                }else {
                    lst.add(tmpNode.val);
                }
            }
            level++;
            nodeLst.add(lst);
        }
        return nodeLst;
    }
}
