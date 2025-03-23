package academy.learnprogramming.builder.restaurant.four_star.concrete_class;

import academy.learnprogramming.builder.restaurant.four_star.abstract_interface.Wine;

public class RedWine extends Wine {
    @Override
    public double price() {
        return 20.00;
    }

    @Override
    public String itemName() {
        return "Red Wine";
    }
}
