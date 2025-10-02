package comp_p.draft_kings.challenges.discount;

import comp_p.draft_kings.challenges.discount.set_up.CustomerAssign;
import comp_p.draft_kings.challenges.discount.set_up.DiscountAssign;

import java.util.*;

public class Shopping {
    public static void main(String[] args) {
       getShoppingDiscounts2(CustomerAssign.getCustomers(), DiscountAssign.getDiscounts());
    }

    public static Map<String,List<String>> getShoppingDiscounts(Customer[]customers, Discount[] discounts){
        Map<String,List<String>> mapOfDiscounts = new HashMap<>();
        Arrays.sort(customers,(row1, row2)-> Integer.compare(row2.getSpend(),row1.getSpend()));
        Arrays.sort(discounts,(row1, row2)-> Integer.compare(row2.getAmount(),row1.getAmount()));
        for (Customer customer : customers){
            int totalAmount = (int)(customer.getSpend()*.20);
            int numOfDiscounts = 3;
            List<String>promo = new ArrayList<>();
            for (int index = 0; (index< discounts.length && numOfDiscounts>0);index++){
                if (totalAmount>=discounts[index].getAmount()){
                    promo.add(discounts[index].getName());
                    totalAmount-=discounts[index].getAmount();
                    numOfDiscounts--;
                }
            }
            mapOfDiscounts.put(customer.getName(), promo);
        }
        int i = 0;
        return mapOfDiscounts;

    }

    public static String[][] getShoppingDiscounts2(Customer[]customers, Discount[] discounts){
        String[][] customerDiscounts = new String[customers.length][3];
        Arrays.sort(customers,(row1, row2)-> Integer.compare(row2.getSpend(),row1.getSpend()));
        Arrays.sort(discounts,(row1, row2)-> Integer.compare(row2.getAmount(),row1.getAmount()));
        for (int row = 0; row< customers.length; row++){
            int totalAmount = (int)(customers[row].getSpend()*.20);
            int numOfDiscounts = 3;
            customerDiscounts[row][0]=customers[row].getName();
            for (int index = 0; (index< discounts.length && numOfDiscounts>0);index++){
                if (totalAmount>=discounts[index].getAmount()){
                    customerDiscounts[row][3-numOfDiscounts]=discounts[index].getName();
                    totalAmount-=discounts[index].getAmount();
                    numOfDiscounts--;
                }
            }
        }
        int i = 0;
        return customerDiscounts;

    }


}
