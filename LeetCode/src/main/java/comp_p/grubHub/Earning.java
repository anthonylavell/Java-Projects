package comp_p.grubHub;
/*
 * Click `Run` to execute the snippet below!
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given a list of deliveries, calculate the amount owed per driver in pennies. Returning the result in a Map, with
 * the key being the driver ID and the value being the pay in pennies.
 * <p>
 * Drivers should be paid at the hourly rate for their market. The amount of time they work is determined by the
 * rate and timestamps. If a delivery is "bundled" they will get paid twice
 * for any overlapping time windows.
 * <p>
 * Example 1: No bundled deliveries.
 * |--------------------------------------------------------------------------------------------------------------|
 * [ Driver 'A' ]:
 *
 *     [-- 10 min --]
 *                      [-- 20 min --]
 *                                      [-- 30 min --]
 *                                                      [-- 40 min --]
 * |--- Time ----------------------------------------------------------------------------------------------------->
 * ==> RESULT: 100 minutes X rate in Driver A's market
 * <p>
 * |--------------------------------------------------------------------------------------------------------------|
 * [ Driver 'B' ]:
 *
 *   [10-| --- 20 ----] (30 min)
 *       [---- 20 ----|------- 40 -------] (60 min)
 * |--- Time ----------------------------------------------------------------------------------------------------->
 * ==> RESULT: 90 minutes X rate in Driver B's market
 * <p>
 * {@see #getDriverMarket}
 * {@see #getMarketHourlyRateInPennies}
 */
public class Earning {
    public static Map<String, Integer> calculateEarningsByDriverInPennies(List<Delivery> deliveries) {
        // TODO: Implement me!
        Map<String, Integer>user = new HashMap<>();
        for(Delivery delivery : deliveries){
            String driverId = delivery.driverId;
            user.putIfAbsent(driverId,0);
            int startT = delivery.startTimestamp;
            int endT = delivery.endTimestamp;
            String driverMarket = getDriverMarket(driverId);
            int hourly = getMarketHourlyRateInPennies(driverMarket);
            double time = (double) (endT - startT) /60;
            int totalAmount = (int) (hourly*time);
            user.put(driverId,user.get(driverId)+totalAmount);
        }

        return user;
    }

    // super simplified version of a method to get the a driver's market,
    // purely to reduce complexity of the challenge
    public static String getDriverMarket(String driverId) {
        return "CHICAGO";
    }

    // super simplified version of a method to get the market rate, purely to reduce complexity of the challenge
    public static int getMarketHourlyRateInPennies(String marketId) {
        if (marketId.equals("CHICAGO")) {
            return 1500;
        } else return 1000;
    }

    public static void main(String[] args) {
        List<Delivery> deliveries = new ArrayList<>();

        // DEDUPED: 100 min, 0 bundles
        String driverAId = "driverA";
        deliveries.add(new Delivery("d1", driverAId, 0, 10)); // 10 min
        deliveries.add(new Delivery("d2", driverAId, 20, 40)); // 20 min
        deliveries.add(new Delivery("d3", driverAId, 50, 80)); // 30 min
        deliveries.add(new Delivery("d4", driverAId, 90, 130)); // 40 min

        // driverA worked for 1 hour and 2/3 hour and gets paid a rate of 1500 pennies per hour
        // driverA should get paid 1.67*1500 = 2500 pennies

        String driverBId = "driverB";
        Delivery d5 = new Delivery("d5", driverBId, 0, 30); // 30 min
        Delivery d6 = new Delivery("d6", driverBId, 10, 70); // 60 min
        // DEDUPED: 70 min, 1 bundle
        deliveries.add(d5);
        deliveries.add(d6);

        //Map<String, Integer> payForAllDrivers = calculateEarningsByDriverInPennies(deliveries);
        Map<String, Integer> payForAllDrivers = calculateEarningsByDriverInPennies(deliveries);
        System.out.println("Solution: " + payForAllDrivers);
    }
}
