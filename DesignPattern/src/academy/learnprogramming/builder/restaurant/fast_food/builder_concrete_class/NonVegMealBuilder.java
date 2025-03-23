package academy.learnprogramming.builder.restaurant.fast_food.builder_concrete_class;

import academy.learnprogramming.builder.restaurant.fast_food.builder_interface.MealBuilder;
import academy.learnprogramming.builder.restaurant.fast_food.concrete_class.ChickenBurger;
import academy.learnprogramming.builder.restaurant.fast_food.concrete_class.Pepsi;
import academy.learnprogramming.builder.restaurant.fast_food.product.Meal;

public class NonVegMealBuilder implements MealBuilder {
    private Meal meal = new Meal();
    @Override
    public void buildBurger() {
        meal.addItem(new ChickenBurger());
    }

    @Override
    public void buildDrink() {
        meal.addItem(new Pepsi());
    }

    @Override
    public Meal getMeal() {
        return meal;
    }
}
