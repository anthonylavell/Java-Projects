package academy.learnprogramming.abstract_method;

import academy.learnprogramming.abstract_method.color.Color;
import academy.learnprogramming.abstract_method.creator.AbstractFactory;
import academy.learnprogramming.abstract_method.shapes.Shape;

public class Client {
    public static void main(String[] args) throws Exception {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("Shape");
        Shape circleShape = shapeFactory.getShape("Circle");
        Shape rectangleShape = shapeFactory.getShape("Rectangle");
        Shape squareShape = shapeFactory.getShape("square");
        circleShape.draw();
        rectangleShape.draw();
        squareShape.draw();

        shapeFactory = FactoryProducer.getFactory("Color");
        Color blueColor = shapeFactory.getColor("blue");
        Color redColor = shapeFactory.getColor("green");
        Color greenColor = shapeFactory.getColor("red");
        blueColor.fill();
        greenColor.fill();
        redColor.fill();
    }
}
