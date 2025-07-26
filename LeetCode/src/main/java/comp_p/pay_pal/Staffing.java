package comp_p.pay_pal;

import java.util.List;

/**
 * Represents a half-open interval [start, end) in 24-hour "HH:mm" format.
 */
class Interval {
    String start;  // e.g. "09:00"
    String end;    // e.g. "12:30"
    // constructor, getters, equals/hashCode omitted for brevity
}

/**
 * A time slot with a staffing requirement.
 */
class TimeSlot {
    String start;
    String end;
    int required;
    // constructor, getters, equals/hashCode omitted for brevity
}

public class Staffing {
    /**
     * @param staffAvailabilities  A list where each element is one staff member’s list of availability intervals.
     * @param slots                A list of time slots with required staff counts.
     * @return all slots for which the number of staff whose availability **fully covers** that slot
     *         is < the slot’s required count.
     */
    public static List<TimeSlot> findUnderstaffedSlots(
            List<List<Interval>> staffAvailabilities,
            List<TimeSlot> slots
    ) {
        // TODO: implement
        return null;
    }
}

