package students.edmund_zukovskis.lesson_7.level_6.task_10;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class CreditCardTest {
    private CreditCard card;

    @BeforeEach
    public void setUp() {
        card = new CreditCard(123456789, 4511);
    }

    @Test
    public void depositMoneyTest() {
        card.depositMoney(4511, 1000);
        int expectedBalance = 4000;
        int actualBalance = card.getBalance();
        assertEquals(expectedBalance, actualBalance);
    }

    @Test
    public void withdrawMoneyTest() {
        card.withdrawMoney(4511, 2000);
        int expectedBalance = 1000;
        int actualBalance = card.getBalance();
        assertEquals(expectedBalance, actualBalance);
    }

    @Test
    public void withdrawMoneyWithCreditTest() {
        card.setCreditLimit(5000);
        card.withdrawMoney(4511, 4000);
        int expectedBalance = -1000;
        int actualBalance = card.getBalance();
        int expectedCreditDebit = 4000;
        int actualCreditDebit = card.getCreditDebit();
        assertEquals(expectedBalance, actualBalance);
        assertEquals(expectedCreditDebit, actualCreditDebit);
    }

    @Test
    public void checkPinCodeTest() {
        boolean result = card.checkPinCode(4511);
        assertTrue(result);
    }
}
