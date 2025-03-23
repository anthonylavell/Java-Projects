package academy.learnprogramming.factory_method.abstract_creator;
import academy.learnprogramming.factory_method.shapes.*;

public class RectangleFactory extends AbstractShapeFactory {
    protected Shape factoryMethod(){
        return new Rectangle();
    }
}
