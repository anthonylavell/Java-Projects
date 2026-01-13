package comp_p.one_pay;

import java.util.*;

public class BankAPP {
    private List<String>results;
    private Map<String,Account>accounts = new HashMap<>();
    private Set<String>taxIDSet = new HashSet<>();

    public List<String> process(List<String> commands){
        results = new ArrayList<>();
        for (String command : commands){
            String[] parts = command.trim().split("\\s+");
            if (parts.length > 0){
                switch (parts[0]){
                    case "CREATE" ->{
                        if (parts.length==2){
                            results.add(createAccount(parts[1]));
                        }else {
                            results.add("ERROR");
                        }
                    }
                    case "DEPOSIT" -> {
                        if (parts.length == 4 && !taxIDSet.contains(parts[3])) {
                            results.add(depositAccount(parts[0],parts[1],Long.parseLong(parts[2]),parts[3]));
                            if (results.get(results.size()-1).equalsIgnoreCase("OK")){
                                taxIDSet.add(parts[3]);
                            }
                        } else {
                            results.add("ERROR");
                        }
                    }
                    case "WITHDRAW" -> {
                        if (parts.length == 4 && !taxIDSet.contains(parts[3])) {
                            results.add(withDrawAccount(parts[0],parts[1],Long.parseLong(parts[2]),parts[3]));
                            if (results.get(results.size()-1).equalsIgnoreCase("OK")){
                                taxIDSet.add(parts[3]);
                            }
                        } else {
                            results.add("ERROR");
                        }
                    }
                    case "TRANSFER" -> {
                        if (parts.length == 5 && !taxIDSet.contains(parts[4])) {
                            results.add(transferAccount(parts[0],parts[1],parts[2],Long.parseLong(parts[3]),parts[4]));
                            if (results.get(results.size()-1).equalsIgnoreCase("OK")){
                                taxIDSet.add(parts[4]);
                            }
                        } else {
                            results.add("ERROR");
                        }
                    }
                    case "BALANCE" -> {
                        if (parts.length == 2) {
                            results.add(getAccountBalance(parts[1]));
                        } else {
                            results.add("ERROR");
                        }
                    }
                    case "HISTORY" -> {
                        if (parts.length == 3 && Integer.parseInt(parts[2]) >0) {
                            getAccountHistory(parts[1],Integer.parseInt(parts[2]));
                        } else {
                            results.add("ERROR");
                        }
                    }
                    case "FREEZE","UNFREEZE" -> {
                        if (parts.length == 2) {
                            results.add(setAccountStatus(parts[0],parts[1]));
                        } else {
                            results.add("ERROR");
                        }
                    }
                    default -> results.add("ERROR");
                }
            }

        }
        return results;
    }
    private String createAccount(String id){
        if (accounts.containsKey(id)){
            return "ERROR";
        }
        accounts.put(id,new Account(id));
        return "OK";
    }
    private String getAccountBalance(String id){
        Account account = accounts.get(id);
        if (account==null){
            return "ERROR";
        }

        return String.valueOf(account.getBalance());
    }
    private void getAccountHistory(String id, int limit){
        Account account = accounts.get(id);
            if (account==null){
                results.add("ERROR");
                return;
            }
            List<String>history = account.getHistory();
            for (int index = history.size()-1; index >=0 && limit-->0; index--){
                results.add(history.get(index));
            }

    }
    private String setAccountStatus(String type,String id){
        Account account = accounts.get(id);
        if (account == null){
            return "ERROR";
        }
        account.setStatus(type);
        return "OK";
    }
    private String depositAccount(String type, String id, long amount, String taxId){
        Account account = accounts.get(id);
        if (account==null || account.getStatus().equalsIgnoreCase("FROZEN") || !account.deposit(type, amount,taxId)){
            return "ERROR";
        }

        return "OK";
    }
    private String withDrawAccount(String type, String id, long amount, String taxId){
        Account account = accounts.get(id);
        if (account==null || account.getStatus().equalsIgnoreCase("FROZEN")  || !account.withDraw(type, amount,taxId)){
            return "ERROR";
        }

        return "OK";
    }

    private String transferAccount(String type, String firstId,String secondId, long amount, String taxId){
        Account account = accounts.get(firstId);
        Account account2 = accounts.get(secondId);
        String transTypeOut = type+"_OUT "+secondId;
        String transTypeIn = type+"_IN "+firstId;
        if (account==null || account2 == null || account.getStatus().equalsIgnoreCase("FROZEN")
                || account2.getStatus().equalsIgnoreCase("FROZEN")
                || withDrawAccount(transTypeOut,firstId,amount,taxId).equals("ERROR")){
            return "ERROR";
        }
        depositAccount(transTypeIn,secondId,amount,taxId);
        return "OK";
    }
}
