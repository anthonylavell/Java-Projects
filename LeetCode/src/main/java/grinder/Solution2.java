package grinder;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * Create TransactionException, DigitalWallet, and DigitalWalletTransaction classes here.
 */

class DigitalWallet{
    private final String walletId;
    private final String userName;
    private String userAccessCode;
    private int walletBalance;

    public DigitalWallet(String walletId, String userName){
        this.userName = userName;
        this.walletId = walletId;
    }

    public DigitalWallet(String walletId, String userName, String userAccessCode){
        this.userName = userName;
        this.walletId = walletId;
        this.userAccessCode = userAccessCode;

    }
    public String getWalletId(){
        return walletId;
    }

    public String getUsername(){
        return userName;
    }

    public String getUserAccessToken(){
        return userAccessCode;
    }

    public int getWalletBalance(){
        return walletBalance;
    }

    public void setWalletBalance(int walletBalance){
        if(walletBalance > 0)
            this.walletBalance += walletBalance;
    }
}

class DigitalWalletTransaction{
    private final String[] errorCodes = {"USER_NOT_AUTHORIZE","INSUFFICIENT_BALANCE","INVALID_AMOUNT"};
    private final String[] errorMessage= {"User not authorized","Insufficient Balance","Amount should be greater than zero"};
    public void addMoney(DigitalWallet digitalWallet, int amount) throws TransactionException{
        if(digitalWallet.getUserAccessToken().isEmpty()){
            throw new TransactionException(errorCodes[0],errorMessage[0]);
        }
        if(amount < 1){
            throw  new TransactionException(errorCodes[2],errorMessage[2]);
        }
        digitalWallet.setWalletBalance(amount);
    }

    public void payMoney(DigitalWallet digitalWallet, int amount) throws TransactionException {
        if(digitalWallet.getUserAccessToken().isEmpty()){
            throw new TransactionException(errorCodes[0],errorMessage[0]);
        }
        if(amount < 1){
            throw new TransactionException(errorCodes[2],errorMessage[2]);
        }
        int bal = digitalWallet.getWalletBalance();
        if(bal< amount){
            throw new TransactionException(errorCodes[1],errorMessage[1]);
        }

        digitalWallet.setWalletBalance(bal-amount);
    }
}

class TransactionException extends Throwable {
    private String errorMessage;
    private String errorCode;
    public TransactionException(String errorMessage, String errorCode){
        this.errorMessage = errorMessage;
        this.errorCode = errorCode;
    }

    public String getErrorCode(){
        return errorCode;
    }

}

public class Solution2 {
    private static final Scanner INPUT_READER = new Scanner(System.in);
    private static final DigitalWalletTransaction DIGITAL_WALLET_TRANSACTION = new DigitalWalletTransaction();


    private static final Map<String, DigitalWallet> DIGITAL_WALLETS = new HashMap<>();

    public static void main(String[] args) {
        int numberOfWallets = Integer.parseInt(INPUT_READER.nextLine());
        while (numberOfWallets-- > 0) {
            String[] wallet = INPUT_READER.nextLine().split(" ");
            DigitalWallet digitalWallet;

            if (wallet.length == 2) {
                digitalWallet = new DigitalWallet(wallet[0], wallet[1]);
            } else {
                digitalWallet = new DigitalWallet(wallet[0], wallet[1], wallet[2]);
            }

            DIGITAL_WALLETS.put(wallet[0], digitalWallet);
        }

        int numberOfTransactions = Integer.parseInt(INPUT_READER.nextLine());
        while (numberOfTransactions-- > 0) {
            String[] transaction = INPUT_READER.nextLine().split(" ");
            DigitalWallet digitalWallet = DIGITAL_WALLETS.get(transaction[0]);

            if (transaction[1].equals("add")) {
                try {
                    DIGITAL_WALLET_TRANSACTION.addMoney(digitalWallet, Integer.parseInt(transaction[2]));
                    System.out.println("Wallet successfully credited.");
                } catch (TransactionException ex) {
                    System.out.println(ex.getErrorCode() + ": " + ex.getMessage() + ".");
                }
            } else {
                try {
                    DIGITAL_WALLET_TRANSACTION.payMoney(digitalWallet, Integer.parseInt(transaction[2]));
                    System.out.println("Wallet successfully debited.");
                } catch (TransactionException ex) {
                    System.out.println(ex.getErrorCode() + ": " + ex.getMessage() + ".");
                }
            }
        }

        System.out.println();

        DIGITAL_WALLETS.keySet()
                .stream()
                .sorted()
                .map((digitalWalletId) -> DIGITAL_WALLETS.get(digitalWalletId))
                .forEachOrdered((digitalWallet) -> {
                    System.out.println(digitalWallet.getWalletId()
                            + " " + digitalWallet.getUsername()
                            + " " + digitalWallet.getWalletBalance());
                });
    }
}