package academy.learnprogramming.factory_method.static_method_creator;

import academy.learnprogramming.factory_method.shapes.*;

public class ShapeFactory {

    public static Shape getShape(String shapeType){
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return new Square();
    }
}
