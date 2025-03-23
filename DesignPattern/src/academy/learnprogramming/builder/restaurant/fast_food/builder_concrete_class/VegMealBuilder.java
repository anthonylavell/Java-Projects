package academy.learnprogramming.builder.restaurant.fast_food.builder_concrete_class;

import academy.learnprogramming.builder.restaurant.fast_food.builder_interface.MealBuilder;
import academy.learnprogramming.builder.restaurant.fast_food.concrete_class.Coke;
import academy.learnprogramming.builder.restaurant.fast_food.concrete_class.VegBurger;
import academy.learnprogramming.builder.restaurant.fast_food.product.Meal;

public class VegMealBuilder implements MealBuilder {
    private Meal vegMeal = new Meal();
    @Override
    public void buildBurger() {
        vegMeal.addItem(new VegBurger());
    }

    @Override
    public void buildDrink() {
        vegMeal.addItem(new Coke());
    }

    @Override
    public Meal getMeal() {
        return vegMeal;
    }
}
