package com.ironhack.interfacesExercise;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PaymentList implements TransactionList{
    private String listName;
    private int listId;
    private List<Transaction> transactionList = new ArrayList<Transaction>();

    public PaymentList(String listName, int listId) {
        this.listName = listName;
        this.listId = listId;
    }


    @Override
    public Transaction getLastTransaction() {
        return transactionList.get(transactionList.size() - 1);
    }

    @Override
    public void addTransaction(Transaction transaction) {
        transactionList.add(transaction);

    }

    @Override
    public Transaction getTransactionByDate(LocalDate date) {
        for (Transaction t : transactionList) {
            if (t.getDate().equals(date)) {
                return t;
            }
        }
        return null;
    }

    @Override
    public List<Transaction> getAllTransactions() {
        return transactionList;
    }

    public String getListName() {
        return listName;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }

    public int getListId() {
        return listId;
    }

    public void setListId(int listId) {
        this.listId = listId;
    }

    public List<Transaction> getTransactionList() {
        return transactionList;
    }

    public void setTransactionList(List<Transaction> transactionList) {
        this.transactionList = transactionList;
    }

}
