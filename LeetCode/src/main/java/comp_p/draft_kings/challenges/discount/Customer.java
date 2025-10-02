package comp_p.draft_kings.challenges.discount;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Customer {
    private String name;
    private int spend;

    public Customer(String name, int spend) {
        this.name = name;
        this.spend = spend;
    }
}
