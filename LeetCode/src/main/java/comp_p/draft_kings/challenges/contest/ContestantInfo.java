package comp_p.draft_kings.challenges.contest;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Setter
@Getter
public class ContestantInfo {
    private String playId;
    private boolean eligible;
    List<TimeWindow>window;

    public ContestantInfo(){}

    public ContestantInfo(String playId, boolean eligible, List<TimeWindow> window) {
        this.playId = playId;
        this.eligible = eligible;
        this.window = window;
    }
}
