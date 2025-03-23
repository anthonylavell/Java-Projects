package challenges.practice_challenge.binary_tree;

public class TestBinaryTree {
    public static void main(String[] args) {
        BinaryTree bTree = new BinaryTree();
       /* bTree.insert(30);
        bTree.insert(50);
        bTree.insert(20);
        bTree.insert(40);
        bTree.insert(60);
        bTree.insert(10);
        bTree.insert(25);*/
        bTree.insert(9);
        bTree.insert(4);
        bTree.insert(6);
        bTree.insert(20);
        bTree.insert(170);
        bTree.insert(15);
        bTree.insert(1);
        //bTree.removeNode(8);


        System.out.println(bTree.lookUp(15));

    }
}
