package leetcode.list.main;

import java.util.*;

public class topKFrequentWordsMain {
    public static void main(String[] args) {
        String [] words = {"i", "love", "leetcode", "i", "love", "coding"};
        Map<String, Integer> mapOfWords = new HashMap<>();
        for(String word : words){
            if(!mapOfWords.containsKey(word)){
                mapOfWords.put(word, 0);
            }
            mapOfWords.put(word, mapOfWords.get(word)+1);
        }
        System.out.println(mapOfWords);
        PriorityQueue<Map.Entry<String, Integer>> pq =
                new PriorityQueue<>((a,b) -> (a.getValue() == b.getValue()) ?
                        a.getKey().compareTo(b.getKey()) : a.getValue()-b.getValue()
                );
        for(Map.Entry<String, Integer> word : mapOfWords.entrySet()){
                pq.add(word);
                if(pq.size() >2 ){
                    pq.remove();
                }
        }
        List<String> result = new ArrayList<>();
        for(int i =0; i < 2; i++){
            result.add(pq.remove().getKey());
        }
        System.out.println("--------------------------------------------------");
        System.out.println("result = " + result);
        System.out.println("--------------------------------------------------");

    }
}
