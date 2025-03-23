/*
In a special ranking system,
each voter gives a rank from highest to lowest to all teams participated in the competition.
 */
package atlassian;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class RankTeamsByVote {
    public static void main(String[] args) {
        String [] votes = {"ABC","ACB","ABC","ACB","ACB"};
        char ch = 65;
        System.out.println(String.valueOf(ch));
        rankTeams(votes);
    }
    public static String rankTeams(String[] votes) {
        Map<Character, int[]> map = new HashMap<>();
        Arrays.stream(votes).forEach(vote ->{
            char[] voteArr = vote.toCharArray();
            for(int i=0; i<vote.length(); i++){
                int[] rank = map.getOrDefault(voteArr[i], new int[vote.length()]);
                rank[i]++;
                map.putIfAbsent(voteArr[i], rank);
            }
        });
        // printMap(map);

        return map.keySet().stream().sorted((a,b) -> {
            int[] arr1 = map.get(a);
            int[] arr2 = map.get(b);
            for(int i=0; i<arr1.length; i++){
                if(arr1[i] != arr2[i])
                    return arr2[i]-arr1[i];
            }
            return a-b;

        }).map(String::valueOf).collect(Collectors.joining());
    }
}
