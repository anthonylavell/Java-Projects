package com.modernjava.funcprogramming.realexample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;

public class BankTransfer {
    public static void main(String[] args) {
        IAccountFactory accountFactory = BankAccount::new;
        BankAccount studentBankAccount = accountFactory.getBankAccount(1, 5000,
                "StudentA");
        BankAccount universityBankAccount = accountFactory.getBankAccount(2, 10000,
                "University");

        BiPredicate<Double,Double> p1 = (balance, amount) -> balance > amount;
        BiConsumer<String, Double> p2 = (Student, university) -> System.out.println(
                "Ending balance of student account: " + studentBankAccount.getBalance() + " University account: " + universityBankAccount.getBalance());

        ExecutorService service = Executors.newFixedThreadPool(10);

        Thread t1 = new Thread( () ->{

        } ) ;
    }
}
