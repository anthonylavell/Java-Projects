package academy.learnprogramming.builder.restaurant.fast_food.concrete_class;

import academy.learnprogramming.builder.restaurant.fast_food.abstract_interface.Burger;

public class ChickenBurger extends Burger {
    @Override
    public String itemName() {
        return "Chicken Burger";
    }

    @Override
    public double price() {
        return 8.50;
    }
}
