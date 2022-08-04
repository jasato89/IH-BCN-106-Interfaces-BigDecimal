package com.ironhack.interfacesExercise;

import java.time.LocalDate;

public class Transaction {
    private Account sellerAccount;
    private Account buyerAccount;
    private double amount;
    private LocalDate date;

    public Transaction(Account sellerAccount, Account buyerAccount, double amount, LocalDate date) {
        this.sellerAccount = sellerAccount;
        this.buyerAccount = buyerAccount;
        this.amount = amount;
        this.date = date;
    }

    public Account getSellerAccount() {
        return sellerAccount;
    }

    public void setSellerAccount(Account sellerAccount) {
        this.sellerAccount = sellerAccount;
    }

    public Account getBuyerAccount() {
        return buyerAccount;
    }

    public void setBuyerAccount(Account buyerAccount) {
        this.buyerAccount = buyerAccount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}


