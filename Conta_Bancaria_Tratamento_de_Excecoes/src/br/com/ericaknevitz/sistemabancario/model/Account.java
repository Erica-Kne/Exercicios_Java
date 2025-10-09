package br.com.ericaknevitz.sistemabancario.model;

import br.com.ericaknevitz.sistemabancario.exception.ExceededWithdrawLimitException;
import br.com.ericaknevitz.sistemabancario.exception.InsufficientBalanceException;

public class Account {

    private int number;
    private String holder;
    private double balance;
    private double withdrawLimit;

    public Account(int number, String holder, double balance, double withdrawLimite) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimite;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount)
            throws InsufficientBalanceException, ExceededWithdrawLimitException {
        if (amount > balance) {
            throw new InsufficientBalanceException();
        }
        if (amount > withdrawLimit) {
            throw new ExceededWithdrawLimitException();
        }
        balance -= amount;
    }

    public void deposite(double amount) {
        balance += amount;
    }


}
