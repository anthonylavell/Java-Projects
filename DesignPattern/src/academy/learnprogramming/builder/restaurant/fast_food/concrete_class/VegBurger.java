package academy.learnprogramming.builder.restaurant.fast_food.concrete_class;

import academy.learnprogramming.builder.restaurant.fast_food.abstract_interface.Burger;

public class VegBurger extends Burger {
    @Override
    public String itemName() {
        return "Veg Burger";
    }

    @Override
    public double price() {
        return 10.00;
    }
}
