package com.s1dmlgus.tdd.account;

public class Account {

    private int balance;

    public Account(int money) {
        this.balance = money;

    }

    public int getBalance() {
        return this.balance;
    }

    // 입금
    public void deposit(int i) {
        this.balance += i;
    }
}
