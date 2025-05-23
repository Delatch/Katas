package main;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import static com.google.common.collect.Lists.reverse;

public class StatementPrinter {
    private final Output output;

    public StatementPrinter(Output output) {
        this.output = output;
    }

    public void printStatement(List<Transaction> transactions) {
        output.print("Date | Amount | Balance\n" +
        formattedStatements(transactions));
    }

    private String formattedStatements(List<Transaction> transactions) {
        AtomicInteger i = new AtomicInteger(0);
        List<String> statements = new ArrayList<>();

        transactions.forEach(transaction -> {
            statements.add(transaction.toString() + " | " + String.format("%02d", i.addAndGet(transaction.getAmount())));
        });
        return String.join("\n",reverse(statements));
    }
}
