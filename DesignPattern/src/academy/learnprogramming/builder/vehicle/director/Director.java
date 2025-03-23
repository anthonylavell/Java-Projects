package academy.learnprogramming.builder.vehicle.director;

import academy.learnprogramming.builder.vehicle.builder_interface.BuilderInterface;

public class Director {
    BuilderInterface myBuilder;

    public void construct(BuilderInterface builder){
        myBuilder = builder;
        myBuilder.buildBody();
        myBuilder.insertWheels();
        myBuilder.addHeadlights();
    }
}
