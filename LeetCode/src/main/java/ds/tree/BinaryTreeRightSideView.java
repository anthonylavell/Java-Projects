package ds.tree;

import ds.node.singly_node.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeRightSideView {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
    }

    public static List<Integer> rightSideView(TreeNode root) {
        if(root == null){
            return new ArrayList<>();
        }
        List<Integer> list = new ArrayList<>();
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            while (!queue.isEmpty()){
                int size = queue.size();
                for(int i = 0; i < size; i++){
                    TreeNode tempNode = queue.poll();
                    if(i == size-1){
                        list.add(tempNode.val);
                    }
                    if(tempNode.left !=null){
                        queue.add(tempNode.left);
                    }
                    if(tempNode.right !=null){
                        queue.add(tempNode.right);
                    }
                }
            }
        return list;
    }
    
}
