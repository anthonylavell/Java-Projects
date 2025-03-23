package ds.trie;

import java.util.HashMap;
import java.util.Map;

public class ImplementTrie {

    private Map<Character, ImplementTrie> children;
    private boolean isCompleteWord;

    public ImplementTrie() {

        children = new HashMap<>();
    }
    public static void main(String[] args) {
        ImplementTrie headTrie = new ImplementTrie();
        String word = "did";
        headTrie.insertTrie(word);
        headTrie.insertTrie("dog");
        System.out.println(headTrie.searchTrie(word));
        System.out.println(headTrie.searchTrie("di"));
        System.out.println(headTrie.startWithTrie("di"));
        System.out.println(headTrie.deleteTrie("di"));
        System.out.println(headTrie.deleteTrie(word));
        System.out.println(headTrie.searchTrie(word));
    }

    public void insertTrie(String word){
        Map<Character, ImplementTrie>  tailTrie = children;
        for(int i = 0; i < word.length(); i++){
            char ch = word.charAt(i);
            if(tailTrie.get(ch) == null){
                tailTrie.put(ch,new ImplementTrie());
            }
            if(i < word.length()-1){
                tailTrie = tailTrie.get(ch).children;
            }
        }
        tailTrie.get(word.charAt(word.length()-1)).isCompleteWord=true;
    }

    public boolean searchTrie(String word){
        Map<Character, ImplementTrie>  tailTrie = helpSearch(word);
        char ch = word.charAt(word.length()-1);
        return (tailTrie != null && tailTrie.get(ch).isCompleteWord) ? true : false;
    }

    public  boolean startWithTrie(String word){
        Map<Character, ImplementTrie>  tailTrie = helpSearch(word);
        return (tailTrie == null) ? false : true;
    }

    public  boolean deleteTrie(String word){
        Map<Character, ImplementTrie>  tailTrie = helpSearch(word);
        char ch = word.charAt(word.length()-1);
        boolean torF = false;
        if(tailTrie != null && tailTrie.get(ch).isCompleteWord){
            tailTrie.get(ch).isCompleteWord = false;
            torF = true;
        }
        return torF;
    }

    private Map<Character, ImplementTrie> helpSearch(String word){
        Map<Character, ImplementTrie>  tailTrie = children;
        for(int i = 0; i < word.length(); i++){
            char ch = word.charAt(i);
            if(tailTrie.get(ch) == null){
                return null;
            }
            if(i < word.length()-1){
                tailTrie = tailTrie.get(ch).children;
            }

        }
        return tailTrie;
    }
}
