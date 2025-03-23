package challenges.practice_challenge.binary_tree;

import challenges.practice_challenge.node.TreeNode;

public class BinaryTree {

    // == fields ==
    private TreeNode root;


    public BinaryTree(){
        root = null;
    }

    public void insert(int data){
        TreeNode newNode = new TreeNode();
        newNode.data = data;
        if(root == null){
            root = newNode;
        }else {
            TreeNode currentNode = root;
            while (currentNode !=null) {
                if (data < currentNode.data) {
                    if (currentNode.left == null) {
                        currentNode.left = newNode;
                        break;
                    } else {
                        currentNode = currentNode.left;
                    }
                } else {
                    if (currentNode.right == null) {
                        currentNode.right = newNode;
                        break;
                    } else {
                        currentNode = currentNode.right;
                    }
                }
            }

        }

    }

    public int lookUp(int data){
        TreeNode currentNode = root;
            while (currentNode !=null && currentNode.data != data){
                if(data <  currentNode.data){
                    currentNode = currentNode.left;
                }else {
                    currentNode = currentNode.right;
                }
            }

            return ( currentNode!= null ? currentNode.data : -1);

    }

    /*public void removeNode(int data){
        TreeNode currentNode = root;
        if(currentNode.data == data && currentNode.right !=null){
            currentNode = currentNode.right;
        }
       while (currentNode != null){
           if(data < currentNode.data){
               currentNode = currentNode.left;
           }

       }
    }*/

    /*private void traverseTree(TreeNode currentNode, int data){
       if (currentNode !=null && currentNode.data != data){
            if(data <  currentNode.data){
                traverseTree(currentNode.left, data);
            }else {
                traverseTree(currentNode.right, data);
            }
        }

        System.out.println(currentNode.data+" he");


    }*/

}
