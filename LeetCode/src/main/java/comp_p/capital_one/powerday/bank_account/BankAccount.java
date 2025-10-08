package comp_p.capital_one.powerday.bank_account;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class BankAccount {
    private Map<String,Account> mapOfAccounts;
    public String path = "C:\\Users\\Anthony\\Documents\\Programming\\Code\\Java-Projects\\LeetCode\\src\\main\\resources\\csvfile\\Command_Log__first_30_rows_.csv";
    public BankAccount(){
        this.mapOfAccounts = new LinkedHashMap<>();
    }

    public static void main(String[] args) {
        BankAccount bank = new BankAccount();
        bank.sendData(bank.path);
        bank.topAccounts();
    }
    public void sendData(String filePath){
        try {
           List<String> commands = new ArrayList<>();
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                String line = scanner.nextLine().trim();
                if (line.isEmpty() || line.startsWith("ts_iso,type,account_id")){
                    continue;
                }

                String [] parts = line.split(",",-1);
                dataExtraction(parts);
            }

        }catch (FileNotFoundException e){
            System.out.println("File not found.");
            e.printStackTrace();
        }
    }

    private void dataExtraction(String[] accountDetails){
        switch (accountDetails[1]){
            case "create_account" -> {
                if (createAccountDataExtraction(accountDetails)){
                    System.out.printf("Account Number: %s, was created successfully\n",accountDetails[2]);
                }else {
                    System.out.printf("Account Number: %s, already created\n",accountDetails[2]);
                }
            }
            case "deposit" ->{
                if (depositDataExtraction(accountDetails)){
                    System.out.printf("Deposit Of %s, was successfully deposit into %s\n", accountDetails[5], accountDetails[2]);
                }else {
                    System.out.printf("Deposit Of %s, was NOT successfully deposit into %s\n", accountDetails[5], accountDetails[2]);
                }
            }
            case "transfer" -> {
                if (transferDataExtraction(accountDetails)){
                    System.out.printf("Transfer Of %s, from %s was successfully transfer into %s\n", accountDetails[5],accountDetails[6],accountDetails[7] );
                }else {
                    System.out.printf("Transfer Of %s, from %s was NOT successfully transfer into %s\n", accountDetails[5],accountDetails[6],accountDetails[7] );
                }
            }
        }
    }

    private boolean createAccountDataExtraction(String[] accountDetails){
        String accountNum = accountDetails[2];
        String name = accountDetails[3];
        return createAccount(accountNum,name);
    }

    private boolean depositDataExtraction(String[] accountDetails){
        String accountNum = accountDetails[2];
        if (isExist(accountNum)){
            double amount = Double.parseDouble(accountDetails[5]);
            return mapOfAccounts.get(accountNum).deposit(amount);
        }
        return false;
    }

    private boolean transferDataExtraction(String[] accountDetails){
        String accountNum = accountDetails[6];
        String accountNum2 = accountDetails[7];
        double amount = Double.parseDouble(accountDetails[5]);
        if (isExist(accountNum) && isExist(accountNum2)){
            //mapOfAccounts.get(accountNum).addActivity(amount);
            return mapOfAccounts.get(accountNum).withDrawn(amount) && mapOfAccounts.get(accountNum2).deposit(amount);
        }
        return false;
    }

    private boolean createAccount(String accountNum, String name){
        Account account = new Account(accountNum, name);
        return mapOfAccounts.putIfAbsent(accountNum,account) == null;
    }

    private boolean isExist(String accountNum){
        return mapOfAccounts.containsKey(accountNum);
    }

    public void topAccounts(){
        mapOfAccounts.values().stream()
                .sorted(Comparator.comparingDouble(Account::getTransactionsTotal).reversed())
                .forEach(a-> System.out.printf("Account %s (%s): activity $%.2f | balance $%.2f%n",
                        a.getAccountNum(), a.getName(),a.getTransactionsTotal(),a.getBal()));
    }


    private boolean isEnoughFund( String accountNum, double amount){
        return mapOfAccounts.get(accountNum).getBal()>=amount;
    }
}
