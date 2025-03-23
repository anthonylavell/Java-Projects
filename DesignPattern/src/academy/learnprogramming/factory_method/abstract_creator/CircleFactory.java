package academy.learnprogramming.factory_method.abstract_creator;
import academy.learnprogramming.factory_method.shapes.*;

import academy.learnprogramming.factory_method.shapes.Circle;

public class CircleFactory extends AbstractShapeFactory {
    protected Shape factoryMethod(){
        return new Circle();
    }
}
