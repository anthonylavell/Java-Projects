package comp_p.draft_kings.challenges.contest;

import org.json.JSONArray;
import org.json.JSONObject;

import java.time.LocalDate;
import java.util.*;

public class Contest {
    private Map<String, List<ContestEntry>> mapOfContests;
    private boolean isEligible;

    public Contest(){
        this.mapOfContests = new HashMap<>();
        isEligible = false;
    }

    public void setContests(String playerData){
        JSONObject jsonObject = new JSONObject(playerData);
        JSONArray contestData = jsonObject.getJSONArray("data");
        for (int indx = 0; indx < contestData.length(); indx++){
            JSONObject contestant = contestData.getJSONObject(indx);
             String playId = contestant.getString("player_id");
             String contestId = contestant.getString("contest_id");
             int amountSpent = contestant.getInt("amount_spent");
             int pointsScored = contestant.getInt("points_scored");
             LocalDate contestDate = LocalDate.parse(contestant.getString("contest_date"));
             mapOfContests.putIfAbsent(playId,new ArrayList<ContestEntry>());
             mapOfContests.get(playId).add(new ContestEntry(playId,contestId,amountSpent,pointsScored,contestDate));
        }
        for (Map.Entry<String,List<ContestEntry>> entry : mapOfContests.entrySet()){
            entry.getValue().sort(Comparator.comparing(ContestEntry::getContestDate));
        }
    }
    public List<ContestantInfo> getContests(){
        List<ContestantInfo> listOfContests  = new ArrayList<>();
        for (Map.Entry<String,List<ContestEntry>> entry : mapOfContests.entrySet()){
            int count = 0;
            boolean isCount = false;
            boolean isSpend = false;
            boolean isScored = false;
            boolean isTorF = false;
            List<String>listOfReasons = new ArrayList<>();
            List<TimeWindow>listOfSlot = new ArrayList<>();
            LocalDate sTime = null;
            LocalDate eTime = null;
            int totalSpend = 0;
            for (ContestEntry contest : entry.getValue()){
                LocalDate currentDate = contest.getContestDate();
                if (sTime == null || currentDate.isAfter(eTime)){
                    if (eTime!= null && currentDate.isAfter(eTime)&&!listOfReasons.isEmpty()){
                        listOfSlot.add(new TimeWindow(sTime,eTime,listOfReasons));
                    }
                    isTorF = isTorF || isCount || isScored || isSpend;
                    sTime = currentDate;
                    eTime = currentDate.plusDays(6);
                    listOfReasons = new ArrayList<>();
                    totalSpend = 0;
                    count=0;
                    isCount = false;
                    isSpend = false;
                    isScored = false;
                }
                totalSpend+= contest.getAmountSpent();
                count++;

                if (!isSpend && totalSpend >= 100){
                   isSpend = true;
                   listOfReasons.add("High Spender");
                }
                if (!isScored && contest.getPointsScored() >= 150){
                    isScored = true;
                    listOfReasons.add("High Scorer");
                }
                if (!isCount && count >= 3){
                    isCount = true;
                    listOfReasons.add("High Participator");
                }
            }
            isTorF = isTorF || isCount || isScored || isSpend;
            if (!listOfReasons.isEmpty()){
                listOfSlot.add(new TimeWindow(sTime,eTime,listOfReasons));
            }

                listOfContests.add(new ContestantInfo(entry.getKey(),isTorF,listOfSlot));
        }
        return listOfContests;
    }
}
