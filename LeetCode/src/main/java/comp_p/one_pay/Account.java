package comp_p.one_pay;


import java.util.ArrayList;
import java.util.List;

public class Account {
    private String id;
    private long balanceCents;
    private int status;
    List<String>ledger;
    public Account(String id){
        this.id = id;
        this.balanceCents = 0;
        this.status = 0;
        this.ledger = new ArrayList<>();
    }
    public boolean deposit(String type, long amount,String txnId){
        if (amount <=0 ){
            return false;
        }
        balanceCents+=amount;
        setHistory(type,amount,txnId);
        return true;
    }

    public boolean withDraw(String type, long amount,String txnId){
        if (amount <=0 || balanceCents-amount < 0){
            return false;
        }
        balanceCents-=amount;
        setHistory(type,amount,txnId);
        return true;
    }

    public long getBalance(){
        return balanceCents;
    }

    private void setHistory(String type, long amount,String txnId){
        String transaction = type+" "+amount+" "+txnId;
        ledger.add(transaction);
    }

    public boolean setStatus(String newStatus){
        status = (newStatus.equalsIgnoreCase("FREEZE")) ? -1 : 0;
        return true;
    }

    public String getStatus(){
        return status < 0 ? "FROZEN" : "ACTIVE";
    }

    public List<String> getHistory(){
        return ledger;
    }

}
