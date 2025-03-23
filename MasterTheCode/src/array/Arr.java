package array;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Arr {
    private int maxSize = 2;
    private int count = 0;
    private String arrString [] = new String[maxSize];
    public void addItem(String str){
        if(count > arrString.length-1) {
            increaseArray();
        }
        arrString[count] = str;
        count++;
    }
    private void increaseArray(){
        String tempArr [] = Arrays.copyOf(arrString, (arrString.length+2));
        arrString = tempArr;

    }

    public void addItemPos(int pos, String ele){
        String tempArr [] = new String [arrString.length+1];
        System.arraycopy(arrString, (pos-1), tempArr, 0, (pos));
        System.arraycopy(arrString, (pos), tempArr, (pos+1), arrString.length-1);
        tempArr[pos] = ele;
        arrString = tempArr;
        count++;

    }

    public void deleteItem(){
        count--;
        arrString[count] = null;

    }

    public void deleteItemPos(int pos){
        String tempArr [] = new String [arrString.length-1];
        System.arraycopy(arrString, (pos-1), tempArr, 0, (pos));
        System.arraycopy(arrString, (pos+1), tempArr, (pos), tempArr.length-1);
        arrString = tempArr;
        count--;
    }

    public int size(){
        return count;
    }

    public void displayArr(){
        System.out.println( Arrays.stream(arrString)
                .filter(x -> x != null)
                .collect(Collectors.toList()));
    }

}
