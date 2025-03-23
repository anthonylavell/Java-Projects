package ds.tree;

import ds.node.singly_node.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumRootToLeafNumbers {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>(Arrays.asList());

    }

    public static int sumNumbers(TreeNode root) {

        return helpSumNumbers(root,0);

    }

    private static int helpSumNumbers(TreeNode root, int sum){
        if(root == null){
            return 0;
        }
        sum = (sum*10)+root.val;
       if(root.left==null && root.right == null){
           return sum;
       }
       int leftNode = helpSumNumbers(root.left,sum);
       int rightNode = helpSumNumbers(root.right,sum);
       return leftNode+rightNode;
    }
}
