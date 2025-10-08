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
    private double discountTotal;

    public Customer(String name, int spend) {
        this.name = name;
        this.spend = spend;
        this.promoCodes = new ArrayList<>();
        discountTotal =0.0;
    }

    public void addPromo(String discount){
        promoCodes.add(discount);
    }

    public void addDiscountAmount(double amount){
         discountTotal += Math.round(amount*100.0)/100.0;
    }

}
