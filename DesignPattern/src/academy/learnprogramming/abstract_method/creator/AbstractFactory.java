package academy.learnprogramming.abstract_method.creator;

import academy.learnprogramming.abstract_method.color.Color;
import academy.learnprogramming.abstract_method.shapes.Shape;

public abstract class AbstractFactory {
    public abstract Color getColor(String colorType) throws Exception;
    public abstract Shape getShape(String shapeType) throws Exception ;
}
