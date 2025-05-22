package test;

import main.Transaction;
import main.TransactionType;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class TransactionTest {
@Test
    void given_a_deposit_then_toString_should_return_the_date_and_the_amount_according_to_the_type() {
        Transaction transaction = new Transaction(100, TransactionType.deposit, LocalDate.now());
        assertEquals(transaction.toString(), "22/05/2025 || 100");
    }
}