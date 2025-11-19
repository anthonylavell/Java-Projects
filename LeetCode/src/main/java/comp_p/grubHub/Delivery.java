package comp_p.grubHub;

public class Delivery {
    String deliveryId;
    String driverId;
    // simplified to minutes from the beginning of the day
    int startTimestamp;
    int endTimestamp;

    Delivery(String deliveryId, String driverId, int startTimestamp, int endTimestamp) {
        this.deliveryId = deliveryId;
        this.driverId = driverId;
        this.startTimestamp = startTimestamp;
        this.endTimestamp = endTimestamp;
    }
}
