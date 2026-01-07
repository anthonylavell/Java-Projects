package comp_p.one_pay;

import java.util.*;

public class BankAPP {
    private Map<String,Account>accounts = new HashMap<>();
    private Set<String> txnId = new HashSet<>();
    public void command(List<String>commands){
        for (String command : commands){
            String[] parts  = command.trim().split("\\s+",-1);
            switch (parts[0].toUpperCase()){
                case "CREATE" ->{
                    System.out.println(parts.length==2&&createAccount(parts[1])?"OK":"ERROR");
                }
                case "DEPOSIT" ->{
                    System.out.println(parts.length==4&&depositAccount(parts[0],parts[1],Long.parseLong(parts[2]),parts[3])?"OK":"ERROR");
                }
                case "WITHDRAW" ->{
                    System.out.println(parts.length==4&&withDrawAccount(parts[0],parts[1],Long.parseLong(parts[2]),parts[3])?"OK":"ERROR");
                }
                case "TRANSFER" ->{
                    System.out.println(parts.length==5&&transferAccount(parts[0],parts[1],parts[2], Long.parseLong(parts[3]),parts[4])?"OK":"ERROR");
                }
                case "BALANCE" ->{
                    System.out.println(parts.length==2&&(accountBalance(parts[1])>-1)?accountBalance(parts[1]):"ERROR");
                }
                case "HISTORY" ->{

                    if (parts.length!=3){
                        System.out.println("ERROR");
                        continue;
                    }
                    int limit = Integer.parseInt(parts[2]);
                    accountHistory(parts[1], limit);
                }
                case "FREEZE","UNFREEZE" ->{
                    System.out.println(parts.length==2&&accountStatus(parts[0],parts[1])?"OK":"ERROR");
                }
                default  ->{
                    System.out.println("ERROR");
                }
            }
        }
    }
    private boolean createAccount(String id){
        if (accounts.containsKey(id)){
            return false;
        }
        accounts.put(id,new Account(id));
        return true;
    }
    private boolean depositAccount(String type,String id,long amount, String tranNum){
        if (!accounts.containsKey(id) ||  accounts.get(id).getStatus().equals("FROZEN") || isTxIdFound(tranNum)){
            return false;
        }
        Account account = accounts.get(id);


        return  addTxIdFound(account.deposit(type, amount,tranNum),tranNum);
    }
    private boolean withDrawAccount(String type,String id,long amount, String tranNum){
        if (!accounts.containsKey(id) || accounts.get(id).getStatus().equals("FROZEN") || isTxIdFound(tranNum)){
            return false;
        }
        Account account = accounts.get(id);

        return  addTxIdFound(account.withDraw(type,amount,tranNum),tranNum);
    }
    private boolean transferAccount(String type,String acc, String acc2,long amount, String tranNum){
        if (!accounts.containsKey(acc) || !accounts.containsKey(acc2) ||  accounts.get(acc).getStatus().equals("FROZEN")
                ||  accounts.get(acc2).getStatus().equals("FROZEN") ){
            return false;
        }
        if (amount<=0||accounts.get(acc).getBalance() < amount ||  isTxIdFound(tranNum))
            return false;
        Account account = accounts.get(acc);
        String tOut = type+"_OUT "+acc2;
        if (!account.withDraw(tOut,amount,tranNum)){
            return false;
        }
        String tIn = type+"_IN "+acc;
        Account account2 = accounts.get(acc2);

        return addTxIdFound(account2.deposit(tIn,amount,tranNum),tranNum);
    }
    private long accountBalance(String id){
        if (!accounts.containsKey(id)){
            return -1;
        }
        return accounts.get(id).getBalance();
    }

    private void accountHistory(String id, int limit){
        if (!accounts.containsKey(id) || limit <=0){
            System.out.println("ERROR");
            return;
        }
        Node node = accounts.get(id).getHistory();

        while (node!=null && limit-->0){
            System.out.println(node.history);
            node = node.next;
        }
    }
    private boolean accountStatus(String type,String id){
        if (!accounts.containsKey(id)){
            return false;
        }
        if (type.equals("UNFREEZE") || type.equals("FREEZE")){
            return accounts.get(id).setStatus(type);
        }
        return false;
    }

    private boolean isTxIdFound(String tranNum){
        return txnId.contains(tranNum);
    }

    private boolean addTxIdFound(boolean isTorF, String tranNum){

        return isTorF? txnId.add(tranNum) : isTorF;
    }

    public static void main(String[] args) {
        BankAPP app = new BankAPP();

        List<String> commands = List.of(
                "CREATE A",
                "DEPOSIT A 1000 t1",
                "TRANSFER A B 250 t2",
                "BALANCE A",
                "HISTORY A 5"
        );
        app.command(commands);
    }
}
