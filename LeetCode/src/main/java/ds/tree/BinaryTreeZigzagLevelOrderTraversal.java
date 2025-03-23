package ds.tree;

import ds.node.singly_node.TreeNode;

import java.util.*;

public class BinaryTreeZigzagLevelOrderTraversal {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(2);
        list.add(0,3);
        list.add(0, 2);
        System.out.println(list);

    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root == null){
            return new ArrayList<>();
        }
        List<List<Integer>> listOfIntegers = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int level = 0;
        while (!queue.isEmpty()){
            int size = queue.size();
            List<Integer>tempList = new ArrayList<>(size);
            for(int index = 0; index < size; index++){
                TreeNode tempRoot = queue.poll();
                if(tempRoot.left != null){
                    queue.add(tempRoot.left);
                }
                if(tempRoot.right != null){
                    queue.add(tempRoot.right);
                }
                if(level%2==1){
                    tempList.add(0,tempRoot.val);
                }else {
                    tempList.add(tempRoot.val);
                }
            }
            listOfIntegers.add(tempList);
            level++;
        }
        return listOfIntegers;

    }
}
