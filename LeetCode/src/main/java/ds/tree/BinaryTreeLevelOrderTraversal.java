package ds.tree;

import ds.node.singly_node.Node;
import ds.node.singly_node.TreeNode;

import java.util.*;

public class BinaryTreeLevelOrderTraversal {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(15);
        levelOrder(treeNode);
    }

    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> listOfTreeNodes = new ArrayList<>();
        if(root!=null) {
            Deque<TreeNode> dequeOfTreeNode = new ArrayDeque<>();
            dequeOfTreeNode.add(root);
            int keepOfSize = 1;
            List<Integer> listOfInt = new ArrayList<>();
            while (!dequeOfTreeNode.isEmpty()) {
                TreeNode tempNode = dequeOfTreeNode.pop();
                listOfInt.add(tempNode.val);
                keepOfSize--;
                if (tempNode.left != null) {
                    dequeOfTreeNode.add(tempNode.left);
                }

                if (tempNode.right != null) {
                    dequeOfTreeNode.add(tempNode.right);
                }
                if (keepOfSize == 0) {
                    listOfTreeNodes.add(listOfInt);
                    listOfInt = new ArrayList<>();
                    keepOfSize = dequeOfTreeNode.size();
                    Node node = new Node();
                    System.out.println(node.neighbors.get(0).neighbors);
                    List<Node>temp =  new ArrayList<Node>();

                }
            }
        }
        return listOfTreeNodes;
    }
}
