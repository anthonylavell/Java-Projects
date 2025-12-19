package comp_p.caterpillar;

public record DeDuplicateTransaction(String transactionId, String customerId, long amountCents, long timeStampEpochMillis){}
