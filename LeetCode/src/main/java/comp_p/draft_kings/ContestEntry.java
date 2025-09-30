package comp_p.draft_kings;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
@Getter
@Setter
@ToString
public class ContestEntry {
    private String playId;
    private String contestId;
    private int amountSpent;
    private int pointsScored;
    private LocalDate contestDate;

    public ContestEntry(){}

    public ContestEntry(String playId, String contestId,int amountSpent, int pointsScored, LocalDate contestDate){
        this.playId = playId;
        this.contestId = contestId;
        this.amountSpent=amountSpent;
        this.pointsScored=pointsScored;
        this.contestDate = contestDate;
    }
}
