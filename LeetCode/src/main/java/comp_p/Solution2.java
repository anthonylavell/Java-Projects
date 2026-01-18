package comp_p;

import org.junit.Assert;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;

/*
We are developing an energy usage data management software that tracks daily electricity usage
for households and provides useful statistics.

The program includes three classes: Household, UsageRecord, and UsageCollection.

Classes:
- Household represents a household.
- UsageRecord represents the electricity usage for a household on a specific date.
- UsageCollection manages a collection of UsageRecords for a particular household and
  provides methods for statistics.

Tasks:
1-1) Read through and understand the code below. Feel free to run it.
1-2) The test for UsageCollection is not passing due to a bug in the code.
     Make the necessary changes to UsageCollection to fix the bug.

2) Add a new function called getBiggestSpike to UsageCollection.
   This function returns the largest change in usage between any two consecutive records
   (based on date order), along with the start date and end date, as an Object[].

   Return format: [change, "YYYY-MM-DD", "YYYY-MM-DD"]
   Example: [15, "2024-01-02", "2024-01-03"]

   Two records are consecutive if there is no other record date between them in the collection.
*/

class Household {
    String id;
    String address;

    Household(String id, String address) {
        this.id = id;
        this.address = address;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        Household h = (Household) other;
        return id.equals(h.id) && address.equals(h.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, address);
    }
}

class UsageRecord {
    Household household;
    int kwh;        // daily usage in kilowatt-hours
    String date;    // "YYYY-MM-DD"

    UsageRecord(Household household, int kwh, String date) {
        this.household = household;
        this.kwh = kwh;
        this.date = date;
    }
}

class UsageCollection {
    ArrayList<UsageRecord> usageRecords = new ArrayList<>();
    Household household;

    UsageCollection(Household household) {
        this.household = household;
    }

    int getNumUsageRecords() {
        return usageRecords.size();
    }

    void addUsageRecord(UsageRecord usageRecord) {
        if (!usageRecord.household.equals(this.household)) {
            throw new IllegalArgumentException("UsageRecord household does not match this collection.");
        }
        usageRecords.add(usageRecord);
    }

    int getMaxUsage() {
        if (usageRecords == null || usageRecords.isEmpty()) return -1;
        return usageRecords.stream().mapToInt(r -> r.kwh).max().getAsInt();
    }

    int getMinUsage() {
        if (usageRecords == null || usageRecords.isEmpty()) return -1;

        // BUG: This is wrong and causes test failure.
        // Fix getMinUsage so it returns the true minimum kwh.
        return usageRecords.stream().mapToInt(r -> r.kwh).min().getAsInt();
    }

    double getAvgUsage() {
        if (usageRecords == null || usageRecords.isEmpty()) return -1.0;
        double total = usageRecords.stream().mapToInt(r -> r.kwh).sum();
        return total / usageRecords.size();
    }

    // TASK 2: Implement this method
    // Requirements:
    // - If usageRecords is null or has fewer than 2 records, return null.
    // - Sort by date ascending (String "YYYY-MM-DD" sorts correctly lexicographically).
    // - Compute consecutive differences: current.kwh - previous.kwh
    // - Find the difference with the largest absolute magnitude.
    // - Return new Object[] { bestChange, startDate, endDate }
    Object[] getBiggestSpike() {
        if (usageRecords.isEmpty()){
            return null;
        }
       usageRecords.sort(Comparator.comparing(o->o.date));
        String startD = usageRecords.get(0).date;
        String endD = usageRecords.get(1).date;
        int total = usageRecords.get(1).kwh - usageRecords.get(0).kwh;
        for (int index = 2; index < usageRecords.size(); index++){
            int subTotal = usageRecords.get(index).kwh - usageRecords.get(index-1).kwh;
            if (Math.abs(subTotal) > Math.abs(total)){
                startD = usageRecords.get(index-1).date;
                endD = usageRecords.get(index).date;
                total = subTotal;
            }
        }
        return new Object[]{total,startD,endD};
    }
}

public class Solution2 {
    public static void main(String[] args) {
        testUsageRecord();
        testUsageCollection();
        testGetBiggestSpike();
        System.out.println("All tests passed.");
    }

    public static void testUsageRecord() {
        System.out.println("Running testUsageRecord");
        Household h = new Household("H1", "123 Main St");
        UsageRecord r = new UsageRecord(h, 25, "2024-01-02");

        Assert.assertEquals(h, r.household);
        Assert.assertEquals(25, r.kwh);
        Assert.assertEquals("2024-01-02", r.date);
    }

    private static UsageCollection makeUsageCollection(Household household, Object[][] usageData) {
        UsageCollection c = new UsageCollection(household);
        for (Object[] row : usageData) {
            UsageRecord r = new UsageRecord(household, (int) row[0], (String) row[1]);
            c.addUsageRecord(r);
        }
        return c;
    }

    public static void testUsageCollection() {
        System.out.println("Running testUsageCollection");
        Household h = new Household("H1", "123 Main St");
        UsageCollection c = new UsageCollection(h);

        Assert.assertEquals(0, c.getNumUsageRecords());
        Assert.assertEquals(-1, c.getMaxUsage());
        Assert.assertEquals(-1, c.getMinUsage());
        Assert.assertEquals(-1.0, c.getAvgUsage(), 0.001);

        Object[][] usageData = {
                { 30, "2024-01-02" },
                { 10, "2024-01-01" },
                { 25, "2024-01-04" },
                { 40, "2024-01-03" }
        };
        c = makeUsageCollection(h, usageData);

        Assert.assertEquals(usageData.length, c.getNumUsageRecords());
        Assert.assertEquals(40, c.getMaxUsage());
        Assert.assertEquals(10, c.getMinUsage());          // This currently FAILS due to the bug.
        Assert.assertEquals(26.25, c.getAvgUsage(), 0.1);
    }

    public static void testGetBiggestSpike() {
        System.out.println("Running testGetBiggestSpike");
        Household h = new Household("H1", "123 Main St");
        UsageCollection c = new UsageCollection(h);

        Assert.assertNull(c.getBiggestSpike());

        Object[][] usageData = {
                { 30, "2024-01-02" },
                { 45, "2024-01-03" },
                { 20, "2024-01-01" },
                { 25, "2024-01-05" }
        };
        c = makeUsageCollection(h, usageData);

        // Sorted by date:
        // 2024-01-01: 20
        // 2024-01-02: 30  change +10
        // 2024-01-03: 45  change +15  <-- biggest abs
        // 2024-01-05: 25  change -20  <-- biggest abs actually is -20
        Assert.assertArrayEquals(new Object[] { -20, "2024-01-03", "2024-01-05" }, c.getBiggestSpike());

        Object[][] usageData2 = {
                { 100, "1999-12-30" },
                { 80,  "2000-01-01" },
                { 140, "2000-01-03" },
                { 130, "2000-01-04" }
        };
        c = makeUsageCollection(h, usageData2);

        // Sorted:
        // 1999-12-30: 100
        // 2000-01-01: 80   change -20
        // 2000-01-03: 140  change +60  <-- biggest abs
        // 2000-01-04: 130  change -10
        Assert.assertArrayEquals(new Object[] { 60, "2000-01-01", "2000-01-03" }, c.getBiggestSpike());
    }
}
