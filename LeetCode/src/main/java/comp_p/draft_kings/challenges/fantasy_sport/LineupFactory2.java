package comp_p.draft_kings.challenges.fantasy_sport;

import java.util.*;

public class LineupFactory2 {

    /// <summary>
    /// Determines whether the given lineup is valid
    /// </summary>
    /// <param name="contest">The contest for which the given lineup has been submitted</param>
    /// <param name="lineup">The list of players on a fantasy team</param>
    /// <returns>Whether the lineup is valid according to the given rules</returns>
    public boolean validLineup(Contest contest, List<TeamPlayer> lineup) {
        if (contest == null || lineup == null) return false;

        // The sum of player salary can not exceed the contests max salary cap
        int salarySum = 0;
        for (TeamPlayer tp : lineup) {
            if (tp == null || tp.getPlayer() == null) return false;
            salarySum += tp.getPlayer().getSalary();
        }
        if (salarySum > contest.getMaximumSalaryCap()) return false;

        // Any single player can only be used once
        Set<Integer> playerIds = new HashSet<>();
        for (TeamPlayer tp : lineup) {
            int playerId = tp.getPlayer().getId();
            if (!playerIds.add(playerId)) return false; // duplicate found
        }

        // Track actual fantasy position counts while validating allowed team positions
        Map<FantasyPosition, Integer> required = contest.getRosterPositionCount();
        if (required == null || required.isEmpty()) return false;

        Map<FantasyPosition, Integer> actual = new HashMap<>();
        for (TeamPlayer tp : lineup) {
            FantasyPosition fp = tp.getFantasyPosition();
            if (fp == null) return false;

            // Validate that the player's real team position is allowed for the fantasy slot
            TeamPosition teamPos = tp.getPlayer().getPosition();
            if (fp.getAllowedPositions() == null || !fp.getAllowedPositions().contains(teamPos)) {
                return false;
            }

            actual.put(fp, actual.getOrDefault(fp, 0) + 1);
        }

        // The lineup can not contain more than the required amount of players
        // and must fill exactly the required amount (no missing, no extra)
        for (Map.Entry<FantasyPosition, Integer> e : required.entrySet()) {
            int have = actual.getOrDefault(e.getKey(), 0);
            if (have != e.getValue()) return false;
        }
        // Ensure no extra fantasy positions beyond those required
        for (FantasyPosition fp : actual.keySet()) {
            if (!required.containsKey(fp)) return false;
        }

        // There can not be more than 3 players on a single team
        Map<Integer, Integer> teamPlayerCount = new HashMap<>();
        for (TeamPlayer tp : lineup) {
            int teamId = tp.getPlayer().getTeamId();
            teamPlayerCount.put(teamId, teamPlayerCount.getOrDefault(teamId, 0) + 1);
            if (teamPlayerCount.get(teamId) > 3) return false;
        }

        // The lineup must encompass at least two games
        Set<Integer> gameIds = new HashSet<>();
        for (TeamPlayer tp : lineup) {
            gameIds.add(tp.getPlayer().getNextGameId());
        }
        if (gameIds.size() < 2) return false;

        // All checks passed
        return true;
    }

    class Contest {
        private Map<FantasyPosition, Integer> rosterPositionCount;
        private int maximumSalaryCap;
        private int id;

        public Contest(Map<FantasyPosition, Integer> rosterPositionCount,
                       int maximumSalaryCap, int id) {
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

    class TeamPlayer {
        private FantasyPosition fantasyPosition;
        private Player player;

        public FantasyPosition getFantasyPosition() { return fantasyPosition; }
        public void setFantasyPosition(FantasyPosition fantasyPosition) { this.fantasyPosition = fantasyPosition; }
        public Player getPlayer() { return player; }
        public void setPlayer(Player player) { this.player = player; }
    }

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

    class FantasyPosition {
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

    class TeamPosition {
        private String name;
        private int id;

        public TeamPosition(String name, int id) {
            this.name = name;
            this.id = id;
        }
        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
        public int getId() { return id; }
        public void setId(int id) { this.id = id; }
    }
}
