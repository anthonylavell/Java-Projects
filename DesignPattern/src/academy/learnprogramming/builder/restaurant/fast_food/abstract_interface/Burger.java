package academy.learnprogramming.builder.restaurant.fast_food.abstract_interface;

import academy.learnprogramming.builder.restaurant.fast_food.concrete_class.Wrapper;

public abstract class Burger implements Items {
    @Override
    public abstract String itemName();

    @Override
    public abstract double price();

    @Override
    public Packing packItem() {
       return new Wrapper();
    }
}
