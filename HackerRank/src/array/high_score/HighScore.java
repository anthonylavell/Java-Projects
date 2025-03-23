package array.high_score;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class HighScore {
    public static int [] climbingLeaderboard(int [] scores, int [] alice){
        Set<Integer> setScore =  Arrays.stream(scores).boxed().collect(Collectors.toCollection(LinkedHashSet::new));
        Integer[] tempArr = setScore.stream().toArray(Integer[]::new);
        int [] arrayOfHighScore = new int [alice.length];
        int placeMent = tempArr.length;
        int aliceCount = 0;
        int count = tempArr.length-1;
       while (count >= 0){
           if(aliceCount >= alice.length){
               break;
           }
            if(alice[aliceCount] >= tempArr[count] && count > 0){
               placeMent--;
           }else {
               if(count <= 0 && alice[aliceCount] >= tempArr[count]){
                   arrayOfHighScore[aliceCount] = 1;
               }else{
                   arrayOfHighScore[aliceCount] = placeMent+1;
               }

               aliceCount++;
               continue;
           }
            count--;
        }
        return arrayOfHighScore;
    }
}
