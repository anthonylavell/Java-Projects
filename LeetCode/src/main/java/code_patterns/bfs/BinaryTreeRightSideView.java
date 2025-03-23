package code_patterns.bfs;

import ds.node.CreateTreeNode;
import ds.node.singly_node.TreeNode;

import java.util.*;

public class BinaryTreeRightSideView {
    public static void main(String[] args) {
        int [] arr = {20,14,28,12,16,25,30,11,13,15,17,23,26,29,31};
        TreeNode root = CreateTreeNode.insert(arr);
        System.out.println(rightSideView(root));
    }

    public static List<Integer> rightSideView(TreeNode root) {
        List<Integer>lst = new ArrayList<>();
        Deque<TreeNode> queue = new ArrayDeque<>();
        if(root!=null){
            queue.add(root);
        }
        while (!queue.isEmpty()){
            int size = queue.size();
            lst.add(queue.peekLast().val);
            while (size-- > 0){
                TreeNode tmpRoot = queue.poll();
                if (tmpRoot.left!=null){
                    queue.add(tmpRoot.left);
                }
                if (tmpRoot.right!=null){
                    queue.add(tmpRoot.right);
                }
            }
        }
        return lst;
    }
}
