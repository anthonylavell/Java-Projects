package ds.node;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class TESTMAIN {
    public static void main(String [] args) throws java.lang.Exception{
        LinkedList<Integer> linkedList = new LinkedList<>();


        FileInputStream input = new FileInputStream("Times.txt");
        InputStreamReader reader = new InputStreamReader(input, StandardCharsets.UTF_8);
        Scanner in = new Scanner(new BufferedReader(reader));
        in.useDelimiter(",|' '|\n ");
        ArrayList<String> list = new ArrayList<>();
        int up=0;
        int close=0;
        int sum =0;
        String str ="";
        Map <String, Integer> hm = new HashMap<>();
       // String line;
        while (in.hasNext()) {
            if (in.hasNext()) {
                 str = str + in.nextLine()+" ";
            } /*else {
                in.nextLine();
            }*/
        }
       in.close();
        String[] result = str.split("=>|,|\\s");
       for(String line : result){
           if(hm.containsKey(line)){
               hm.put(line,(hm.get(line)) + 1);
           }else {
               hm.put(line, 1);
           }
        }
        System.out.println(hm);
        //System.out.println(sum);
    }
}
