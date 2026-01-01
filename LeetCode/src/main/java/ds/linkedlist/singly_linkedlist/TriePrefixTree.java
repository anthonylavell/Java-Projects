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
        trie.insert("app");
        trie.insert("apple");
        trie.insert("beer");
        trie.insert("add");
        trie.insert("jam");
        trie.insert("rental");

        System.out.println("Search:");
        System.out.println(trie.search("apps"));
        System.out.println(trie.search("app"));
        System.out.println(trie.search("ad"));
        System.out.println(trie.search("applepie"));
        System.out.println(trie.search("rest"));
        System.out.println(trie.search("jan"));
        System.out.println(trie.search("rent"));
        System.out.println(trie.search("beer"));
        System.out.println(trie.search("jam"));

        System.out.println("StartWith");
        System.out.println(trie.startsWith("apps"));
        System.out.println(trie.startsWith("app"));
        System.out.println(trie.startsWith("ad"));
        System.out.println(trie.startsWith("applepie"));
        System.out.println(trie.startsWith("rest"));
        System.out.println(trie.startsWith("jan"));
        System.out.println(trie.startsWith("rent"));
        System.out.println(trie.startsWith("beer"));
        System.out.println(trie.startsWith("jam"));
    }
}
