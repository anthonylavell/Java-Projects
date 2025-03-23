package string;

public class ConvertToRoman {
    public static void main(String[] args) {
       int num = 3105;
        String result ="";
        while (num > 0){
            result+=roman(num);
            String tempStr = String.valueOf(num).substring(1);
            num = (tempStr.isEmpty())?0:Integer.parseInt(tempStr);
        }
        System.out.println(result);
    }


    public static String roman(int num){
        int placeVal = getPlace(num);
        int placeNum = placeVal*((num/placeVal)%10);
        String result ="";
        if(placeVal == 1){
            String [] romanArray = {"I","IV","V","IX"};
            result = thPlace(romanArray,placeNum,placeVal);
        }else if(placeVal == 10){
            String [] romanArray = {"X","XL","L","XC"};
            result = thPlace(romanArray,placeNum,placeVal);
        }else if(placeVal == 100) {
            String [] romanArray = {"C","CD","D","CM"};
            result = thPlace(romanArray,placeNum,placeVal);
        }else {
            result+= place(placeNum,placeVal,"M");
        }

        return result;

    }

    private static int getPlace(int num){
        double tenthPower = Math.floor(Math.log10(num));
        int numPlace = (int) Math.pow(10, tenthPower);
        return numPlace;
    }

    private static String thPlace(String [] romanArray, int num, int place){
        String result="";
        if(num< (4*place)){
            if(num>(place-1)){
                result+= place(num,place,romanArray[0]);
            }
        }else if(num <(5*place)){
            result = romanArray[1];
        }else if(num >=(5*place) && num <(9*place)){
            result = romanArray[2];
            num-=(5*place);
            if(num>(place-1)){
                result+= place(num,place,romanArray[0]);
            }
        }
        else if(num == (9*place)){
            result = romanArray[3];
        }
        return result;
    }

    private static String place(int num,int place, String symbol){
        String result ="";
        for(int i = num; i>(place-1);  i-=(1*place)){
            result+=symbol;
        }
        return result;
    }

}
