package comp_p.capital_one.powerday.bank_account;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Stream;

public class BankAccount {
    private Map<String,Account> mapOfAccounts;

    public BankAccount(){
        this.mapOfAccounts = new LinkedHashMap<>();
    }

    public String sendData(String filePath){
        if (filePath.endsWith(".json")){
             jsonData(filePath);
             return "Success";
        }else if (filePath.endsWith(".csv")){
            csvData(filePath);
            return "Success";
        }
        return "File not File";
    }

    public void sendData(List<String> commands){
        for (String command : commands){
            String[] commandArr = command.split(",");
            dataExtraction(commandArr);
        }
    }

    private void jsonData(String path){
        try {
            String[] accountTitles = {"ts_iso","type","account_id","account_name",
                    "currency","amount","source_account_id","destination_account_id","note"};
            String jsonText = new String (Files.readAllBytes(Paths.get(path)));
            JSONArray jsonArray = new JSONArray(jsonText);
            for (int index = 0; index < jsonArray.length(); index++){
                JSONObject object = jsonArray.optJSONObject(index);
                String[] accountDetails = Stream.of(accountTitles)
                                .map(k-> object.optString(k,""))
                                .toArray(String[]::new);
                dataExtraction(accountDetails);


            }
        }catch (Exception e){
            System.out.println("File Not Found");
            e.printStackTrace();
        }

    }
    private void csvData(String filePath){
        try {
           List<String> commands = new ArrayList<>();
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                String line = scanner.nextLine().trim();
                if (line.isEmpty() || line.startsWith("ts_iso,type,account_id")){
                    continue;
                }

                String [] parts = line.split(",");
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
                String accountNum = accountDetails[2];
                double amount = Double.parseDouble(accountDetails[5]);
                    Account account = isExist(accountNum);
                if (account != null && deposit(account, amount)){
                        System.out.printf("Deposit Of %s, was successfully deposit into %s\n", accountDetails[5], accountDetails[2]);
                }else {
                    System.out.printf("Deposit Of %s, was NOT successfully deposit into %s\n", accountDetails[5], accountDetails[2]);
                }
            }
            case "transfer" -> {
                String accountNum = accountDetails[6];
                String accountNum2 = accountDetails[7];
                double amount = Double.parseDouble(accountDetails[5]);
                Account from = isExist(accountNum);
                Account to = isExist(accountNum2);
                if (from!=null && to!=null && transfer(from,to,amount)){
                    System.out.printf("Transfer Of %s, from %s was successfully transfer into %s\n", accountDetails[5],accountDetails[6],accountDetails[7] );
                }else {
                    System.out.printf("Transfer Of %s, from %s was NOT successfully transfer into %s\n", accountDetails[5],accountDetails[6],accountDetails[7] );
                }
            }
        }
    }

    private boolean createAccountDataExtraction(String[] accountDetails){
        String accountNum = accountDetails[2];
        if (isExist(accountNum)!=null){
            return false;
        }
        String name = accountDetails[3];
        mapOfAccounts.put(accountNum,new Account(accountNum, name));
        return true;
    }

    private boolean deposit(Account account, double amount){
        double currentBal = account.getBalance() + amount;
        if (amount > 0){
            account.setBalance(currentBal);
            account.addActivity(currentBal);
            return true;
        }
        return false;
    }

    private boolean withDrawn(Account account, double amount){
        double currentBal = account.getBalance() - amount;
        if (currentBal >= 0){
            account.setBalance(currentBal);
            account.addActivity(currentBal);
            return true;
        }
        return false;
    }

    private boolean transfer(Account from, Account to, double amount){
            if (withDrawn(from,amount)){
                return false;
            }
            deposit(to,amount);

        return true;
    }

    private Account isExist(String accountNum){
        return mapOfAccounts.getOrDefault(accountNum,null);
    }

    public void topAccounts(){
        mapOfAccounts.values().stream()
                .sorted(Comparator.comparingDouble(Account::getActivity).reversed())
                .forEach(a-> System.out.printf("Account %s (%s): activity $%.2f | balance $%.2f%n",
                        a.getAccountNum(), a.getName(),a.getActivity(),a.getBalance()));
    }
}
