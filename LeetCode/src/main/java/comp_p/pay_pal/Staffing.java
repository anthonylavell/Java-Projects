package comp_p.pay_pal;

import java.util.List;

public class Staffing {
    /**
     * Represents a half-open interval [start, end) in "HH:mm" format.
     */
    public static class Interval {
        private final String start;
        private final String end;

        public Interval(String start, String end) {
            this.start = start;
            this.end = end;
        }

        public String getStart() { return start; }
        public String getEnd()   { return end;   }
    }

    /**
     * A time slot with a staffing requirement.
     */
    public static class TimeSlot {
        private final String start;
        private final String end;
        private final int required;

        public TimeSlot(String start, String end, int required) {
            this.start = start;
            this.end = end;
            this.required = required;
        }

        public String getStart()    { return start;    }
        public String getEnd()      { return end;      }
        public int    getRequired() { return required; }

        @Override
        public String toString() {
            return String.format("[\"%s\"-\"%s\", req=%d]", start, end, required);
        }
    }
    public static class staff{
        /*public static List<StaffingSolution.TimeSlot> findUnderstaffedSlots(
                List<List<StaffingSolution.Interval>> staff,
                List<StaffingSolution.TimeSlot> slots)
        {

        }*/

        private static int getMinutes(String hm){
            String[] time = hm.split(":");
            int hour = Integer.parseInt(time[0]);
            int min = Integer.parseInt(time[1]);
            return hour*60+min;
        }


    }
    public static void main(String[] args) {
        // Case 1
        List<List<StaffingSolution.Interval>> staff1 = List.of(
                List.of(new StaffingSolution.Interval("09:00","12:00")),
                List.of(new StaffingSolution.Interval("10:00","14:00")),
                List.of(new StaffingSolution.Interval("11:00","15:00"))
        );
        List<StaffingSolution.TimeSlot> slots1 = List.of(
                new StaffingSolution.TimeSlot("09:00","10:00", 2),
                new StaffingSolution.TimeSlot("10:00","11:00", 3),
                new StaffingSolution.TimeSlot("11:00","12:00", 3),
                new StaffingSolution.TimeSlot("12:00","13:00", 1),
                new StaffingSolution.TimeSlot("13:00","15:00", 2)
        );
        System.out.println("Understaffed slots (Case 1): " +
                StaffingSolution.Staffing.findUnderstaffedSlots(staff1, slots1));
    }
}
