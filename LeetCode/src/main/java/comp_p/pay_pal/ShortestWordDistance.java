package comp_p.pay_pal;

public class ShortestWordDistance {
    public int shortestDistance(String[] wordsDict, String word1, String word2) {
        int first = -1;
        int second = -1;
        int total = Integer.MAX_VALUE;
        for (int index = 0; index < wordsDict.length; index++){
            String key = wordsDict[index];
            if (key.equals(word1)){
                if (second > -1){
                    total = Math.min(total,Math.abs(index -second));
                }
               first = index;
            }else if (key.equals(word2)){
                if (first > -1){
                    total = Math.min(total,Math.abs(index -first));
                }
                second = index;
            }
        }
        return total;
    }

    public static void main(String[] args) {

    }
}
