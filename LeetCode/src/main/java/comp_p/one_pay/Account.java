package comp_p.one_pay;

class Node{
    String history;
    Node next;
    Node(String history){
        this.history = history;
    }
}
public class Account {
    private final String accountId;
    private long balance;
    private AccountStatus accountStatus;
    private Node ledger;

    public Account(String id){
        this.accountId = id;
        balance =0;
        accountStatus = AccountStatus.UNFREEZE;
        ledger = null;
    }
    public boolean deposit(String type, long amount,String tranNum){
        if (amount <= 0){
            return false;
        }
        balance+=amount;
        setHistory(type,amount,tranNum);
        return true;
    }
    public boolean withDraw(String type,long amount,String tranNum){
        if ( amount<=0 || balance-amount<0){
            return false;
        }
        balance-=amount;
        setHistory(type,amount,tranNum);
        return true;
    }
    public long getBalance(){
        return balance;
    }
    private void setHistory(String type, long amount, String tranNum){
        String record = type+" "+amount+" "+tranNum;
        Node node = new Node(record);
        node.next = ledger;
            ledger = node;
        }

    public Node getHistory(){
        return ledger;
    }

    public boolean setStatus(String status){
        accountStatus = AccountStatus.valueOf(status);
        return true;
    }

    public String getStatus(){

        return accountStatus.getStatus();
    }

    public static void main(String[] args) {
        AccountStatus status =AccountStatus.valueOf("FREEZE");
        System.out.println(status.getStatus());
        status = AccountStatus.valueOf("UNFREEZE");
        System.out.println(status.getStatus());
    }
}
