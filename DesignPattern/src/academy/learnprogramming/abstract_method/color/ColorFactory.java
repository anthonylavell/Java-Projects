package academy.learnprogramming.abstract_method.color;

import academy.learnprogramming.abstract_method.creator.AbstractFactory;
import academy.learnprogramming.abstract_method.shapes.Shape;

public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String colorType) throws Exception {
        switch (colorType.toUpperCase()){
            case "RED":
                return new Red();
            case "BLUE":
                return new Blue();
            case "GREEN":
                return new Green();
            default:
                throw new Exception("Can not instantiated "+ colorType);
        }
    }

    @Override
    public Shape getShape(String shapeType) throws Exception {
        return null;
    }
}
