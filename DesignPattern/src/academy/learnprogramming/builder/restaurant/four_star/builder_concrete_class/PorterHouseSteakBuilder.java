package academy.learnprogramming.builder.restaurant.four_star.builder_concrete_class;

import academy.learnprogramming.builder.restaurant.four_star.builder_interface.FourStarMealBuilder;
import academy.learnprogramming.builder.restaurant.four_star.concrete_class.PorterHouseSteak;
import academy.learnprogramming.builder.restaurant.four_star.concrete_class.RedWine;
import academy.learnprogramming.builder.restaurant.four_star.product.SteakHouse;

public class PorterHouseSteakBuilder implements FourStarMealBuilder {
    private SteakHouse steakHouse = new SteakHouse();
    @Override
    public void SteakBuilder() {
        steakHouse.orderItem(new PorterHouseSteak());
    }

    @Override
    public void WineBuilder() {
        steakHouse.orderItem(new RedWine());
    }

    @Override
    public SteakHouse getMeal() {
        return steakHouse;
    }
}
