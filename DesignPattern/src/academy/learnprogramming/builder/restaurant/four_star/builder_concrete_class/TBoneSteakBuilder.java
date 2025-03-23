package academy.learnprogramming.builder.restaurant.four_star.builder_concrete_class;

import academy.learnprogramming.builder.restaurant.four_star.builder_interface.FourStarMealBuilder;
import academy.learnprogramming.builder.restaurant.four_star.concrete_class.TBoneSteak;
import academy.learnprogramming.builder.restaurant.four_star.concrete_class.WhiteWine;
import academy.learnprogramming.builder.restaurant.four_star.product.SteakHouse;

public class TBoneSteakBuilder implements FourStarMealBuilder {
    SteakHouse steakHouse = new SteakHouse();
    @Override
    public void SteakBuilder() {
        steakHouse.orderItem(new TBoneSteak());
    }

    @Override
    public void WineBuilder() {
        steakHouse.orderItem(new WhiteWine());
    }

    @Override
    public SteakHouse getMeal() {
        return steakHouse;
    }
}
