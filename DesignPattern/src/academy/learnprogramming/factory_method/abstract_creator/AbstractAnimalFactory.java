package academy.learnprogramming.factory_method.abstract_creator;

import academy.learnprogramming.factory_method.animal.Animal;

public abstract class AbstractAnimalFactory {
    protected abstract Animal getAnimal(String animalType) throws Exception;

}
