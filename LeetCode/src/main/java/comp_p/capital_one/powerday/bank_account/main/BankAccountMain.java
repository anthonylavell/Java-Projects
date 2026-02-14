package comp_p.capital_one.powerday.bank_account.main;

import comp_p.capital_one.powerday.bank_account.BankAccount;

public class BankAccountMain {
    static String path = "C:\\Users\\Anthony\\Documents\\Programming\\Code\\Java-Projects" +
            "\\LeetCode\\src\\main\\resources\\jsonfile\\command_log_first30.json";
   /* public static String path = "C:\\Users\\Anthony\\Documents\\Programming\\Code\\Java-Projects" +
     "\\LeetCode\\src\\main\\resources\\csvfile\\Command_Log__first_30_rows_.csv";*/
    /*static String path = "C:\\Users\\Anthony\\Documents\\Programming\\Code\\Java-Projects" +
            "\\LeetCode\\src\\main\\resources\\textfile\\command_log_first30.txt";*/
    public static void main(String[] args) {
        BankAccount bank = new BankAccount();
        bank.sendData(path);
        bank.topAccounts();
    }
}
