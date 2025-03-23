package academy.learnprogramming.builder.vehicle.builder_interface;

import academy.learnprogramming.builder.vehicle.product.Product;

public interface BuilderInterface {
    void buildBody();
    void insertWheels();
    void addHeadlights();
    Product getVehicle();
}
