package comp_p.draft_kings.challenges.discount;

import lombok.Getter;
import lombok.ToString;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;


@Getter
@ToString
public class Customer {
    private String name;
    private int spend;
    private List<String>promoCodes;
    private double discountTotal;

    public Customer(String name, int spend) {
        this.name = name;
        this.spend = spend;
        this.promoCodes = new ArrayList<>();
        discountTotal =0;
    }

    public void addPromo(String discount){
        promoCodes.add(discount);
    }

    public void addDiscountAmount(int amount){
         discountTotal = amount;
    }
    public JSONObject toJson(){
        JSONObject json = new JSONObject();
        json.put("Customer Name", name);
        json.put("Spend Amount", spend);
        json.put("Discount Amount",discountTotal);
        json.put("Discount Codes",promoCodes);
        return json;
    }

}
