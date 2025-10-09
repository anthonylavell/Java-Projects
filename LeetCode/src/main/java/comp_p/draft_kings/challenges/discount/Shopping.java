

package comp_p.draft_kings.challenges.discount;

import comp_p.draft_kings.challenges.discount.parse_data.ParseData;
import comp_p.draft_kings.challenges.discount.set_up.CustomerAssign;
import comp_p.draft_kings.challenges.discount.set_up.DiscountAssign;
import org.json.JSONObject;

import java.util.Comparator;
import java.util.List;

public class Shopping {
    private List<Customer> customers;
    private List<Discount> discounts;
    public Shopping(){
    }
    public static void main(String[] args) {
        Shopping shopping = new Shopping();
        shopping.sendJSONDATA(CustomerAssign.getCustomersJSON(), DiscountAssign.getDiscountsJSON());
        List<Customer> customers = shopping.getCustomersWithDiscount();
        customers.forEach(a->{
            //System.out.printf("Customer Name: %s |  Spend Amount: $%d |  Discount Amount: $%.2f | Discount Codes: %s%n",
            //a.getName(),a.getSpend(),a.getDiscountTotal(),a.getPromoCodes());
            JSONObject json = a.toJson();
            System.out.println(json.toString());
        });

    }
    public void sendJSONDATA(String customerData, String discountData){
        this.customers = ParseData.sendCustomerData(customerData);
        this.discounts = ParseData.sendDiscountData(discountData);
    }

    public List<Customer>getCustomersWithDiscount(){
        customers.sort(Comparator.comparingDouble(Customer::getSpend).reversed());
        discounts.sort(Comparator.comparingInt(Discount::getAmount).reversed());
        int prevPromoAmount = Integer.MAX_VALUE;
        for (int cIndex = 0; cIndex < customers.size(); cIndex++){
            int totalOfPromo = 0;
            double currentSpent =  (customers.get(cIndex).getSpend()*.20);
            int promoAmount = 0;
            boolean isMoreThanPrevAmount = (cIndex ==0 || customers.get(cIndex-1).getSpend()== customers.get(cIndex).getSpend());
            for (int dIndex = 0; (dIndex<discounts.size() && totalOfPromo < 3); dIndex++){
                int discountAmount = discounts.get(dIndex).getAmount();
                int currentPromoAmount = promoAmount+discountAmount;
                if ((!isMoreThanPrevAmount && currentPromoAmount >= prevPromoAmount) || currentSpent < discountAmount ){
                    continue;
                }
                customers.get(cIndex).addPromo(discounts.get(dIndex).getName());
                currentSpent-=discountAmount;
                promoAmount=currentPromoAmount;
                totalOfPromo++;
            }
            customers.get(cIndex).addDiscountAmount(promoAmount);
            prevPromoAmount = promoAmount;
        }
        //int i = 0;
        return customers;
    }
}
