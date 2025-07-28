package comp_p.pay_pal;
/*
 * Given a list of songs and an initial song, find the longest sequence of songs
 * that follow the "word chain" rule (next song starts with the last word of the
 * previous song) without repeating songs.
 *
 * @param songs       An array of song titles as strings.
 * @param initialSong The starting song, which is not part of the list.
 * @return A list of song titles representing the longest sequence found, or an
 *         empty list if no sequence can be formed.
 */

import java.util.*;

public class Songs {
    public static void main(String[] args) {
        String[] songs = {"A 1", "1 2", "1 3", "2 3", "3 4"};
        String initialSong = "Start A"; // Not part of the list
        System.out.println(longestChain(songs,initialSong));

    }
    public static List<String> longestChain(String[] songs, String initialSong) {
        int len = songs.length;
        String[] first = new String[len], last = new String[len];
        for (int i = 0; i < len; i++) {
            String s = songs[i].trim();
            String[] parts = s.split("\\s+");
            first[i] = parts[0];
            last[i]  = parts[parts.length - 1];
        }
        HashMap<String,List<Integer>>startMap = new HashMap<>();
        for (int i = 0; i < len; i++) {
            startMap
                    .computeIfAbsent(first[i], k -> new ArrayList<>())
                    .add(i);
        }
        List<String> best = new ArrayList<>();
        Deque<String> path = new ArrayDeque<>();
        boolean[] used = new boolean[len];
        String initLast = getLastWord(initialSong);
        dfs(initLast,songs,startMap,used,path,best,first,last);
        return best;
    }

    private static void dfs(String currWord, String[] songs, Map<String, List<Integer>> startMap,
                     boolean[] used, Deque<String> path, List<String> best, String[] first,
                     String[] last) {
        // Update best if path longer
        if (path.size() > best.size()) {
            best.clear();
            best.addAll(path);
        }
        // Try all next songs starting with currWord
        List<Integer> candidates = startMap.get(currWord);
        if (candidates == null) return;

        for (int idx : candidates) {
            if (used[idx]) continue;
            used[idx] = true;
            path.addLast(songs[idx]);

            dfs(last[idx], songs, startMap, used, path, best, first, last);

            path.removeLast();
            used[idx] = false;
        }
    }
    private static String getFirstWord(String sentence){
        String [] words = (sentence.isEmpty()) ? new String[]{""} : sentence.split(" ");
        return words[0];
    }
    private static String getLastWord(String sentence){
        String [] words = (sentence.isEmpty()) ? new String[]{""} : sentence.split(" ");
        return words[words.length-1];
    }

}
