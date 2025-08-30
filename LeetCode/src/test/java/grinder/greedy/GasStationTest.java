package grinder.greedy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GasStationTest {

    @Test
    void testCanCompleteCircuit() {
        int [] gas = {1,2,3,4,5};
        int [] cost = {3,4,5,1,2};
        int total = 3;
        Assertions.assertEquals(total,GasStation.canCompleteCircuit(gas,cost));

        int [] gas2 = {2,3,4};
        int [] cost2 = {3,4,3};
        int total2 = -1;
        Assertions.assertEquals(total2,GasStation.canCompleteCircuit(gas2,cost2));

        int [] gas3 = {5,1,2,3,4};
        int [] cost3 = {4,4,1,5,1};
        int total3 = 4;
        Assertions.assertEquals(total3,GasStation.canCompleteCircuit(gas3,cost3));
    }
}