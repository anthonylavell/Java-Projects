package academy.learnprogramming.prototype.car_prototype;

import java.util.Hashtable;

public class BasicCarCache {
    private static Hashtable<String, BasicCar> basicCarMap = new Hashtable<>();

    public static BasicCar getCar(String carName){
        BasicCar cachedBasicCar= basicCarMap.get(carName);
        return (BasicCar) cachedBasicCar.clone();
    }

    public static void loadCache(){
        BasicCar nano_base = new Nano("Green Nano");
        nano_base.setPrice(1000);

        BasicCar ford_basic = new Nano("Ford Yellow");
        ford_basic.setPrice(3000);
    }
}
