package comp_p.draft_kings.challenges.discount.parse_data;

import comp_p.draft_kings.challenges.discount.Customer;
import comp_p.draft_kings.challenges.discount.Discount;
import org.json.JSONArray;
import org.json.JSONObject;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ParseData {
    public static List<Customer> sendCustomerData(String path){
        List<Customer> customers = new ArrayList<>();
        try {
            String jsonText = new String(Files.readAllBytes(Paths.get(path)));
            JSONArray jsonArray = new JSONArray(jsonText);
            for (int index = 0; index < jsonArray.length(); index++){
                JSONObject object = jsonArray.getJSONObject(index);
                String name = object.optString("customer_name");
                int spend = object.optInt("amount");
                customers.add(new Customer(name,spend));
            }
        }catch (Exception e){
            System.out.println("File not found");
            e.printStackTrace();
        }
        return customers;
    }

    public static List<Discount> sendDiscountData(String path){
        List<Discount> discounts = new ArrayList<>();
        try {
            String jsonText = new String(Files.readAllBytes(Paths.get(path)));
            JSONArray jsonArray = new JSONArray(jsonText);
            for (int index = 0; index < jsonArray.length(); index++){
                JSONObject object = jsonArray.getJSONObject(index);
                String name = object.getString("discount_name");
                int amount = object.optInt("amount");
                discounts.add(new Discount(name,amount));
            }

        }catch (Exception e){
            System.out.println("File not found");
            e.printStackTrace();
        }
        return discounts;
    }
}
