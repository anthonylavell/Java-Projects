package arraysandstrings.array.two_dimensional.merge_intervals;

import arraysandstrings.array.two_dimensional.merge_intervals.client.Interval;

import java.util.ArrayList;
import java.util.List;

public class IntervalSchedule {

    public static void main(String[] args) {
        int [][] arr = {{1,3},{2,6},{8,10},{15,18}};
      List<Interval> interval = new ArrayList<>();
        for(int [] num : arr){
            //List<Interval> list1 = new ArrayList<>();
            //list1.add());
            interval.add(new Interval(num[0],num[1]));
        }
        mergeInterval(interval);
    }

    public static List<Interval>mergeInterval(List<Interval> interval){
        List<Interval>newMerge = new ArrayList<>();
        int start = interval.get(0).start;
        int end = interval.get(0).end;
        for(int i = 0; i <= interval.size(); i++){
            if(i == interval.size() || end < interval.get(i).start){
                newMerge.add(new Interval(start,end));
                if(i < interval.size()){
                    start = interval.get(i).start;
                    end = interval.get(i).end;
                    }
                continue;
                }
            end = interval.get(i).end;
            }
        return newMerge;
    }
}
