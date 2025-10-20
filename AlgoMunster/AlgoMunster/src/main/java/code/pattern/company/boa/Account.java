package code.pattern.company.boa;

import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class Account {
    private final String id;
    private final String name;
    private double balance;
    private double activityTotal;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
        this.balance = 0;
        this.activityTotal = 0;
    }


    public boolean deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            recordActivity(amount);
            return true;
        }
        return false;
    }

    public boolean withdraw(double amount){
        if (amount > 0 && this.balance >= amount) {
            this.balance -= amount;
            recordActivity(amount);
            return true;
        }
        return false;
    }


    private void recordActivity(double activityTotal) {
        this.activityTotal += activityTotal;
    }
}
