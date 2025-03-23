package code.pattern.bfs;

import code.pattern.node.tree.Node;
import code.pattern.node.tree.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

public class MinimumDepthOfBinaryTree {
    public static void main(String[] args) {

    }
    public static int binaryTreeMinDepth(Node<Integer> root) {
        // WRITE YOUR BRILLIANT CODE HERE
        int level = 0;
        Deque<Node<Integer>>dequeOfTree = new ArrayDeque<>();
        if (root != null){
            dequeOfTree.add(root);
        }
        while (!dequeOfTree.isEmpty()){
            int size = dequeOfTree.size();
            level++;
            while (size-- > 0){
                Node<Integer> tmpRoot = dequeOfTree.pop();
                if(tmpRoot.left==null && tmpRoot.right == null){
                    return level;
                }
                if(tmpRoot.left!=null){
                    dequeOfTree.add(tmpRoot.left);
                }

                if(tmpRoot.right!=null){
                    dequeOfTree.add(tmpRoot.right);
                }
            }
        }
        return level;
    }
}
