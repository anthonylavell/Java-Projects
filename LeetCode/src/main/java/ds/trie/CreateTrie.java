package ds.trie;

public class CreateTrie {

    public static void main(String[] args) {
        TrieNode headTrie = new TrieNode();
        String word = "did";
        insertTrie(headTrie,word);
        insertTrie(headTrie,"dog");
        System.out.println(searchTrie(headTrie,word));
        System.out.println(searchTrie(headTrie,"di"));
        System.out.println(startWithTrie(headTrie,"di"));
        System.out.println(deleteTrie(headTrie,"di"));
        System.out.println(deleteTrie(headTrie,word));
        System.out.println(searchTrie(headTrie,word));
    }

    public static void insertTrie(TrieNode headTrie, String word){
        TrieNode tailTrie = headTrie;
        for(char ch : word.toCharArray()){
            if(tailTrie.children.get(ch) == null){
                tailTrie.children.put(ch,new TrieNode());
            }
            tailTrie = tailTrie.children.get(ch);
        }
        tailTrie.isCompleteWord=true;
    }

    public static boolean searchTrie(TrieNode headTrie,String word){
        TrieNode tailTrie = helpSearch(headTrie,word);
        char ch = word.charAt(word.length()-1);
        return (tailTrie == null || !tailTrie.children.get(ch).isCompleteWord) ? false : true;
    }

    public static boolean startWithTrie(TrieNode headTrie, String word){
        TrieNode tailTrie = helpSearch(headTrie,word);
        return (tailTrie == null) ? false : true;
    }

    public static  boolean deleteTrie(TrieNode headTrie, String word){
        TrieNode tailTrie = helpSearch(headTrie,word);
        char ch = word.charAt(word.length()-1);
        boolean torF = false;
        if(tailTrie != null && tailTrie.children.get(ch).isCompleteWord){
            tailTrie.children.get(ch).isCompleteWord = false;
            torF = true;
        }
        return torF;
    }

    private static TrieNode helpSearch(TrieNode headTrie, String word){
        TrieNode tailTrie = headTrie;
        for(int i = 0; i < word.length(); i++){
            char ch = word.charAt(i);
            if(tailTrie.children.get(ch) == null){
                return null;
            }
            if(i < word.length()-1){
                tailTrie = tailTrie.children.get(ch);
            }

        }
        return tailTrie;
    }
}
