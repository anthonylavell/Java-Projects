/*
You are given two lists of closed intervals, firstList and secondList,
where firstList[i] = [starti, endi] and secondList[j] = [startj, endj].
Each list of intervals is pairwise disjoint and in sorted order.

Return the intersection of these two interval lists.

A closed interval [a, b] (with a <= b) denotes the set of real numbers x
with a <= x <= b.

The intersection of two closed intervals is a set of real numbers that are
either empty or represented as a closed interval. For example, the intersection
of [1, 3] and [2, 4] is [2, 3].
 */
package code_patterns.merge_intervals;

import java.util.ArrayList;
import java.util.List;

public class IntervalListIntersections {
    public static void main(String[] args) {
        int[][] firstList = {{0,2},{5,10},{13,23},{24,25}};
        int[][] secondList = {{1,5},{8,12},{15,24},{25,26}};

        int[][] firstList2 = {{14,16}};
        int[][] secondList2 = {{7,13},{16,20}};
        int[][] resultList = intervalIntersection(firstList2,secondList2);
    }

    public static int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        List<int[]> tempList = new ArrayList<>();
        int fCount = 0;
        int sCount = 0;
        while (fCount < firstList.length && sCount < secondList.length){
            if(firstList[fCount][1] >= secondList[sCount][0] && secondList[sCount][1] >= firstList[fCount][0]){
                int loNum =  Math.max(firstList[fCount][0], secondList[sCount][0]);
                int hiNum;
                if(firstList[fCount][1] >= secondList[sCount][1]){
                    hiNum = secondList[sCount][1];
                    sCount++;
                }else {
                    hiNum = firstList[fCount][1];
                    fCount++;
                }
                tempList.add(new int[]{loNum,hiNum});
            }else if(firstList[fCount][1] < secondList[sCount][0]){
                fCount++;
            }else {
                sCount++;
            }
        }

        return tempList.toArray(new int[tempList.size()][2]);
    }

    public static int[][] intervalIntersection2(int[][] firstList, int[][] secondList) {
        List<int[]> tempList = new ArrayList<>();
        int fCount = 0;
        int sCount = 0;
        while (fCount < firstList.length && sCount < secondList.length){
            int loNum = Math.max(firstList[fCount][0], secondList[sCount][0]);
            int hiNum = Math.min(firstList[fCount][1], secondList[sCount][1]);
            if(loNum<=hiNum){
                tempList.add( new int[] {loNum,hiNum});

            }
            if(firstList[fCount][1] < secondList[sCount][1]){
                fCount++;
            }else {
                sCount++;
            }
        }

        return tempList.toArray(new int[tempList.size()][2]);
    }
}
