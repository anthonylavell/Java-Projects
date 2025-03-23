package academy.learnprogramming.abstract_method.vechicles.products;

import academy.learnprogramming.abstract_method.creator.VechicleFactoryInterface;
import academy.learnprogramming.abstract_method.vechicles.bmw.BMW;
import academy.learnprogramming.abstract_method.vechicles.bmw.BMWSportCar;
import academy.learnprogramming.abstract_method.vechicles.lexus.Lexus;
import academy.learnprogramming.abstract_method.vechicles.lexus.LexusSportCar;

public class LuxuryCar implements VechicleFactoryInterface {
    @Override
    public BMW getBMW() {
        return new BMWSportCar();
    }

    @Override
    public Lexus getLexus() {
        return new LexusSportCar();
    }
}
