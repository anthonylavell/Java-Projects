package ds.tree;

import ds.node.singly_node.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PathSumII {
    private static List<List<Integer>> paths;
    public static void main(String[] args) {
       List<Integer>l1 = new ArrayList<>();
       l1.add(5);
       List<Integer> l2 = new ArrayList<>(l1);
        System.out.println(l2);
    }

    public static List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if(root ==null){
            return paths;
        }
        paths = new ArrayList<>();
        findSum(root.left,targetSum- root.val,new ArrayList<>(Arrays.asList(5)));
        findSum(root.right,targetSum - root.val,new ArrayList<>(Arrays.asList(5)));
        return paths;
    }

    private static void findSum(TreeNode root, int targetSum,List<Integer> subPaths){
        if(root == null){
            return;
        }
        if(root.left == null && root.right == null){
            if(root.val == targetSum){
                subPaths.add(root.val);
                paths.add(new ArrayList<>(subPaths));
                subPaths.remove(subPaths.size()-1);
            }
            return;
        }
        subPaths.add(root.val);
        findSum(root.left,targetSum-root.val, subPaths);
        findSum(root.right,targetSum-root.val, subPaths);
        subPaths.remove(subPaths.size()-1);
    }
}
