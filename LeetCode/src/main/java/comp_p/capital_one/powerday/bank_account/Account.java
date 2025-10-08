package comp_p.capital_one.powerday.bank_account;

import lombok.Getter;

@Getter
public class Account {
    private final String accountNum;
    private double bal;
    private final String name;
    private double transactionsTotal;

    public Account(String accountNum, String name) {
        this.accountNum = accountNum;
        this.name = name;
        this.bal =0;
        this.transactionsTotal = 0;
    }
    public boolean deposit(double amount){
        if (amount > 0.0) {
            bal += amount;
            addActivity(amount);
            return true;
        }
        return false;
    }
    public boolean withDrawn(double amount){
        if (amount > 0.0 && bal-amount > 0.0){
            bal-=amount;
            addActivity(amount);
            return true;
        }
        return false;

    }

    private void addActivity(double amount){
        transactionsTotal+=amount;
    }
}
