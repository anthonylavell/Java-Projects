package comp_p.draft_kings.challenges.discount;

import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;


@Getter
@ToString
public class Customer {
    private String name;
    private double spend;
    private List<String>promoCodes;

    public Customer(String name, int spend) {
        this.name = name;
        this.spend = spend;
        this.promoCodes = new ArrayList<>();
    }

    public void addPromo(String discount){
        promoCodes.add(discount);
    }

}
