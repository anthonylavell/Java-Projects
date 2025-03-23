package academy.learnprogramming.prototype.shapes_prototype;

import academy.learnprogramming.prototype.shapes_prototype.Shape;

public class Circle extends Shape {
    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw(){
        System.out.println("Inside Circle::draw() method");
    }
}
