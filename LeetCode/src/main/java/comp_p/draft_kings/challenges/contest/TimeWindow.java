package comp_p.draft_kings.challenges.contest;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Setter
@Getter
public class TimeWindow {
    private LocalDate start;
    private LocalDate end;
    private List<String> reasons;

    public TimeWindow(){}

    public TimeWindow(LocalDate start, LocalDate end, List<String> reasons) {
        this.start = start;
        this.end = end;
        this.reasons = reasons;
    }

    @Override
    public String toString() {
        return "start=" + start +
                ", end=" + end +
                ", reasons=" + reasons +
                '}';
    }
}
