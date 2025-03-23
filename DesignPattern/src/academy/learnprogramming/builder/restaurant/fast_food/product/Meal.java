package academy.learnprogramming.builder.restaurant.fast_food.product;

import academy.learnprogramming.builder.restaurant.fast_food.abstract_interface.Items;

import java.util.ArrayList;
import java.util.List;

public class Meal {
   private List<Items> listOfItems;

    public Meal(){
        listOfItems = new ArrayList<>();
    }

    public void addItem(Items item){
        listOfItems.add(item);
    }

    public double getCost(){
        double meal =0;
        for(Items cost : listOfItems){
            meal +=cost.price();
        }
        return meal;
    }

    public void showItems(){
        for (Items list : listOfItems){
            System.out.println("Item : "+list.itemName()+", Packing : "
            +list.packItem().pack()+", Price : "+ list.price());
        }
        System.out.println("Total Cost: "+getCost());
    }
}
