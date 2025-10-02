package comp_p.draft_kings.challenges;

import java.util.Arrays;

public class MaximumUnitsOnATruck {
    public static void main(String[] args) {
        int[][] boxTypes = {{5,10},{2,5},{4,7},{3,9}};
        int truckSize = 10;
        System.out.println(maximumUnits(boxTypes,truckSize));
    }
    public static int maximumUnits(int[][] boxTypes, int truckSize) {
        int max = 0;
        Arrays.sort(boxTypes,(row1,row2)-> Integer.compare(row2[1],row1[1]));
        for (int index = 0; (index< boxTypes.length && truckSize>0); index++){
            int boxes = Math.min(boxTypes[index][0],truckSize);
            int units = boxTypes[index][1];
            truckSize-=boxes;
            max+=(boxes*units);
        }
        return max;
    }
}
