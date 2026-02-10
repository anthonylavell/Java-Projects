package comp_p.capital_one.powerday.bank_account;

public class Account {
    private final String accountNum;
    private double amountInCent;
    private final String name;
    private double transactionsTotal;

    public Account(String accountNum, String name) {
        this.accountNum = accountNum;
        this.name = name;
        this.amountInCent =0;
        this.transactionsTotal = 0;
    }

    public String getAccountNum() {
        return accountNum;
    }

    public String getName() {
        return name;
    }

    public void setBalance(double amountInCent) {
        this.amountInCent = amountInCent;
    }

    public double getBalance() {
        return amountInCent;
    }

    public void addActivity(double amount){
        transactionsTotal+=amount;
    }

    public double getActivity(){
        return transactionsTotal;
    }
}
