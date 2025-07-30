package comp_p.hubspot;

import ds.node.singly_node.TreeNode;

import java.util.*;

public class BinaryTreeLevelOrderTraversal {
    public static void main(String[] args) {

    }
    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> listOfNodes = new ArrayList<>();
        Deque<TreeNode> deque = new ArrayDeque<>();
        if (root != null){
            deque.add(root);
        }
        while (!deque.isEmpty()){
            int size = deque.size();
            List<Integer> lst = new ArrayList<>();
            while (size-- > 0){
                TreeNode node = deque.poll();
                if (node.left != null){
                    deque.add(node.left);
                }
                if (node.right != null){
                    deque.add(node.right);
                }
                lst.add(node.val);
            }
            listOfNodes.add(lst);
        }
        return listOfNodes;
    }
}
