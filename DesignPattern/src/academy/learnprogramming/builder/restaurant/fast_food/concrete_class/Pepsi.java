package academy.learnprogramming.builder.restaurant.fast_food.concrete_class;

import academy.learnprogramming.builder.restaurant.fast_food.abstract_interface.ColdDrink;

public class Pepsi extends ColdDrink {
    @Override
    public String itemName() {
        return "Pepsi";
    }

    @Override
    public double price() {
        return 1.50;
    }
}
