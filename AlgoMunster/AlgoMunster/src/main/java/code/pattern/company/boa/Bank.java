package code.pattern.company.boa;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Stream;

public class Bank {

    private Map<String,Account>mapOfAccounts;
    public Bank(){
        this.mapOfAccounts = new HashMap<>();
    }



    private boolean createAccount(String id, String name){
        if (id == null || name == null || id.isEmpty() || name.isEmpty()){
            return false;
        }
        return mapOfAccounts.putIfAbsent(id,new Account(id,name)) == null;
    }

    private boolean deposit(String id, double amount) {
        if (amount > 0 && foundAccount(id)){
            Account account = mapOfAccounts.get(id);
            return  account.deposit(amount);
        }
        return false;
    }
    private boolean withdraw(String id, double amount) {
        if (amount > 0 && foundAccount(id) && mapOfAccounts.get(id).getBalance()>=amount){
            Account account = mapOfAccounts.get(id);
            return account.withdraw(amount);
        }
        return false;

    }
    private boolean transfer(String fromId, String destinationId, double amount) {
        if (foundAccount(destinationId) && withdraw(fromId,amount)){
            return deposit(destinationId,amount);
        }
        return false;
    }

    public List<Account> topAccountsByActivity(int n) {
        if (mapOfAccounts.isEmpty()){
            return Collections.emptyList();
        }
        return mapOfAccounts.values().stream()
                .sorted(Comparator.comparingDouble(Account::getActivityTotal).reversed())
                .limit(n)
                .toList();
    }

    private boolean foundAccount(String id){
        return mapOfAccounts.containsKey(id);
    }

    public String sendCommands(String path){
        if (path.endsWith("json")){
           return extractJson(path) ? "success" : "fail";
        }else if(path.endsWith("csv")){
           return extractCsv(path)? "success" : "fail";
        }
        return "file is not compatible";
    }

    private boolean extractJson(String path){
        try {
          String jsonText = new String(Files.readAllBytes(Paths.get(path)));
          JSONArray jsonArray = new JSONArray(jsonText);
          for (int index = 0; index < jsonArray.length(); index++){
              String[] accountTitle = {"ts_iso","type","account_id","account_name",
                      "currency","amount","source_account_id","destination_account_id","note"};
              JSONObject jsonObject = jsonArray.optJSONObject(index);
              if (jsonObject == null)
                  continue;
              String[] accountInfo = Stream.of(accountTitle)
                      .map(k->jsonObject.optString(k,""))
                      .toArray(String[]::new);
              if (!sendAccountData(accountInfo))
                  return false;
          }
           return true;
        } catch (Exception e) {
            System.out.println("Json Fail");
            throw new RuntimeException(e);
        }

    }

    private boolean extractCsv(String path){
        try {
            File file = new File(path);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                if (line.isEmpty() || line.startsWith("ts_iso,type,account_id")){
                    continue;
                }
                String[] accountInfo = line.split(",",-1);
                if (!sendAccountData(accountInfo))
                    return false;
            }
            return true;

        }catch (Exception e) {
            System.out.println("CSV Fail");
            throw new RuntimeException(e);
        }
    }

    private boolean sendAccountData(String[] accountInfo){
        if (accountInfo != null && accountInfo.length == 9) {
            String accountType = accountInfo[1];
            String id = accountInfo[2];
            String name = accountInfo[3];
            double amount = (accountInfo[5].isBlank()) ? 0.0 : Double.parseDouble(accountInfo[5]);
            String fromId = accountInfo[6];
            String destinationId = accountInfo[7];
            switch (accountType) {
                case "create_account" -> {
                    return createAccount(id, name);
                }
                case "deposit" -> {
                    return deposit(id, amount);
                }
                case "withdraw" -> {
                    return withdraw(id, amount);
                }
                case "transfer" -> {
                    return transfer(fromId, destinationId, amount);
                }
            }
        }
        return false;
    }
}
