package exercism.raindrop;

public class RaindropConverter {
    public static String convert(int number) {
        String rainDropStr="";
        if(number % 7 == 0)
            rainDropStr = String.valueOf("Plong"+rainDropStr).trim();
         if(number % 5 == 0)
            rainDropStr = String.valueOf("Plang"+rainDropStr).trim();
         if(number % 3 == 0)
             rainDropStr = String.valueOf("Pling"+rainDropStr).trim();

            return (rainDropStr.equals("")) ? String.valueOf(number) : rainDropStr;
    }

}
