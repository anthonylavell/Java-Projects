package academy.learnprogramming.builder.restaurant.fast_food.client;

import academy.learnprogramming.builder.restaurant.fast_food.builder_interface.MealBuilder;
import academy.learnprogramming.builder.restaurant.fast_food.builder_concrete_class.NonVegMealBuilder;
import academy.learnprogramming.builder.restaurant.fast_food.builder_concrete_class.VegMealBuilder;
import academy.learnprogramming.builder.restaurant.fast_food.director.MealDirector;
import academy.learnprogramming.builder.restaurant.fast_food.product.Meal;

public class FastFoodClient {
    public static void main(String[] args) {
        MealDirector director = new MealDirector();
        MealBuilder nonVegMeal = new NonVegMealBuilder();
        MealBuilder vegMeal = new VegMealBuilder();

        director.mealConstruct(nonVegMeal);
       Meal meal = nonVegMeal.getMeal();

        System.out.println("***Non Veg Meal***");
        meal.showItems();

        director.mealConstruct(vegMeal);
        System.out.println("\n***Veg Meal***");
        meal = vegMeal.getMeal();
        meal.showItems();

    }
}
