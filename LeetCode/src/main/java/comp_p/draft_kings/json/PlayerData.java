package comp_p.draft_kings.json;

public class PlayerData {
    public static String getPlayerData(){
        return """
                {   data:[
                            {
                                "player_id":"P1",
                                    "contest_id":"C100",
                                    "amount_spent":25,
                                    "points_scored":120,
                                    "contest_date":"2025-09-01"
                            },
                            {
                                "player_id":"P2",
                                    "contest_id":"C101",
                                    "amount_spent":10,
                                    "points_scored":50,
                                    "contest_date":"2025-09-02"
                            },
                            {
                                "player_id":"P1",
                                    "contest_id":"C102",
                                    "amount_spent":50,
                                    "points_scored":200,
                                    "contest_date":"2025-09-02"
                            },
                            {
                                "player_id":"P1",
                                    "contest_id":"C103",
                                    "amount_spent":20,
                                    "points_scored":20,
                                    "contest_date":"2025-09-12"
                            }
                        ]
                }
                """;
    }
}
