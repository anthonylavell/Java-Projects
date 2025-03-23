package academy.learnprogramming.factory_method.concrete_creator;

import academy.learnprogramming.factory_method.animal.Animal;

public class Client {
    public static void main(String[] args) throws Exception {
       /* ShapeFactory shapeFactory = new ShapeFactory();
        Shape circleShape = shapeFactory.getShape("CIRCLE");
        circleShape.draw();

        Shape squareShape = shapeFactory.getShape("SQUARE");
        squareShape.draw();

        Shape rectangleShape = shapeFactory.getShape("RECTANGLE");
        rectangleShape.draw();*/

        AnimalFactory animalFactory = new AnimalFactory();
        Animal duckAnimal = animalFactory.getAnimal("duck");
        duckAnimal.speak();

        Animal tigerAnimal = animalFactory.getAnimal("Tiger");
        tigerAnimal.speak();

    }
}
