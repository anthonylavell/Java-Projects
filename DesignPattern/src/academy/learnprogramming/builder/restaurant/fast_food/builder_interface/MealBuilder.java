package academy.learnprogramming.builder.restaurant.fast_food.builder_interface;

import academy.learnprogramming.builder.restaurant.fast_food.product.Meal;

public interface  MealBuilder {
    void buildBurger();
    void buildDrink();
    Meal getMeal();
}
