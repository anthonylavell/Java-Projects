package code.pattern.company.boa.main;

import code.pattern.company.boa.Bank;

public class BankMain {
    private static String csvPath = "C:\\Users\\Anthony\\Documents\\Programming\\Code\\Java-Projects\\AlgoMunster\\AlgoMunster\\src\\main\\resources\\csvfile\\Command_Log__first_30_rows_.csv";
    private static String jsonPath = "C:\\Users\\Anthony\\Documents\\Programming\\Code\\Java-Projects\\AlgoMunster\\AlgoMunster\\src\\main\\resources\\jsonfile\\command_log_first30.json";

    public static void main(String[] args) {
        Bank bank = new Bank();
        Bank bank2 = new Bank();
        System.out.println(bank.sendCommands(jsonPath));
        System.out.println(bank2.sendCommands(csvPath));
        System.out.println(bank.topAccountsByActivity(3));
        System.out.println(bank2.topAccountsByActivity(4));

    }
}
