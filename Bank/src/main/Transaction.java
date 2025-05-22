package main;

public class Transaction {
    private int amount;

    private TransactionType type;

    public Transaction(int amount, TransactionType type) {
        this.amount = amount;
        this.type = type;
    }

    public int getAmount() {
        return amount;
    }

    public TransactionType getType() {
        return type;
    }
}
