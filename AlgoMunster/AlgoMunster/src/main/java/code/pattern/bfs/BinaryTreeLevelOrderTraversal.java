package code.pattern.bfs;

import code.pattern.node.tree.Node;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class BinaryTreeLevelOrderTraversal {
    public static void main(String[] args) {

    }
    public static List<List<Integer>> levelOrderTraversal(Node<Integer> root) {
        // WRITE YOUR BRILLIANT CODE HERE
        List<List<Integer>> nodeLst = new ArrayList<>();
        Deque<Node<Integer>> nodeDeque = new ArrayDeque<>();
        if(root != null){
            nodeDeque.add(root);
        }
        while (!nodeDeque.isEmpty()){
            int count = nodeDeque.size();
            List<Integer> lst = new ArrayList<>();
            while (count-- > 0){
                Node<Integer> tmpNode = nodeDeque.pop();
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
