package main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static main.TransactionType.deposit;

public class Transaction {
    private int amount;
    private TransactionType type;

    LocalDate   date;

    public Transaction(int amount, TransactionType type, LocalDate date) {
        this.amount = ((type== deposit) ? amount : -amount);
        this.type = type;
        this.date = date;
    }

    public int getAmount() {
        return  amount;
    }

    public TransactionType getType() {
        return type;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString(){
        return getFormattedDate() + " | " + amount;
    }

    private String getFormattedDate() {
        return date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
}
