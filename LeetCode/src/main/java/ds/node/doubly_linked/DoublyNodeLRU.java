package ds.node.doubly_linked;

public class DoublyNodeLRU {
        public DoublyNodeLRU next;
        public DoublyNodeLRU prev;
        public int key;
        public int val;
        public DoublyNodeLRU(int key, int val){
            this.key = key;
            this.val = val;
        }
}
