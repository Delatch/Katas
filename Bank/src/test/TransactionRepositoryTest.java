package test;

import main.Calendar;
import main.TransactionRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class TransactionRepositoryTest {
    Calendar calendar;
    TransactionRepository transactionRepository;

    @BeforeEach
    void setUp() {
        calendar = mock(Calendar.class);
        transactionRepository = new TransactionRepository(calendar);
    }

    @Test
    void given_an_empty_repo_when_add_deposit_then_transactions_count_should_be_one() {
        transactionRepository.addDeposit(100);
        assertEquals(1,transactionRepository.getTransactions().size());
    }

    @Test
    void given_an_empty_repo_when_add_withdraw_then_transactions_count_should_be_one() {
        transactionRepository.addWithdraw(100);
        assertEquals(1,transactionRepository.getTransactions().size());
    }

    @Test
    void given_an_empty_repo_when_add_deposit_and_withdraw_then_transactions_count_should_be_two() {
        when(calendar.getDate()).thenReturn(LocalDate.of(2015,3,25));

        transactionRepository.addDeposit(100);
        transactionRepository.addWithdraw(100);

        System.out.println(transactionRepository.getTransactions().get(0).toString());
        assertEquals(2,transactionRepository.getTransactions().size());
        assertEquals(LocalDate.of(2015,3,25), transactionRepository.getTransactions().get(0).getDate());
    }
}