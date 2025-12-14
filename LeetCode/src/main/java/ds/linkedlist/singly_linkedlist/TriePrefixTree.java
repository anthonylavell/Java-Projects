package ds.linkedlist.singly_linkedlist;

public class TriePrefixTree {
    static class Node{
        Node[]children;
        boolean found;
        public Node(){
            children = new Node[26];
        }

    }
    private Node root;
    public TriePrefixTree(){
        this.root = new Node();
    }
    public void insert(String word) {
        Node current = root;
        for (char ch : word.toCharArray()){
            int idx = ch-'a';
            if (current.children[idx] == null)
                current.children[idx] = new Node();
            current = current.children[idx];
        }
        int i = 0;
        current.found = true;
    }

    public boolean search(String word) {
        Node current = root;
        for (char ch : word.toCharArray()){
            int idx = ch-'a';
            if (current.children[idx] == null)
                return false;
            current = current.children[idx];
        }
        return current.found;
    }

    public boolean startsWith(String prefix) {
        Node current = root;
        for (char ch : prefix.toCharArray()){
            int idx = ch-'a';
            if (current.children[idx] == null)
                return false;
            current = current.children[idx];
        }
        return true;
    }

    public static void main(String[] args) {
        TriePrefixTree trie = new TriePrefixTree();
        trie.insert("ant");
        System.out.println(trie.search("ant"));
        System.out.println(trie.search("nat"));
    }
}
