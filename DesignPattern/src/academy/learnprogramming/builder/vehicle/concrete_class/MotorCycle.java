package academy.learnprogramming.builder.vehicle.concrete_class;

import academy.learnprogramming.builder.vehicle.builder_interface.BuilderInterface;
import academy.learnprogramming.builder.vehicle.product.Product;

public class MotorCycle implements BuilderInterface {
    private Product product = new Product();

    @Override
    public void buildBody(){
        product.add("This is a body of a MotorCycle");
    }

    @Override
    public void insertWheels(){
        product.add("2 wheels are added");
    }

    @Override
    public void addHeadlights(){
        product.add("1 headlights are added");
    }

    @Override
    public Product getVehicle() {
        return product;
    }
}
