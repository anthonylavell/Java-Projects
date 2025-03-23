package academy.learnprogramming.abstract_method.vechicles;

import academy.learnprogramming.abstract_method.creator.VechicleFactoryInterface;
import academy.learnprogramming.abstract_method.vechicles.bmw.BMW;

public class VechicleClient {
    public static void main(String[] args) throws Exception {
        VechicleFactoryInterface vfi = VechicleProducer.getVehicle("fast");
        BMW bmwI8 = vfi.getBMW();
        bmwI8.driveStyle();
    }
}
