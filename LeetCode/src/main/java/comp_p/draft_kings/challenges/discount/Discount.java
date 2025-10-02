package comp_p.draft_kings.challenges.discount;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Discount {
    private String name;
    private int amount;

    public Discount(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }
}
