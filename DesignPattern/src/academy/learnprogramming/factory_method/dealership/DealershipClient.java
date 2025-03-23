package academy.learnprogramming.factory_method.dealership;

import academy.learnprogramming.factory_method.static_method_creator.DealershipFactory;

public class DealershipClient {
    public static void main(String[] args) throws Exception {
        Dealership dealership = DealershipFactory.getDealership("BMW");
        dealership.purchase();
        DealershipFactory.getDealership("Mercedes").purchase();
    }
}
