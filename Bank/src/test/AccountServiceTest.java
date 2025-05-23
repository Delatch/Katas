package test;

import main.*;
import org.junit.jupiter.api.BeforeEach;

import java.time.LocalDate;

import static org.mockito.Mockito.*;

class AccountServiceTest {
    Calendar calendar;
    TransactionRepository transactionRepository;
    AccountService accountService;
    StatementPrinter printer;
    Output output;

    @BeforeEach
    void setUp() {
        calendar = mock(Calendar.class);
        output = mock(Output.class);
        printer = new StatementPrinter(output);
        transactionRepository = new TransactionRepository(calendar);
        accountService = new AccountService(transactionRepository,printer);
    }

    @org.junit.jupiter.api.Test
    void printStatement() {
        when(calendar.getDate()).thenReturn(
                LocalDate.of(2012,1,10),
                LocalDate.of(2012,1,13),
                LocalDate.of(2012,1,14));
        accountService.deposit(1000);
        accountService.deposit(2000);
        accountService.withdraw(500);

        accountService.printStatement();
        verify(output).print("Date | Amount | Balance\n" +
                "14/01/2012 | -500 | 2500\n" +
                "13/01/2012 | 2000 | 3000\n" +
                "10/01/2012 | 1000 | 1000");
        }
}