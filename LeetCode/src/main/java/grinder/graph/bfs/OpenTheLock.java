package grinder.graph.bfs;

import java.util.*;

public class OpenTheLock {
    public static void main(String[] args) {
        String [] deadEnd = {"8888"};
        String target = "0009";
        System.out.println(openLock(deadEnd,target));
        //System.out.println(subWithLeadingZeros("0000","0010",4));
    }

    public static int numSteps(String targetCombo, List<String> trappedCombos) {
        // WRITE YOUR BRILLIANT CODE HERE
        Set<String> visited = new HashSet<>(trappedCombos);
        return 0;
    }



    public static int openLock(String[] deadEnds, String target) {
        String [] combs = {"0001","0010","0100","1000"};
        Set<String> visited = new HashSet<>(List.of(deadEnds));
        if(visited.contains("0000")){
                return -1;
            }
        Deque<String> deque = new ArrayDeque<>();
        deque.add("0000");
        visited.add("0000");
        for (int turn = 0; !deque.isEmpty(); turn++){
            int size = deque.size();
            while (size-- >0){
                String str = deque.pop();
                if(str.equals(target)){
                    return turn;
                }
                for(String comb: combs ){
                    String found = addWithLeadingZeros(str,comb,4);
                    isVisited(found,deque,visited);
                    found = subWithLeadingZeros(str,comb,4);
                    isVisited(found,deque,visited);
                }

            }
        }

        return -1;
    }

    private static String addWithLeadingZeros(String num1, String num2, int desiredLength) {
        int index = num2.indexOf('1');
        int sum = 0;
        char [] chars = new char[desiredLength];
        if(num1.charAt(index) == '9'){
            for(int count = 0; count < chars.length; count++){
                chars[count] = (count == index) ? '0' : num1.charAt(count);
            }
            sum = Integer.parseInt(String.valueOf(chars));
        }else {
            sum = Integer.parseInt(num1) + Integer.parseInt(num2);
        }
        //int sum  = (num1.charAt(index) == '9') ? Integer.parseInt(num1.substring(0,index) +'0' + num1.substring(index+1)) : Integer.parseInt(num1) + Integer.parseInt(num2);
        return String.format("%0" + desiredLength + "d", sum);
    }

    private static String subWithLeadingZeros(String num1, String num2, int desiredLength) {
        int index = num2.indexOf('1');
        int sum = 0;
        char [] chars = new char[desiredLength];
        if(num1.charAt(index) == '0'){
            for(int count = 0; count < chars.length; count++){
                chars[count] = (count == index) ? '9' : num1.charAt(count);
            }
            sum = Integer.parseInt(String.valueOf(chars));
        }else {
            sum = Integer.parseInt(num1) - Integer.parseInt(num2);
        }
        //int sum  = (num1.charAt(index) == '0') ? Integer.parseInt(num1.substring(0,index) +'9' + num1.substring(index+1)) : Integer.parseInt(num1) - Integer.parseInt(num2);
        return String.format("%0" + desiredLength + "d", sum);
    }

    private static void isVisited(String found, Deque<String> deque,Set<String> visited){
        if(visited.add(found)){
            deque.add(found);
        }
    }

}
