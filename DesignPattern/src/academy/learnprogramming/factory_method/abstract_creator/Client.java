package academy.learnprogramming.factory_method.abstract_creator;

import academy.learnprogramming.factory_method.shapes.Shape;

public class Client {
    public static void main(String[] args) {
        Shape circleShape = new CircleFactory().getShape();
        circleShape.draw();

        Shape squareShape = new SquareFactory().getShape();
        squareShape.draw();

        Shape rectangleShape = new RectangleFactory().getShape();
        rectangleShape.draw();
    }
}
