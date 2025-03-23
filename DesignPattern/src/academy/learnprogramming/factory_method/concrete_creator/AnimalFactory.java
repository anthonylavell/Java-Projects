package academy.learnprogramming.factory_method.concrete_creator;

import academy.learnprogramming.factory_method.abstract_creator.AbstractAnimalFactory;
import academy.learnprogramming.factory_method.animal.*;

public class AnimalFactory extends AbstractAnimalFactory {
    protected Animal getAnimal(String animalType) throws Exception{
        switch (animalType.toUpperCase()){
            case "TIGER":
                return new Tiger();
            case "DUCK":
                return new Duck();
                default:
                    throw new Exception("Can not instantiated "+animalType);
        }
    }
}
