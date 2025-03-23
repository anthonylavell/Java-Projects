package academy.learnprogramming.factory_method.abstract_creator;
import academy.learnprogramming.factory_method.shapes.*;

public abstract class AbstractShapeFactory {
    protected abstract Shape factoryMethod();

    public Shape getShape(){
        return factoryMethod();
    }
}
