package comp_p.draft_kings.challenges.fantasy_sport;

import java.util.List;

public class FantasyPosition {
    private List<TeamPosition> allowedPositions;
    private String name;
    private int id;

    public FantasyPosition(List<TeamPosition> allowedPositions, String name, int id) {
        this.allowedPositions = allowedPositions;
        this.name = name;
        this.id = id;
    }
    public List<TeamPosition> getAllowedPositions() { return allowedPositions; }
    public void setAllowedPositions(List<TeamPosition> allowedPositions) { this.allowedPositions = allowedPositions; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
}
