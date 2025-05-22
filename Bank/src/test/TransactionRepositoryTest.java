package test;

import main.TransactionRepository;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TransactionRepositoryTest {
    @Test
    void given_an_empty_repo_when_add_deposit_then_transactions_count_should_be_one() {
        TransactionRepository transactionRepository = new TransactionRepository();
        transactionRepository.addDeposit(100);
        assertEquals(1,transactionRepository.getTransactions().size());
    }

    @Test
    void given_an_empty_repo_when_add_withdraw_then_transactions_count_should_be_one() {
        TransactionRepository transactionRepository = new TransactionRepository();
        transactionRepository.addWithdraw(100);
        assertEquals(1,transactionRepository.getTransactions().size());
    }

    @Test
    void given_an_empty_repo_when_add_deposit_and_withdraw_then_transactions_count_should_be_two() {
        TransactionRepository transactionRepository = new TransactionRepository();
        transactionRepository.addDeposit(100);
        transactionRepository.addWithdraw(100);
        assertEquals(2,transactionRepository.getTransactions().size());
    }
}