package ds.trie;

import java.util.HashMap;
import java.util.Map;

public class TrieNode {
    public Map<Character, TrieNode> children = new HashMap<>();
    public boolean isCompleteWord;
    public TrieNode(){
        children = new HashMap<>();
    }
    /*public TrieNode(Character ch){
        children.putIfAbsent(ch,new TrieNode() );
        this.isCompleteWord = false;
    }*/


}
