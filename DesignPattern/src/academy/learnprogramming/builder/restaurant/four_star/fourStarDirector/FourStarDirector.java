package academy.learnprogramming.builder.restaurant.four_star.fourStarDirector;

import academy.learnprogramming.builder.restaurant.four_star.builder_interface.FourStarMealBuilder;

public class FourStarDirector {

    FourStarMealBuilder mealBuilder;

    public void mealConstruct(FourStarMealBuilder meal){
        mealBuilder = meal;
        mealBuilder.SteakBuilder();
        mealBuilder.WineBuilder();
        mealBuilder.getMeal();

    }

}
