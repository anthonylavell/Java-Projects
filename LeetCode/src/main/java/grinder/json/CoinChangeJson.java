package grinder.json;

public class CoinChangeJson {
    public static String getCoinChange(){
        return """
                {"data":{
                    "coins":[1,2,5],
                    "amount":11
                    }
                }
                """;
    }
}
