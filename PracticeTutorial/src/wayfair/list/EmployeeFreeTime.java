package wayfair.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeFreeTime {
    public List<Interval> employeeFreeTime(List<List<Interval>> schedule) {
        List<Interval> intervals = new ArrayList<>();
        for (int i = 0; i < schedule.size(); i++) {
            for (int j = 0; j < schedule.get(i).size(); j++) {
                intervals.add(schedule.get(i).get(j));
            }
        }
        Collections.sort(intervals, (a, b) -> a.start - b.start);
        Interval temp = intervals.get(0);
        List<Interval> res = new ArrayList<>();
        for (int i = 1; i < intervals.size(); i++) {
            if (intervals.get(i).start > temp.end) {
                res.add(new Interval(temp.end, intervals.get(i).start));
            }
            temp = temp.end < intervals.get(i).end ? intervals.get(i) : temp;
        }
        return res;
    }
}
