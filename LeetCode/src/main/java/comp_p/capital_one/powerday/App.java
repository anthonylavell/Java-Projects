package comp_p.capital_one.powerday;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class App {
    private Map<String, Account> mapOfAccounts;
    public App(){
        this.mapOfAccounts = new HashMap<>();
    }
    public static void main(String[] args) {
        App app = new App();
        String[] datas = {"create_account,account1","create_account,account1","create_account,account2",
                "deposit,account1,500","deposit,account2,250","transfer,account1,account2,100"};
        app.csvData(datas);
        app.getTopActivity();

    }
    private void csvData(String []datas){
        for (String data : datas){
            String[] parts = data.split(",");
            String operation = parts[0];
            switch (operation){
                case "create_account" ->{
                    System.out.println(createAccount(parts[1])  );
                }
                case "deposit" ->{
                    int amount = Integer.parseInt(parts[2]);
                    System.out.println(deposit(parts[1],amount));
                }
                case "transfer" ->{
                    int amount = Integer.parseInt(parts[3]);
                    System.out.println(transfer(parts[1],parts[2],amount));
                }
            }
        }
    }

    public boolean createAccount(String key){
        if (mapOfAccounts.containsKey(key)){
            return false;
        }
        mapOfAccounts.put(key, new Account(key));
        return true;
    }

    public int deposit(String key, int amount){
        if (!mapOfAccounts.containsKey(key)){
            return -1;
        }
        return mapOfAccounts.get(key).deposit(amount);
    }

    public int transfer(String acct, String acct2, int amount){
        if (!mapOfAccounts.containsKey(acct) || !mapOfAccounts.containsKey(acct2)){
            return -1;
        }
        if (mapOfAccounts.get(acct).withDrawn(amount) < 0)
            return -1;
        mapOfAccounts.get(acct2).deposit(amount);
        return mapOfAccounts.get(acct).getBal();
    }

    public void getTopActivity(){
        mapOfAccounts.values().stream()
                .sorted(Comparator.comparingInt(Account::getActivity).reversed())
                .forEach(a -> System.out.printf("Account: %s | Balance: %d | Activity Amount: %s%n",
                        a.getId(),a.getBal(),a.getActivity()));
    }

}
class Account {
    private final String id;
    private int bal;
    private int transactionsTotal;
    public Account(String id) {
        this.id = id;
        this.bal =0;
        this.transactionsTotal = 0;
    }
    public String getId(){
        return id;
    }
    public int deposit(int amount){
        addActivity(amount);
        return bal += amount;
    }

    public int getBal(){
        return bal;
    }

    public int withDrawn(int amount){
        if (bal-amount >= 0){
            addActivity(amount);
            return bal-=amount;
        }
        return -1;
    }

    private void addActivity(int amount){
        transactionsTotal+=amount;
    }
    public int getActivity(){
        return transactionsTotal;
    }
}