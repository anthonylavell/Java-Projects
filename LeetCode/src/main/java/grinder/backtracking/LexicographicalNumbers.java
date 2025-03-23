package grinder.backtracking;

import java.util.ArrayList;
import java.util.List;

public class LexicographicalNumbers {
    public static void main(String[] args) {
        System.out.println(lexicalOrder(100));
    }
    public static List<Integer> lexicalOrder(int n) {
        List<Integer> listOfNum = new ArrayList<>(n);
        findLexicalOrder(n,1,listOfNum);
        return listOfNum;
    }

    private static void findLexicalOrder(int n, int storeNum, List<Integer>listOfNum){
        if (storeNum>n){
            return;
        }
        for(int count = 0; count <= 9; count++){
            if(storeNum <= n && listOfNum.size()<n) {
                listOfNum.add(storeNum);
                findLexicalOrder(n, (storeNum * 10) , listOfNum);
                storeNum++;
            }else {
                break;
            }
        }
    }
}
