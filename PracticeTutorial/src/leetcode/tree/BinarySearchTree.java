package leetcode.tree;

import leetcode.node.TreeNode;

public class BinarySearchTree {

    TreeNode root;
    public BinarySearchTree(int val){
        this.root = new TreeNode(val);
    }
    public BinarySearchTree(){
        this.root = null;
    }

    public static void main(String[] args) {
        BinarySearchTree bST = new BinarySearchTree();
        System.out.println(bST.lookup(6));
        bST.insert(9);
        bST.insert(4);
        bST.insert(20);
        bST.insert(6);
        bST.insert(1);
        bST.insert(170);
        bST.insert(15);
        System.out.println(bST.lookup(6));
    }

    public void insert(int val){
        if(this.root ==null){
            this.root = new TreeNode(val);
            return;
        }
        TreeNode node = root;
        while (node!=null){
            if(val < node.val){
                if(node.left == null){
                    TreeNode tempTree = new TreeNode(val);
                    node.left = tempTree;
                   break;
                }
                node = node.left;
            }else {
                if(node.right == null){
                    TreeNode tempTree = new TreeNode(val);
                    node.right = tempTree;
                    break;
                }
                node = node.right;
            }
        }
    }
    public boolean lookup(int val){
        if(root!=null) {
            TreeNode node = root;
            while (node != null) {
                if (val == node.val) {
                    return true;
                } else if (val < node.val) {
                    node = node.left;
                } else {
                    node = node.right;
                }
            }
        }
        return false;
    }

    public boolean remove(int val){
        if(root!=null && lookup(val)) {
            TreeNode node = root;
            while (node != null) {
                if (val == node.val) {
                    node = node.right;
                    return true;
                } else if (val < node.val) {
                    node = node.left;
                } else {
                    node = node.right;
                }
            }
        }
        return false;
    }
}
