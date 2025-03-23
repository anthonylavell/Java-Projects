package academy.learnprogramming.prototype.car_prototype;

public abstract class BasicCar implements Cloneable {
    protected String modelName;
   protected int price;

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getModelName() {
        return modelName;
    }

    public int getPrice() {
        return price;
    }

    public static int getBasePrice(){
        return 500;
    }

    public Object clone(){
        Object clone = null;
        try {
            clone = super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return clone;
    }
}
