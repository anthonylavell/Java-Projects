package comp_p.capital_one.powerday;

import java.util.Arrays;

public class GasStation {
    public static void main(String[] args) {
        int [] gas = {1,2,3,4,5};
        int [] cost = {3,4,5,1,2};

        int [] gas2 = {2,3,4};
        int [] cost2 = {3,4,3};

        int [] gas3 = {5,1,2,3,4};
        int [] cost3 = {4,4,1,5,1};

        System.out.println(canCompleteCircuit(gas3,cost3));
    }
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        if (gas.length != cost.length || Arrays.stream(gas).sum() < Arrays.stream(cost).sum()){
            return -1;
        }
        int amount = 0;
        int subTotal = 0;
        for (int gIndex = 0; gIndex < gas.length; gIndex++){
            subTotal+= gas[gIndex] - cost[gIndex];
            if (subTotal < 0){
                amount = gIndex+1;
                subTotal=0;
            }
        }
        return amount;
    }
}
