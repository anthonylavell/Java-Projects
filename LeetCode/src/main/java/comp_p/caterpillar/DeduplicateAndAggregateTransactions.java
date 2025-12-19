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

public class DeduplicateAndAggregateTransactions {

    public Map<String,Long> AggregateTransactions(List<DeDuplicateTransaction> transactions){
        Map<String,DeDuplicateTransaction>mapOfTransactions = new HashMap<>();
        Map<String,Long>mapOfAmounts = new HashMap<>();
        for (DeDuplicateTransaction transaction : transactions){
            long amount = transaction.amountCents();
            String tranKey = transaction.transactionId();
            String custKey =  transaction.customerId();
            long time = transaction.timeStampEpochMillis();
            if (mapOfTransactions.containsKey(tranKey) && mapOfTransactions.get(tranKey).timeStampEpochMillis() > time){
                mapOfAmounts.put(custKey,mapOfAmounts.get(custKey)-mapOfTransactions.get(tranKey).amountCents());
                mapOfTransactions.put(tranKey,transaction);
            }else {
                mapOfTransactions.put(tranKey,transaction);
            }
            mapOfAmounts.put(custKey,mapOfAmounts.getOrDefault(custKey,0L) + amount);
        }

        int i = 0;
        return mapOfAmounts;
    }

    public static void main(String[] args) {
        DeduplicateAndAggregateTransactions dep = new DeduplicateAndAggregateTransactions();
        DeDuplicateTransaction t1 = new DeDuplicateTransaction("t1","cA", 1000, 200);

        DeDuplicateTransaction t2 =new DeDuplicateTransaction("t1","cA",1000,150);

        DeDuplicateTransaction t3 =new DeDuplicateTransaction("t2","cA",500,300);

        DeDuplicateTransaction t4 =new DeDuplicateTransaction("t3","cB", 700,100);
        List<DeDuplicateTransaction> listOfDeDuplicateTransactions = new ArrayList<>(Arrays.asList(t1,t2,t3,t4));
        dep.AggregateTransactions(listOfDeDuplicateTransactions);

    }
}
