package com.ironhack.interfacesExercise;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public interface TransactionList {

    Transaction getLastTransaction();
    void addTransaction(Transaction transaction);
    Transaction getTransactionByDate(LocalDate date);
    List<Transaction> getAllTransactions();

}
