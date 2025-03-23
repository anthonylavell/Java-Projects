package leetcode.list.two_dimensional;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        /*List<List<Integer>> generate = new ArrayList<>();
        generate.add(new ArrayList<>(Arrays.asList(1)));
        generate.add( new ArrayList<>(Arrays.asList(1,1)));
        generate.add( new ArrayList<>(Arrays.asList(1,2,1)));
        generate.add(  new ArrayList<>(Arrays.asList(1,3,3,1)));
        generate.add(  new ArrayList<>(Arrays.asList(1,4,6,4,1)));
        System.out.println("generate size = " + generate.size());
        System.out.println("generate = " + generate);
        System.out.println("generate index 4 = " + generate.get(4).get(1));*/
        System.out.println("Generate: "+generate(6));

    }
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> listOfNumbers = new ArrayList<>();
        for(int row =0; row < numRows; row++){
            List<Integer>tempList = new ArrayList<>();
            for(int col = 0; col < (row+1); col++){
                if(col == 0 || col ==row){
                    tempList.add(1);
                    continue;
                }
                    tempList.add( (listOfNumbers.get(row-1).get(col)+ listOfNumbers.get(row-1).get(col-1)));
            }
            listOfNumbers.add(tempList);
        }
        return listOfNumbers;
    }
}
