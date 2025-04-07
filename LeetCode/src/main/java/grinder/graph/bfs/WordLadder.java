package grinder.graph.bfs;

import java.util.*;

public class WordLadder {
    public static void main(String[] args) {
        String beginWord = "hit", endWord = "cog";
        List<String> wordList = List.of("hot","dot","dog","lot","log","cog");
        System.out.println(ladderLength(beginWord,endWord,wordList));
    }

    public static int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if(!wordList.contains(endWord)){
            return 0;
        }
        Deque<String> deque = new ArrayDeque<>();
        Set<String> visited = new HashSet<>(wordList);
        deque.add(beginWord);
        for(int found = 1; !deque.isEmpty(); found++){
            int size = deque.size();
            while (size-- > 0){
                String currentWord = deque.pop();
                if (currentWord.equals(endWord)){
                    return found;
                }
                char[] wordChars = currentWord.toCharArray();
                for(int index = 0; index < wordChars.length; index++){
                    char originalChar = wordChars[index];
                    for (char c = 'a'; c <= 'z'; c++) {
                        if (c == originalChar) {
                            continue;
                        }
                        wordChars[index] = c;
                        String newWord = new String(wordChars);
                        if(visited.contains(newWord)){
                            deque.add(newWord);
                            visited.remove(newWord);
                        }
                    }
                    wordChars[index]=originalChar;
                }
            }
        }
        return 0;
    }
}
