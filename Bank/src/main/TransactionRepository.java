package main;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.unmodifiableList;
import static main.TransactionType.deposit;
import static main.TransactionType.withdrawal;

public class TransactionRepository {
    List<Transaction> transactions = new ArrayList<>();
    Calendar calendar;

    public TransactionRepository(Calendar cal){
        this.calendar = cal;
    }

    public void addDeposit(int amount) {
        this.transactions.add(new Transaction(amount, deposit, calendar.getDate()));
    }

    public void addWithdraw(int amount) {
        this.transactions.add(new Transaction(amount, withdrawal,calendar.getDate()));
    }

    public List<Transaction> getTransactions() {
        return unmodifiableList(transactions);
    }
}
