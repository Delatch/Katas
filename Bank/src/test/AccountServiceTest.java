package test;

import main.AccountService;

class AccountServiceTest {

    @org.junit.jupiter.api.Test
    void given_a_deposit_of_100_the_balance_should_be_100() {
        AccountService accountService = new AccountService();
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