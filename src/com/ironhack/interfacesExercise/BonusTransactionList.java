package com.ironhack.interfacesExercise;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class BonusTransactionList implements TransactionList {

    private double aggregatedBonus;
    private List<Transaction> transactions = new LinkedList<>();

    @Override
    public Transaction getLastTransaction() {
        return null;
    }

    @Override
    public void addTransaction(Transaction transaction) {

    }

    @Override
    public Transaction getTransactionByDate(LocalDate date) {
        return null;
    }

    @Override
    public List<Transaction> getAllTransactions() {
        return null;
    }
}
