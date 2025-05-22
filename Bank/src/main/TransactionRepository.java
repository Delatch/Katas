package main;

import java.time.Clock;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static main.TransactionType.deposit;
import static main.TransactionType.withdraw;

public class TransactionRepository {
    List<Transaction> transactions = new ArrayList<>();
    Clock clock = Clock.systemDefaultZone();

    public void addDeposit(int amount) {
        this.transactions.add(new Transaction(amount, deposit, getDate()));
    }

    public void addWithdraw(int amount) {
        this.transactions.add(new Transaction(amount, withdraw,getDate()));
    }

    public int transactionsCount() {
        return this.transactions.size();
    }

    public List<Transaction> getTransactions() {
        return this.transactions.stream().map(t -> new Transaction(t.getAmount(),t.getType(),t.getDate())).collect(Collectors.toList());
    }

    private LocalDate getDate() {
        return LocalDate.ofInstant(clock.instant(), clock.getZone());
    }
}
