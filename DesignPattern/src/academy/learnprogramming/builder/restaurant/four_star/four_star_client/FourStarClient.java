package academy.learnprogramming.builder.restaurant.four_star.four_star_client;

import academy.learnprogramming.builder.restaurant.four_star.builder_concrete_class.PorterHouseSteakBuilder;
import academy.learnprogramming.builder.restaurant.four_star.builder_concrete_class.TBoneSteakBuilder;
import academy.learnprogramming.builder.restaurant.four_star.fourStarDirector.FourStarDirector;
import academy.learnprogramming.builder.restaurant.four_star.product.SteakHouse;

public class FourStarClient {
    public static void main(String[] args) {
        FourStarDirector director = new FourStarDirector();
        PorterHouseSteakBuilder porterHouse = new PorterHouseSteakBuilder();
        TBoneSteakBuilder tBone = new TBoneSteakBuilder();

        director.mealConstruct(porterHouse);
        SteakHouse meal = porterHouse.getMeal();
        System.out.println("****Porter House Steak****");
        meal.showMealOrder();

        director.mealConstruct(tBone);
        meal = tBone.getMeal();
        System.out.println("\n****T-Bone Steak****");
        meal.showMealOrder();
    }
}
