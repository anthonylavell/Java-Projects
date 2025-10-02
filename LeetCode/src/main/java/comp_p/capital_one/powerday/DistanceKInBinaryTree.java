/*
Given the root of a binary tree, the value of a target node target, and an integer k,
return an array of the values of all nodes that have a distance k from the target node.
Example 2:
You can return the answer in any order.
Input: root = [3,5,1,6,2,0,8,null,null,7,4], target = 5, k = 2
Output: [7,4,1]
Explanation: The nodes that are a distance 2 from the target node (with value 5) have
values 7, 4, and 1.
Example 2:

Input: root = [1], target = 1, k = 3
Output: []
 */
package comp_p.capital_one.powerday;

import ds.node.CreateTreeNode;
import ds.node.singly_node.TreeNode;

import java.util.*;

public class DistanceKInBinaryTree {
    public static void main(String[] args) {
        int [] arr = {3,5,1,6,2,0,8};
        TreeNode root = CreateTreeNode.insert(arr);
        TreeNode target = CreateTreeNode.insert(arr);
        int k = 2;
        distanceK(root,target,k);
    }
    public static List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer> list = new ArrayList<>();
        Map<TreeNode,Deque<TreeNode>>graph = createGraph(root);
        Deque<TreeNode>deque = new ArrayDeque<>();
        deque.add(target);
        boolean [] visit = new boolean[501];
        while (!deque.isEmpty() && k>0){
            int size = deque.size();
            while (size-- > 0){
                Deque<TreeNode> currentDeque = graph.get(deque.poll());
                while (!currentDeque.isEmpty()){
                    TreeNode currentNode = currentDeque.poll();
                    if (!visit[currentNode.val] ){
                        deque.add(currentNode);
                        visit[currentNode.val]=true;
                    }
                }
            }
            k--;
        }
        while (!deque.isEmpty()) {
            TreeNode currentNode = deque.poll();
            list.add(currentNode.val);
        }
        return list;
    }
    private static Map<TreeNode,Deque<TreeNode>> createGraph(TreeNode root){
        if (root == null){
            return null;
        }
        Map<TreeNode,Deque<TreeNode>>graph = new HashMap<>();
        Deque<TreeNode>deque = new ArrayDeque<>();
        deque.add(root);
        graph.put(root,new ArrayDeque<>());
        while (!deque.isEmpty()){
            TreeNode currentNode = deque.poll();
            if (currentNode.left != null){
                graph.put(currentNode.left,new ArrayDeque<>());
                graph.get(currentNode.left).add(currentNode);
                graph.get(currentNode).add(currentNode.left);
                deque.add(currentNode.left);
            }
            if (currentNode.right != null){
                graph.put(currentNode.right,new ArrayDeque<>());
                graph.get(currentNode.right).add(currentNode);
                graph.get(currentNode).add(currentNode.right);
                deque.add(currentNode.right);
            }
        }
        return graph;
    }
}
