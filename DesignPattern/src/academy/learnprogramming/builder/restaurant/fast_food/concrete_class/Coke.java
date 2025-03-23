package academy.learnprogramming.builder.restaurant.fast_food.concrete_class;

import academy.learnprogramming.builder.restaurant.fast_food.abstract_interface.ColdDrink;

public class Coke extends ColdDrink {
    @Override
    public String itemName() {
        return "Coca cola";
    }

    @Override
    public double price() {
        return 2.40;
    }
}
