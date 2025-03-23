package ds.node;

public class LinkedList {
        private Node root;

        public void insert(int value){
            Node newNode = new Node(value);
            if(root == null){
                root = newNode;

                    return;
            }
            Node current = root;
           Node parent;
            while (true){
                parent = current;
                current = current.next;
                if(current == null){
                   parent.next = newNode;
                    break;
                }
            }
        }

        public void display(){
            Node current = root;
            while (current !=null){
                System.out.println(current.value);
                current = current.next;
            }
        }


}
