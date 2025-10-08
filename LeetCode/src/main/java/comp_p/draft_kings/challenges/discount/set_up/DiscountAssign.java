package comp_p.draft_kings.challenges.discount.set_up;

import java.util.List;

public class DiscountAssign {
    public static String[] getDiscounts(){
        String discount = "d1,200";
        String discount2 = "d2,700";
        String discount3 = "d3,900";
        String discount4 = "d4,1000";
        String discount5 = "d5,400";
        String discount6 = "d6,2000";
        return new String[]{discount,discount2,discount3,discount4,discount5,discount6};
    }

    public static List<String> getDiscountsList(){
        String discount = "d1,200";
        String discount2 = "d2,700";
        String discount3 = "d3,900";
        String discount4 = "d4,1000";
        String discount5 = "d5,400";
        String discount6 = "d6,2000";
        return List.of(discount,discount2,discount3,discount4,discount5,discount6);
    }

    public static String getDiscountsJSON(){
        String path = "C:\\Users\\Anthony\\Documents\\Programming\\Code\\Java-Projects\\LeetCode\\src\\main\\resources\\jsonfile\\discount_promo.json";
        return path;
    }
}
