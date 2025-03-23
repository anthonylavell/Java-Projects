// DealershipFactory is the Concrete Creator creating BMW or Mercedes dealership objects

package academy.learnprogramming.factory_method.static_method_creator;

import academy.learnprogramming.factory_method.dealership.BMW_Dealership;
import academy.learnprogramming.factory_method.dealership.Dealership;
import academy.learnprogramming.factory_method.dealership.Mercedes_Dealership;

public final class DealershipFactory {
    private DealershipFactory(){}
    public static Dealership getDealership(String dealerType) throws Exception{
        switch (dealerType.toUpperCase()){
            case "BMW":
                return new BMW_Dealership();
            case "MERCEDES":
                return new Mercedes_Dealership();
                default:
                    throw new Exception("Can not instantiate "+ dealerType);
        }
    }
}
