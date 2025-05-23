package main;

public class AccountService {
    private final TransactionRepository transactionRepository;
    private final StatementPrinter printer;
    int balance = 0;

    public AccountService(TransactionRepository repository,StatementPrinter printer) {
        this.transactionRepository = repository;
        this.printer = printer;
    }
    public void deposit(int amount) {
        this.transactionRepository.addDeposit(amount);
    }

    public void withdraw(int amount) {
        this.transactionRepository.addWithdraw(amount);
    }

    public void printStatement() {
        printer.printStatement(transactionRepository.getTransactions());
    }
}
