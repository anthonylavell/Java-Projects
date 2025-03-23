package academy.learnprogramming.builder.restaurant.four_star.product;

import academy.learnprogramming.builder.restaurant.four_star.abstract_interface.Item;

import java.util.ArrayList;
import java.util.List;

public class SteakHouse {
    private List<Item> order;

    public SteakHouse(){
        order = new ArrayList<>();
    }

    public void orderItem(Item itemOrder){
        order.add(itemOrder);
    }

    public double getCost(){
        double totalMealCost = 0;
        for(Item item : order){
            totalMealCost+= item.price();
        }
        return totalMealCost;
    }

    public void showMealOrder(){
        for(Item orderItem : order){
            System.out.println("Order : "+ orderItem.itemName()+", Packing : "
                    +orderItem.packItem().pack()+", Price : "+orderItem.price());
        }
        System.out.println("Total Cost : "+ getCost());
    }
}
