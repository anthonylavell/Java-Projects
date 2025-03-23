package academy.learnprogramming.builder.restaurant.four_star.concrete_class;

import academy.learnprogramming.builder.restaurant.four_star.abstract_interface.Steak;

public class PorterHouseSteak extends Steak {
    @Override
    public double price() {
        return 40.00;
    }

    @Override
    public String itemName() {
        return "Porter House Steak";
    }
}
