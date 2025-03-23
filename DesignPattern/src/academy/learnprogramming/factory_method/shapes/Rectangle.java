package academy.learnprogramming.factory_method.shapes;

public class Rectangle implements Shape {
    @Override
    public void draw(){
        System.out.println("Inside Rectangle::draw() method.");
    }
}
