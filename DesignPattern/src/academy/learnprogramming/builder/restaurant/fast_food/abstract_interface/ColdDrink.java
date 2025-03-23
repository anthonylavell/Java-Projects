package academy.learnprogramming.builder.restaurant.fast_food.abstract_interface;

import academy.learnprogramming.builder.restaurant.fast_food.concrete_class.Bottle;

public abstract class ColdDrink implements Items {
    @Override
    public abstract String itemName();

    @Override
    public abstract double price();

    @Override
    public Packing packItem() {
       return new Bottle();
    }
}
