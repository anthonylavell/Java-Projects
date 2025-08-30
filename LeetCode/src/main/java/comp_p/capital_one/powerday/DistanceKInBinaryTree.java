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
        Map<Integer,List<TreeNode>>graph = createGraph(root);
        Deque<Integer>deque = new ArrayDeque<>();
        deque.add(target.val);
        int [] visited = new int[501];
        while (!deque.isEmpty() && k-->0) {
            int size = deque.size();
            while (size-- > 0){
                int key = deque.poll();
                visited[key]=1;
                List<TreeNode> tempTree = graph.get(key);
                for (TreeNode node : tempTree){
                    if (visited[node.val]==0)
                        deque.add(node.val);
                }
            }
        }
        while (!deque.isEmpty()) {
            list.add(deque.poll());
        }
        return list;
    }
    private static   Map<Integer,List<TreeNode>> createGraph(TreeNode root){
        if (root == null){
            return null;
        }
        Map<Integer,List<TreeNode>>graph = new HashMap<>();
        Deque<TreeNode>deque = new ArrayDeque<>();
        deque.add(root);
        while (!deque.isEmpty()){
                TreeNode currentNode = deque.poll();
                List<TreeNode> currentList = new ArrayList<>();
                if (currentNode.left!=null){
                    graph.put(currentNode.left.val,List.of(currentNode));
                    currentList.add(currentNode.left);
                    deque.add(currentNode.left);
                }
                if (currentNode.right!=null){
                    graph.put(currentNode.right.val,List.of(currentNode));
                    currentList.add(currentNode.right);
                    deque.add(currentNode.right);
                }
                if (graph.containsKey(currentNode.val) &&!graph.get(currentNode.val).isEmpty()){
                    currentList.add(graph.get(currentNode.val).get(0));
                }
                graph.put(currentNode.val,currentList);
            }
        return graph;
    }
}
