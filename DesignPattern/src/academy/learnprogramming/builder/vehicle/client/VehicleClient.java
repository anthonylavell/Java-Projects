package academy.learnprogramming.builder.vehicle.client;

import academy.learnprogramming.builder.vehicle.builder_interface.BuilderInterface;
import academy.learnprogramming.builder.vehicle.concrete_class.Car;
import academy.learnprogramming.builder.vehicle.concrete_class.MotorCycle;
import academy.learnprogramming.builder.vehicle.product.Product;
import academy.learnprogramming.builder.vehicle.director.Director;

public class VehicleClient {
    public static void main(String[] args) {
        System.out.println("***Builder Pattern Demo");

        Director director = new Director();

        BuilderInterface carBuilder = new Car();
        BuilderInterface motorBuilder = new MotorCycle();

        director.construct(carBuilder);
        Product p1 = carBuilder.getVehicle();
        p1.show();

        // making a motorcycle
        director.construct(motorBuilder);
         p1 = motorBuilder.getVehicle();
        p1.show();
    }
}
