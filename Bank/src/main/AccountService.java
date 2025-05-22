package main;

public class AccountService {
    private final TransactionRepository transactionRepository;
    int balance = 0;

    public AccountService(TransactionRepository repository) {
        this.transactionRepository = repository;
    }
    public void deposit(int amount) {
        this.transactionRepository.addDeposit(amount);
    }

    public void withdraw(int amount) {
        this.transactionRepository.addWithdraw(amount);
    }

    public void printStatement() {
        System.out.println("Balance : " + balance);
    }
}
