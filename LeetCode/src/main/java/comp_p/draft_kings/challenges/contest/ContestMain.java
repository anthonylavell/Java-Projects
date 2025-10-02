package comp_p.draft_kings.challenges.contest;

import comp_p.draft_kings.json.PlayerData;

public class ContestMain {
    public static void main(String[] args) {
        Contest contest =  new Contest();
        contest.setContests(PlayerData.getPlayerData());
        for (ContestantInfo contestant : contest.getContests()){
            System.out.println("player_id: " + contestant.getPlayId());
            System.out.println("eligible: " + contestant.isEligible());
            System.out.println("reasons: " + contestant.window);
        }
    }
}
