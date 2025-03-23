package academy.learnprogramming.prototype.car_prototype;

public class CarClient {
    public static void main(String[] args) {
        System.out.println("***Prototype Patter Demo***\n");
        BasicCarCache.loadCache();

        BasicCar bc1 = (BasicCar) BasicCarCache.getCar("Green Nano");
        int priceOfCar = bc1.getPrice()+BasicCar.getBasePrice();
        System.out.println("Car is: "+bc1.getModelName()+" and it's price is "
                + priceOfCar);

        bc1 = (BasicCar) BasicCarCache.getCar("Ford Yellow");
        priceOfCar = bc1.getPrice()+BasicCar.getBasePrice();
        System.out.println("Car is: "+bc1.getModelName()+" and it's price is "
        + priceOfCar);
    }
}
