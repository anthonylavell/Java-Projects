package academy.learnprogramming.abstract_method;

import academy.learnprogramming.abstract_method.color.ColorFactory;
import academy.learnprogramming.abstract_method.creator.AbstractFactory;
import academy.learnprogramming.abstract_method.shapes.ShapeFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        switch (choice.toUpperCase()){
            case "SHAPE":
                return new ShapeFactory();
            case "COLOR":
                return new ColorFactory();
                default:
                    return null;
        }
    }
}
