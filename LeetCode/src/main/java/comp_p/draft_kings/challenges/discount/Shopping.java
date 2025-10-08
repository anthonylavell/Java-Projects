

package comp_p.draft_kings.challenges.discount;

import comp_p.draft_kings.challenges.discount.set_up.CustomerAssign;
import comp_p.draft_kings.challenges.discount.set_up.DiscountAssign;
import lombok.Getter;
import org.json.JSONArray;
import org.json.JSONObject;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Getter
class Customer2 {
    private String name;
    private double spend;
    private List<String>promoCodes;

    public Customer2(String name, int spend) {
        this.name = name;
        this.spend = spend;
        this.promoCodes = new ArrayList<>();
    }

    public void addPromo(String discount){
        promoCodes.add(discount);
    }

}

@Getter
class Discount2 {
    private String name;
    private int amount;

    public Discount2(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }
}

public class Shopping {
    private List<Customer2> customers;
    private List<Discount2> discounts;
    public Shopping(){
        this.customers = new ArrayList<>();
        this.discounts = new ArrayList<>();
    }
    public static void main(String[] args) {
        Shopping shopping = new Shopping();
        shopping.sendJSONDATA(CustomerAssign.getCustomersJSON(), DiscountAssign.getDiscountsJSON());
        List<Customer2> customers2 = shopping.getCustomersWithDiscount();
        customers2.forEach(a->{
            System.out.printf("Customer Name: %s | Spend Amount: $%.2f | Discount Codes: %s%n",
            a.getName(),a.getSpend(),a.getPromoCodes());
        });

    }
    public void sendJSONDATA(String customerData, String discountData){
        sendCustomerData(customerData);
        sendDiscountData(discountData);
    }

    private void sendCustomerData(String path){
        try {
            String jsonText = new String(Files.readAllBytes(Paths.get(path)));
            JSONArray jsonArray = new JSONArray(jsonText);
            for (int index = 0; index < jsonArray.length(); index++){
                JSONObject object = jsonArray.getJSONObject(index);
                String name = object.optString("customer_name");
                int spend = object.optInt("amount");
                customers.add(new Customer2(name,spend));
            }
        }catch (Exception e){
            System.out.println("File not found");
            e.printStackTrace();
        }
    }

    private void sendDiscountData(String path){
        try {
            String jsonText = new String(Files.readAllBytes(Paths.get(path)));
            JSONArray jsonArray = new JSONArray(jsonText);
            for (int index = 0; index < jsonArray.length(); index++){
                JSONObject object = jsonArray.getJSONObject(index);
                String name = object.getString("discount_name");
                int amount = object.optInt("amount");
                discounts.add(new Discount2(name,amount));
            }

        }catch (Exception e){
            System.out.println("File not found");
            e.printStackTrace();
        }
    }
    public List<Customer2>getCustomersWithDiscount(){

        customers.sort(Comparator.comparingDouble(Customer2::getSpend).reversed());
        discounts.sort(Comparator.comparingInt(Discount2::getAmount).reversed());
        double prevPromoAmount = Double.MAX_VALUE;
        for (int cIndex = 0; cIndex < customers.size(); cIndex++){
            int totalOfPromo = 0;
            double currentSpent = customers.get(cIndex).getSpend()*.20;
            double promoAmount = 0.0;
            boolean isMoreThanPrevAmount = (cIndex ==0 || customers.get(cIndex-1).getSpend()== customers.get(cIndex).getSpend());
            for (int dIndex = 0; (dIndex<discounts.size() && totalOfPromo < 3); dIndex++){
                double discountAmount = discounts.get(dIndex).getAmount();
                double currentPromoAmount = promoAmount+discountAmount;
                if ((!isMoreThanPrevAmount && currentPromoAmount >= prevPromoAmount) || currentSpent < discountAmount ){
                    continue;
                }
                customers.get(cIndex).addPromo(discounts.get(dIndex).getName());
                currentSpent-=discounts.get(dIndex).getAmount();
                promoAmount=currentPromoAmount;
                totalOfPromo++;
            }
            prevPromoAmount = promoAmount;
        }
        int i = 0;
        return customers;
    }
}
