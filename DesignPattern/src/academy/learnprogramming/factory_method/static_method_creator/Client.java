package academy.learnprogramming.factory_method.static_method_creator;

import academy.learnprogramming.factory_method.shapes.Shape;

public class Client {
    public static void main(String[] args) {
        Shape circleShape = ShapeFactory.getShape("circle");
        circleShape.draw();

        Shape squareShape = ShapeFactory.getShape("square");
        squareShape.draw();

        Shape rectangleShape = ShapeFactory.getShape("rectangle");
        rectangleShape.draw();
    }
}
