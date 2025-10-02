package comp_p.draft_kings.challenges.discount.set_up;

import comp_p.draft_kings.challenges.discount.Customer;

public class CustomerAssign {
    public static Customer[] getCustomers(){
        Customer customer = new Customer("C1",20000);
        Customer customer2 = new Customer("C2",1000);
        Customer customer3 = new Customer("C3",200);
        Customer customer4 = new Customer("C4",2000);
        Customer customer5 = new Customer("C5",10000);
        return new Customer[]{customer,customer2,customer3,customer4,customer5};
    }
}
