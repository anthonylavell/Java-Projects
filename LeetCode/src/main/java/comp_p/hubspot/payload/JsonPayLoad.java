package comp_p.hubspot.payload;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonPayLoad {
    private JsonPayLoad(){

    }

    public static void main(String[] args) {
        getProducts();
    }
    public static JSONArray getProducts(){
        String[] id = {"prod_101","prod_102","prod_103"};
        String[] name = {"Laptop Pro X","Wireless Mouse","Mechanical Keyboard"};
        String[] description = {"High-performance laptop","Ergonomic wireless mouse","RGB backlit keyboard"};
        double[] price_usd = {1200.50,19.99,85.00};
        int[] stock_quantity = {5,0,12};
        JSONArray dataArray = new JSONArray();
        for (int index = 0; index < 3; index++){
            JSONObject obj = new JSONObject();
            obj.put("id",id[index]);
            obj.put("name",name[index]);
            obj.put("description",description[index]);
            obj.put("price_usd",price_usd[index]);
            obj.put("stock_quantity",stock_quantity[index]);
            dataArray.put(obj);
        }
        int i = 0;
        //System.out.println(dataArray.toString(4));
        return dataArray;
    }
}
