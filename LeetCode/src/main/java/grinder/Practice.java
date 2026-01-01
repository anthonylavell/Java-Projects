package grinder;

class Node{
    Node[] children;
    boolean isFound;
    public Node(){
        children = new Node[26];
    }

}

public class Practice {
    private Node root;
    public Practice() {
        root = new Node();
    }

    public void insert(String word) {
        Node node = root;
        for (char ch: word.toCharArray()){
            if (node.children[ch-'a'] == null){
                node.children[ch-'a'] = new Node();
            }
            node = node.children[ch-'a'];
        }
        node.isFound = true;
    }

    public boolean search(String word) {
        Node node = root;
        for (char ch: word.toCharArray()){
            node = node.children[ch-'a'];
            if ( node == null){
                break;
            }
        }
        return node != null && node.isFound;
    }

    public boolean startsWith(String prefix) {
            Node node = root;
            for (char ch: prefix.toCharArray()){
                node = node.children[ch-'a'];
                 if ( node == null){
                    return false;
                }
            }
        return true;
    }

    public static void main(String[] args) {
        Practice practice = new Practice();
        practice.insert("app");
        practice.insert("apple");
        practice.insert("beer");
        practice.insert("add");
        practice.insert("jam");
        practice.insert("rental");

        System.out.println("Search:");
        System.out.println(practice.search("apps"));
        System.out.println(practice.search("app"));
        System.out.println(practice.search("ad"));
        System.out.println(practice.search("applepie"));
        System.out.println(practice.search("rest"));
        System.out.println(practice.search("jan"));
        System.out.println(practice.search("rent"));
        System.out.println(practice.search("beer"));
        System.out.println(practice.search("jam"));

        System.out.println("StartWith");
        System.out.println(practice.startsWith("apps"));
        System.out.println(practice.startsWith("app"));
        System.out.println(practice.startsWith("ad"));
        System.out.println(practice.startsWith("applepie"));
        System.out.println(practice.startsWith("rest"));
        System.out.println(practice.startsWith("jan"));
        System.out.println(practice.startsWith("rent"));
        System.out.println(practice.startsWith("beer"));
        System.out.println(practice.startsWith("jam"));



    }
}
