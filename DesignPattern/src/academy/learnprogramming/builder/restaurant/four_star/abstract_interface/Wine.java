package academy.learnprogramming.builder.restaurant.four_star.abstract_interface;

import academy.learnprogramming.builder.restaurant.four_star.concrete_class.Glass;

public abstract class Wine implements Item {
    @Override
    public abstract double price();

    @Override
    public abstract String itemName();

    @Override
    public Packing packItem() {
        return new Glass();
    }
}
