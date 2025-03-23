package academy.learnprogramming.abstract_method.shapes;

import academy.learnprogramming.abstract_method.creator.AbstractFactory;
import academy.learnprogramming.abstract_method.color.Color;

public class ShapeFactory extends AbstractFactory {
    @Override
    public Color getColor(String color)  {
        return null;
    }

    @Override
    public Shape getShape(String shapeType) throws Exception {
        switch (shapeType.toUpperCase()){
            case "CIRCLE":
                return new Circle();
            case "RECTANGLE":
                return new Rectangle();
            case "SQUARE":
                return new Square();
                default:
                    throw new Exception("Can not instantiated "+ shapeType);
        }
    }
}
