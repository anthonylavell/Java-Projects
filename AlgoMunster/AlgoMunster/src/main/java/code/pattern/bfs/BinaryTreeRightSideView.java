package code.pattern.bfs;

import code.pattern.node.tree.Node;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeRightSideView {
    public static void main(String[] args) {

    }

    public static List<Integer> binaryTreeRightSideView(Node<Integer> root) {
        List<Integer>lst = new ArrayList<>();
        Queue<Node<Integer>> queue = new ArrayDeque<>();
        if(root!=null){
            queue.add(root);
        }
        while (!queue.isEmpty()){
            int size = queue.size();
            while (size-- > 0){
                Node<Integer> tmpRoot = queue.poll();
                if(size==0){
                    lst.add(tmpRoot.val);
                }
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
