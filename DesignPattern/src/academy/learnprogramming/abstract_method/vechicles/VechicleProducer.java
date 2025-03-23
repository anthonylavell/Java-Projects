package academy.learnprogramming.abstract_method.vechicles;

import academy.learnprogramming.abstract_method.creator.VechicleFactoryInterface;
import academy.learnprogramming.abstract_method.vechicles.products.FastCars;
import academy.learnprogramming.abstract_method.vechicles.products.LuxuryCar;

public final class VechicleProducer {
    private VechicleProducer(){};
    public static VechicleFactoryInterface getVehicle( String vechicleType) throws Exception{
        switch (vechicleType.toUpperCase()){
            case "FAST":
                return new FastCars();
            case "Luxury":
                return new LuxuryCar();
                default:
                    throw new Exception("Can not instantiate "+vechicleType);
        }

    }
}
