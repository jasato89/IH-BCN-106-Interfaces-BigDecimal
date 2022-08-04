package com.ironhack;

import com.ironhack.interfacesExercise.Account;
import com.ironhack.interfacesExercise.PaymentList;
import com.ironhack.interfacesExercise.SavingsAccount;
import com.ironhack.interfacesExercise.Transaction;

import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        List<Employee> employees0 = new ArrayList<>();

        List<Employee> employees = Arrays.asList(
                new Employee("John Doe", "jdoe@ironhack.com", 10, 30000),
                new Intern("John Doe Jr", "jdoejr@ironhack.com", 10, 30000),
                new Employee("Mary Doe", "mdoe@ironhack.com", 66, 70000),
                new Intern("Mary Doe Jr", "mdoejr@ironhack.com", 55, 40000),
                new Employee("Fernando Doe", "fdoe@ironhack.com", 20, 33000),
                new Employee("Yolanda Doe", "ydoe@ironhack.com", 17, 22000),
                new Employee("Juan Doe", "jdoe@ironhack.com", 60, 52000),
                new Employee("Nick Doe", "ndoe@ironhack.com", 16, 39000),
                new Employee("Anibal Doe", "adoe@ironhack.com", 33, 26000),
                new Employee("Hanna Doe", "hdoe@ironhack.com", 20, 30000)
        );

        FileWriter writer = new FileWriter("employees.txt", true);
        for (Employee e : employees) {
            writer.write(e.toString() + "\n");

        }
        writer.close();




        Account account1 = new SavingsAccount("Jaume", "Malaga", 1, 20000);
        Account account2 = new SavingsAccount("Alejandro", "Barcelona", 2, 22000);


        Transaction transaction = new Transaction(account1, account2, 20, LocalDate.now());

        Date date = Date.from(Instant.now());

        PaymentList paymentList = new PaymentList("Transacciones entre Jaume y Alejandro", 1, new ArrayList<>());

        for (Transaction t : paymentList.getAllTransactions()) {
            System.out.println(t.getBuyerAccount());
        }

        paymentList.addTransaction(transaction);

        for (Transaction t : paymentList.getAllTransactions()) {
            System.out.println(t.getBuyerAccount().getName());
        }


        /*
        Create a TransactionList interface that has the methods
         getLastTransaction which returns a Transaction object,
         addTransaction which is void and takes a Transaction as a parameter,
          getTransactionByDate which takes a Date parameter and returns a
          Transaction object, and getAllTransactions which returns an
          ArrayList of Transaction objects.

    Transaction objects should have
    sellerAccountNumber, buyerAccountNumber,amount,
 and 'date properties. The Account object should have name, address,
 accountNumber, and balance properties.

Implement the interface in a class called PaymentList.
 PaymentList should have an ArrayList property that contains
 all Transactions. It should implement all methods from the interface.
         */

    }

}
