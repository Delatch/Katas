package main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static main.TransactionType.deposit;
import static main.TransactionType.withdraw;

public class TransactionRepository {
    List<Transaction> transactions = new ArrayList<>();

    public void addDeposit(int amount) {
        this.transactions.add(new Transaction(amount, deposit));
    }

    public void addWithdraw(int amount) {
        this.transactions.add(new Transaction(amount, withdraw));
    }

    public int transactionsCount() {
        return this.transactions.size();
    }

    public List<Transaction> getTransactions() {
        return this.transactions.stream().map(t -> new Transaction(t.getAmount(),t.getType())).collect(Collectors.toList());
    }
}
