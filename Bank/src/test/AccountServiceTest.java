package test;

import main.AccountService;
import main.TransactionRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AccountServiceTest {
    TransactionRepository transactionRepository;
    AccountService accountService;

    @BeforeEach
    void setUp() {
        transactionRepository = new TransactionRepository();
        accountService = new AccountService(transactionRepository);
    }

    @Test
    void given_a_deposit_of_100_the_balance_should_be_100() {
        accountService.deposit(100);
        accountService.printStatement();
    }

    @org.junit.jupiter.api.Test
    void withdraw() {
    }

    @org.junit.jupiter.api.Test
    void printStatement() {
    }
}