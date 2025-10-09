package comp_p.draft_kings.challenges.fantasy_sport;

public class Player {
    private int id;
    private TeamPosition position;
    private int teamId;
    private int nextGameId;
    private int salary;
    private int avgPointsPerGame;

    public Player(int id, TeamPosition position, int teamId, int nextGameId, int salary, int avgPointsPerGame) {
        this.id = id;
        this.position = position;
        this.teamId = teamId;
        this.nextGameId = nextGameId;
        this.salary = salary;
        this.avgPointsPerGame = avgPointsPerGame;
    }
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public TeamPosition getPosition() { return position; }
    public void setPosition(TeamPosition position) { this.position = position; }
    public int getTeamId() { return teamId; }
    public void setTeamId(int teamId) { this.teamId = teamId; }
    public int getNextGameId() { return nextGameId; }
    public void setNextGameId(int nextGameId) { this.nextGameId = nextGameId; }
    public int getSalary() { return salary; }
    public void setSalary(int salary) { this.salary = salary; }
    public int getAvgPointsPerGame() { return avgPointsPerGame; }
    public void setAvgPointsPerGame(int avgPointsPerGame) { this.avgPointsPerGame = avgPointsPerGame; }
}
