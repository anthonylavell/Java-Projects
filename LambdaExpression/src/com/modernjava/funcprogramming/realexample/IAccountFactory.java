package com.modernjava.funcprogramming.realexample;

public interface IAccountFactory {
    public abstract BankAccount getBankAccount(int id, double balance,
                                               String accountName);
}

