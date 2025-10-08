package comp_p.draft_kings.challenges.discount.set_up;

import java.util.List;

public class CustomerAssign {
    public static String[] getCustomers(){
        String customer = "C1,21000";
        String customer2 = "C2,1000";
        String customer3 = "C3,200";
        String customer4 = "C4,2000";
        String customer5 = "C5,10000";
        String customer6 = "C6,20000";
        return new String[]{customer,customer2,customer3,customer4,customer5,customer6};
    }
    public static List<String> getCustomersList(){
        String customer = "C1,21000";
        String customer2 = "C2,1000";
        String customer3 = "C3,200";
        String customer4 = "C4,2000";
        String customer5 = "C5,10000";
        String customer6 = "C6,20000";
        return List.of(customer,customer2,customer3,customer4,customer5,customer6);
    }
    public static String getCustomersJSON(){
        String path = "C:\\Users\\Anthony\\Documents\\Programming\\Code\\Java-Projects\\LeetCode\\src\\main\\resources\\jsonfile\\customer_with_spending.json";
        return path;
    }


}
