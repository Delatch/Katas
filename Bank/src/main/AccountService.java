package main;

public class AccountService implements AccountServiceI {
    int balance = 0;

    @Override
    public void deposit(int amount) {

    }

    @Override
    public void withdraw(int amount) {

    }

    @Override
    public void printStatement() {
        System.out.println("Balance : " + balance);
    }
}
