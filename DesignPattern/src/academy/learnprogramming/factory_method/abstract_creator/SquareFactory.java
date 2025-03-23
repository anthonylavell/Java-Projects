package academy.learnprogramming.factory_method.abstract_creator;
import academy.learnprogramming.factory_method.shapes.*;

import academy.learnprogramming.factory_method.shapes.Square;

public class SquareFactory extends AbstractShapeFactory {
    protected Shape factoryMethod(){
        return new Square();
    }
}
