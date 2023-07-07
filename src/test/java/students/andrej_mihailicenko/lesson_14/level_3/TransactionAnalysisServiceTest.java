package students.andrej_mihailicenko.lesson_14.level_3;

import org.junit.Test;
import org.junit.Before;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TransactionAnalysisServiceTest {

    private TransactionAnalysisService transactionAnalysisService;
    private List<Transaction> transactions;

    @Before
    public void setUp() {
        this.transactionAnalysisService = new TransactionAnalysisService();
        this.transactions = TransactionTestData.getTransactions();
    }

    @Test
    public void findTransactionsByYear2011() {
        Trader brian = new Trader("Brian", "Cambridge");
        Trader raoul = new Trader("Raoul", "Cambridge");

        List<Transaction> expected = new ArrayList<>();
        expected.add(new Transaction(brian, 2011, 300));
        expected.add(new Transaction(raoul, 2011, 400));

        List<Transaction> actual = transactionAnalysisService.findTransactionsByYear(transactions, 2011);
        assertEquals(expected, actual);
    }

    @Test
    public void findTransactionsByYear2012() {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> expected = new ArrayList<>();
        expected.add(new Transaction(raoul, 2012, 1000));
        expected.add(new Transaction(mario, 2012, 710));
        expected.add(new Transaction(mario, 2012, 700));
        expected.add(new Transaction(alan, 2012, 950));

        List<Transaction> actual = transactionAnalysisService.findTransactionsByYear(transactions, 2012);
        assertEquals(expected, actual);
    }

    @Test
    public void sortTransactionsFromMinToMax() {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> expected = new ArrayList<>();
        expected.add(new Transaction(brian, 2011, 300));
        expected.add(new Transaction(raoul, 2011, 400));
        expected.add(new Transaction(mario, 2012, 700));
        expected.add(new Transaction(mario, 2012, 710));
        expected.add(new Transaction(alan, 2012, 950));
        expected.add(new Transaction(raoul, 2012, 1000));


        List<Transaction> actual = transactionAnalysisService.sortTransactionsByValueFromMinToMax(transactions);
        assertEquals(expected, actual);
    }

    @Test
    public void sortTransactionsFromMaxToMin() {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> expected = new ArrayList<>();
        expected.add(new Transaction(raoul, 2012, 1000));
        expected.add(new Transaction(alan, 2012, 950));
        expected.add(new Transaction(mario, 2012, 710));
        expected.add(new Transaction(mario, 2012, 700));
        expected.add(new Transaction(raoul, 2011, 400));
        expected.add(new Transaction(brian, 2011, 300));

        List<Transaction> actual = transactionAnalysisService.sortTransactionsByValueFromMaxToMin(transactions);
        assertEquals(expected, actual);
    }

    @Test
    public void sortTransactionsByYearFromMinToMaX() {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> expected = new ArrayList<>();
        expected.add(new Transaction(brian, 2011, 300));
        expected.add(new Transaction(raoul, 2011, 400));

        List<Transaction> actual = transactionAnalysisService.sortTransactionsByYearAndByValueFromMaxToMin(transactions, 2011);
        assertEquals(expected, actual);
    }
}