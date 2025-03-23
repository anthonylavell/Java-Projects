package academy.learnprogramming.builder.restaurant.four_star.concrete_class;

import academy.learnprogramming.builder.restaurant.four_star.abstract_interface.Packing;

public class Plate implements Packing {
    @Override
    public String pack() {
        return "Fancy plate";
    }
}
