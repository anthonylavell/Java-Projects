package vehicle_hasA;

public class Tire {
    private int width;
    private int radius;

    public Tire(int width, int raduis){
        this.width = width;
        this.radius = raduis;
    }

    public int getWidth() {
        return width;
    }

    public int getRadius() {
        return radius;
    }

    public String getTireSize(){
        return getWidth()+" By "+ getRadius();
    }
}
