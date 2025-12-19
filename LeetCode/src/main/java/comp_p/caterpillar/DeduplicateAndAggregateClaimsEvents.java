/*
Problem 1: Deduplicate and Aggregate Transactions
Prompt

You are given a list of transactions. Each transaction has:

transactionId (String)

customerId (String)

amountCents (long)

timestampEpochMillis (long)

Duplicates can appear with the same transactionId. Keep only the
first occurrence by timestamp (earliest). Return total spend per customerId.

Example

Input:

t1 cA 1000 ts 200

t1 cA 1000 ts 150 (duplicate, earlier)

t2 cA 500 ts 300

t3 cB 700 ts 100

Output:

cA -> 1500

cB -> 700
 */
package comp_p.caterpillar;

import java.util.*;

public class DeduplicateAndAggregateClaimsEvents {

    public Map<String,Long> totalPaidByClaimId(List<ClaimEvent> events){
        Map<String,ClaimEvent> mapOfEvents = new HashMap<>();
        Map<String,Long> mapOfClaims = new HashMap<>();
        for (ClaimEvent event : events){
            String eventKey = event.eventId();
            String claimKey = event.claimId();
            String type = event.type.toLowerCase(Locale.ROOT);
            long time = event.timeStampEpochMillis();
            long amount = event.amountCents();
            if (type.equals("closed") && time > 0 ) {
                if (mapOfEvents.containsKey(eventKey)) {
                    if (mapOfEvents.get(eventKey).timeStampEpochMillis() > time) {
                        ClaimEvent oldClaim = mapOfEvents.get(eventKey);
                        mapOfClaims.put(claimKey, mapOfClaims.get(claimKey) - oldClaim.amountCents());
                        mapOfClaims.put(claimKey, mapOfClaims.get(claimKey)+amount);
                        mapOfEvents.put(eventKey, event);
                    }
                } else {
                    mapOfEvents.put(eventKey, event);
                    mapOfClaims.put(claimKey, mapOfClaims.getOrDefault(claimKey,0L)+amount);
               }

            }
        }
        return mapOfClaims;
    }

    public static void main(String[] args) {
        DeduplicateAndAggregateClaimsEvents dep = new DeduplicateAndAggregateClaimsEvents();

        ClaimEvent e1 = new ClaimEvent("e1","c1","closed", 150, 1000);

        ClaimEvent e2 =new ClaimEvent("e1","c1","closed",200,1000);
        ClaimEvent e3 =new ClaimEvent("e2","c1","open",300,500);
        ClaimEvent e4 =new ClaimEvent("e3","c2","closed",100, 700);
        List<ClaimEvent> listOfDeDuplicateClaimEvent = new ArrayList<>(Arrays.asList(e1,e2,e3,e4));
        dep.totalPaidByClaimId(listOfDeDuplicateClaimEvent);

    }
    public record ClaimEvent(String eventId, String claimId, String type, long timeStampEpochMillis, long amountCents){}
}
