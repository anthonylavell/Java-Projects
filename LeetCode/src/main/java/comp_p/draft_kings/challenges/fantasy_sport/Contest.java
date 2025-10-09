package comp_p.draft_kings.challenges.fantasy_sport;

import java.util.Map;

public class Contest {
    private Map<FantasyPosition, Integer> rosterPositionCount;
    private int maximumSalaryCap;
    private int id;

    public Contest(Map<FantasyPosition, Integer> rosterPositionCount, int maximumSalaryCap, int id) {
        this.rosterPositionCount = rosterPositionCount;
        this.maximumSalaryCap = maximumSalaryCap;
        this.id = id;
    }

    public Map<FantasyPosition, Integer> getRosterPositionCount() { return rosterPositionCount; }
    public void setRosterPositionCount(Map<FantasyPosition, Integer> rosterPositionCount) { this.rosterPositionCount = rosterPositionCount; }
    public int getMaximumSalaryCap() { return maximumSalaryCap; }
    public void setMaximumSalaryCap(int maximumSalaryCap) { this.maximumSalaryCap = maximumSalaryCap; }
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
}
