package comp_p.hubspot;

import comp_p.hubspot.payload.JsonPayLoad;
import org.json.JSONArray;
import org.json.JSONObject;

public class Product {
    public static void main(String[] args) {
        JSONArray jsonArray = JsonPayLoad.getProducts();
        JSONArray jsonProducts = new JSONArray();
        for (int index = 0; index < jsonArray.length(); index++){
            JSONObject object= new JSONObject();
            JSONObject products = jsonArray.getJSONObject(index);
            if ( products.getInt("stock_quantity") > 0){
                object.put("product_id",products.getString("id"));
                object.put("product_name", products.getString("name"));
                object.put("price",products.getDouble("price_usd"));
                jsonProducts.put(object);
            }

        }
        System.out.println(jsonProducts.toString(4));
    }
}
