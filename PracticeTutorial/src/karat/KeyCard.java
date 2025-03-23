package karat;

import java.time.Duration;
import java.time.LocalTime;
import java.util.*;

public class KeyCard {
    public static void main(String[] args) {
        LocalTime time = LocalTime.parse("13:00");
        LocalTime time2 = LocalTime.parse("14:00");
        System.out.println(Duration.between(time2,time).isNegative());
        System.out.println(Duration.between(time2,time).abs().toMinutes());
        Stack<Integer>stack = new Stack<>();
        stack.add(3);
        stack.add(1);
        stack.add(5);
        System.out.println(stack);
        Collections.sort(stack);
        System.out.println(stack);
        System.out.println(stack);

        Map<String,Set<LocalTime>> keyCard = new LinkedHashMap<>();
        keyCard.put("Anthony",new TreeSet<>());
        keyCard.get("Anthony").add(time2);
        keyCard.get("Anthony").add(time);
        String[] keyName = {"daniel","daniel","daniel","luis","luis","luis","luis","daniel","daniel"};
        String[] keyTime = {"10:00","10:40","11:01","09:00","11:00","13:00","15:00","09:00","11:40"};
        System.out.println(alertNames(keyName,keyTime));
        System.out.println(keyCard.get("Anthony"));
    }
    public static List<String> alertNames(String[] keyName, String[] keyTime) {
        Map<String,List<String>> keyCard = new HashMap<>();
        List<String> names = new ArrayList<>();
        for(int i =0; i < keyName.length; i++){
            String tempTime = keyTime[i];
            String name = keyName[i];
            if(!keyCard.containsKey(name)) {
                keyCard.put(name, new ArrayList<>());
            }
            keyCard.get(name).add(tempTime);
        }

        for(String name : keyCard.keySet()){
            List<String> tempList = keyCard.get(name);
            if(tempList.size()>=3){
                Collections.sort(tempList);
                int count = 2;
                while (count < tempList.size() ){
                    int tmp = getMinutes(tempList.get(count)) - getMinutes(tempList.get(count-2));
                    if( tmp <= 60){
                        names.add(name);
                        break;
                    }
                    count++;
                }
            }
        }

        Collections.sort(names);
            return names;
    }

    private static int getMinutes(String str){
        int h = (str.charAt(0) - '0') * 10 + (str.charAt(1) - '0');
        int m = (str.charAt(3) - '0') * 10 + (str.charAt(4) - '0');
        return h * 60 + m;
    }

}
