package array.high_score;

import java.util.*;
import java.util.stream.Collectors;

public class TestHighScore {

    public static void main(String[] args) {
        //int [] scores = {100,100,70,60};
        int [] scores = {100,100,50,40,40,20,10};
        int [] alice = {100,100,100,100};
        //int [] alice = {5,25,50,120};
        int count = 3;
        int [] arrayOfHighScore = new int[alice.length];
        Set<Integer> setScore = Arrays.stream(scores).boxed().collect(Collectors.toCollection(LinkedHashSet::new));
        /*List<Integer> tempArr = new ArrayList<>(setScore);
        tempArr.add(alice[count]);*/
        Integer[] tempArr = setScore.stream().toArray(Integer[]::new);
        /*Collections.sort(tempArr, Collections.reverseOrder());
        arrayOfHighScore[0] = tempArr.indexOf(alice[count])+1;*/
        //System.out.println(arrayOfHighScore[0]);
        int [] returnScores = HighScore.climbingLeaderboard(scores,alice);
       for(int score : returnScores){
            System.out.println(score);
        }
    }
}
