package academy.learnprogramming.builder.restaurant.four_star.builder_interface;

import academy.learnprogramming.builder.restaurant.four_star.product.SteakHouse;

public interface FourStarMealBuilder {
    void SteakBuilder();
    void WineBuilder();
    SteakHouse getMeal();
}
