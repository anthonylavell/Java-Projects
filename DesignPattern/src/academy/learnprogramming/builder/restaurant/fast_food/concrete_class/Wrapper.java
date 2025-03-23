package academy.learnprogramming.builder.restaurant.fast_food.concrete_class;

import academy.learnprogramming.builder.restaurant.fast_food.abstract_interface.Packing;

public class Wrapper implements Packing {
    @Override
    public String pack() {
        return "Wrapper";
    }
}
