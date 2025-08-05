package comp_p.pay_pal;

import java.util.*;

public class StaffingSolution {

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

    public static class Staffing {
        /**
         * @param staffAvailabilities  A list where each element is one staff member’s list of availability intervals.
         * @param slots                A list of time slots with required staff counts.
         * @return all slots for which the number of staff whose availability fully covers that slot
         *         is less than the slot’s required count.
         */
        public static List<TimeSlot> findUnderstaffedSlots(List<List<Interval>> staffAvailabilities,List<TimeSlot> slots) {
            List<TimeSlot> understaffed = new ArrayList<>();

            // Precompute staff intervals in minutes
            List<List<int[]>> staffMinutes = new ArrayList<>(staffAvailabilities.size());
            for (List<Interval> avail : staffAvailabilities) {
                List<int[]> mins = new ArrayList<>();
                for (Interval iv : avail) {
                    mins.add(new int[]{ toMinutes(iv.getStart()), toMinutes(iv.getEnd()) });
                }
                staffMinutes.add(mins);
            }

            // For each slot, count staff who fully cover it
            for (TimeSlot slot : slots) {
                int sStart = toMinutes(slot.getStart());
                int sEnd   = toMinutes(slot.getEnd());
                int count  = 0;

                for (List<int[]> staffIntervals : staffMinutes) {
                    // check if any one interval covers the entire slot
                    boolean covers = false;
                    for (int[] iv : staffIntervals) {
                        if (iv[0] <= sStart && iv[1] >= sEnd) {
                            covers = true;
                            break;
                        }
                    }
                    if (covers) {
                        count++;
                    }
                }

                if (count < slot.getRequired()) {
                    understaffed.add(slot);
                }
            }

            return understaffed;
        }

        // utility: parse "HH:mm" into minutes since midnight
        private static int toMinutes(String hhmm) {
            String[] parts = hhmm.split(":");
            int h = Integer.parseInt(parts[0]);
            int m = Integer.parseInt(parts[1]);
            return h * 60 + m;
        }
    }

    // --- Test harness ---
    public static void main(String[] args) {
        // Case 1
        List<List<Interval>> staff1 = List.of(
                List.of(new Interval("09:00","12:00")),
                List.of(new Interval("10:00","14:00")),
                List.of(new Interval("11:00","15:00"))
        );
        List<TimeSlot> slots1 = List.of(
                new TimeSlot("09:00","10:00", 2),
                new TimeSlot("10:00","11:00", 3),
                new TimeSlot("11:00","12:00", 3),
                new TimeSlot("12:00","13:00", 1),
                new TimeSlot("13:00","15:00", 2)
        );
        System.out.println("Understaffed slots (Case 1): " +
                Staffing.findUnderstaffedSlots(staff1, slots1));

        // Case 2
        List<List<Interval>> staff2 = List.of(
                List.of(new Interval("08:00","17:00")),
                List.of(new Interval("08:00","17:00"))
        );
        List<TimeSlot> slots2 = List.of(
                new TimeSlot("09:00","12:00", 1),
                new TimeSlot("12:00","15:00", 2),
                new TimeSlot("15:00","17:00", 1)
        );
        System.out.println("Understaffed slots (Case 2): " +
                Staffing.findUnderstaffedSlots(staff2, slots2));

        // Case 3
        List<List<Interval>> staff3 = List.of(
                List.of(new Interval("09:00","11:00"), new Interval("13:00","15:00")),
                List.of(new Interval("10:00","12:00"))
        );
        List<TimeSlot> slots3 = List.of(
                new TimeSlot("09:00","10:00", 2),
                new TimeSlot("10:00","11:00", 2),
                new TimeSlot("11:00","12:00", 2),
                new TimeSlot("13:00","15:00", 2)
        );
        System.out.println("Understaffed slots (Case 3): " +
                Staffing.findUnderstaffedSlots(staff3, slots3));

        // Case 4
        List<List<Interval>> staff4 = List.of(
                List.of(new Interval("00:00","23:59"))
        );
        List<TimeSlot> slots4 = List.of(
                new TimeSlot("00:00","23:59", 2)
        );
        System.out.println("Understaffed slots (Case 4): " +
                Staffing.findUnderstaffedSlots(staff4, slots4));
    }
}

