package academy.learnprogramming.builder.restaurant.four_star.concrete_class;

import academy.learnprogramming.builder.restaurant.four_star.abstract_interface.Steak;

public class TBoneSteak extends Steak {
    @Override
    public double price() {
        return 35.00;
    }

    @Override
    public String itemName() {
        return "T-Bone Steak";
    }
}
