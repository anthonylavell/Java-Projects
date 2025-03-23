package academy.learnprogramming.builder.restaurant.fast_food.director;

import academy.learnprogramming.builder.restaurant.fast_food.builder_interface.MealBuilder;

public class MealDirector {
    MealBuilder myMealBuilder;

    public void mealConstruct(MealBuilder builder){
        myMealBuilder = builder;
        myMealBuilder.buildBurger();
        myMealBuilder.buildDrink();
        myMealBuilder.getMeal();
    }
}
