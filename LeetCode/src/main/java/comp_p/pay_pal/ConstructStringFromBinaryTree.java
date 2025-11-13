package comp_p.pay_pal;

import ds.node.singly_node.TreeNode;

public class ConstructStringFromBinaryTree {
    public static String tree2str(TreeNode root) {
        if (root==null){
            return "";
        }
        StringBuilder builder = new StringBuilder();
        String leftStr = tree2str(root.left);
        String rightStr = tree2str(root.right);
        if (!leftStr.isBlank() && !rightStr.isBlank()){
            builder.append("(").append(leftStr).append(")").append("(").append(rightStr).append(")");
        } else if (leftStr.isBlank() && !rightStr.isBlank()) {
            builder.append("()" + "(").append(rightStr).append(")");
        } else if (!leftStr.isBlank() && rightStr.isBlank()){
            builder.append("(").append(leftStr).append(")");
        }
        builder.insert(0,root.val);
        return builder.toString();
    }

    public static void main(String[] args) {

    }


}
