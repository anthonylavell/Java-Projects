package academy.learnprogramming.abstract_method.creator;

import academy.learnprogramming.abstract_method.vechicles.bmw.BMW;
import academy.learnprogramming.abstract_method.vechicles.lexus.Lexus;

public interface VechicleFactoryInterface {
    BMW getBMW();
    Lexus getLexus();
}
