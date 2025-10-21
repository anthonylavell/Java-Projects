package code.pattern.company.boa.capital_one;

public class MinimumMoneyRequiredBeforeTransactions {
    public long minimumMoney(int[][] transactions) {
        // Calculate total net loss from all losing transactions
        // A transaction causes a net loss when cost > cashback
        long totalNetLoss = 0;
        for (int[] transaction : transactions) {
            int cost = transaction[0];
            int cashback = transaction[1];
            // Only add the net loss (cost - cashback) if it's positive
            totalNetLoss += Math.max(0, cost - cashback);
        }

        // Find the minimum initial money needed to complete all transactions
        long minimumInitialMoney = 0;
        for (int[] transaction : transactions) {
            int cost = transaction[0];
            int cashback = transaction[1];

            if (cost > cashback) {
                // For losing transactions: need total loss from other transactions + cashback from this one
                // This ensures we have enough money before executing this transaction
                minimumInitialMoney = Math.max(minimumInitialMoney, totalNetLoss + cashback);
            } else {
                // For profitable/neutral transactions: need total loss + full cost of this transaction
                // Since we don't lose money on this transaction, we need its full cost upfront
                minimumInitialMoney = Math.max(minimumInitialMoney, totalNetLoss + cost);
            }
        }

        return minimumInitialMoney;
    }
}
