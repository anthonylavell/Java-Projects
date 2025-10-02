package comp_p.draft_kings.challenges.discount.set_up;

import comp_p.draft_kings.challenges.discount.Discount;

public class DiscountAssign {
    public static Discount[] getDiscounts(){
        Discount discount = new Discount("d1",200);
        Discount discount2 = new Discount("d2",700);
        Discount discount3 = new Discount("d3",900);
        Discount discount4 = new Discount("d4",1000);
        Discount discount5 = new Discount("d5",400);
        Discount discount6 = new Discount("d6",2000);
        return new Discount[]{discount,discount2,discount3,discount4,discount5,discount6};
    }
}
