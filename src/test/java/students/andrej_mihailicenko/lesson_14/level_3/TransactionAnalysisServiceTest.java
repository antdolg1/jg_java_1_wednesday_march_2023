package students.andrej_mihailicenko.lesson_14.level_3;

import org.junit.Test;
import org.junit.Before;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
    public void testFindTransactionsByYear2011() {

        Trader brian = new Trader("Brian", "Cambridge");
        Trader raoul = new Trader("Raoul", "Cambridge");
        List<Transaction> expected = new ArrayList<>();
        expected.add(new Transaction(brian, 2011, 300));
        expected.add(new Transaction(raoul, 2011, 400));

        List<Transaction> actual = transactionAnalysisService.findTransactionsByYear(transactions, 2011);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindTransactionsByYear2012() {
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
    public void testSortTransactionsFromMinToMax() {
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
    public void testSortTransactionsFromMaxToMin() {
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
    public void testSortTransactionsByYearFromMinToMaX() {
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

    @Test
    public void testSortTransactionsByYearNonUnique() {

        List<Integer> expected = new ArrayList<>();
        expected.add(2011);
        expected.add(2011);
        expected.add(2012);
        expected.add(2012);
        expected.add(2012);
        expected.add(2012);

        List<Transaction> actual = transactionAnalysisService.sortTransactionsNonUniqueYears(transactions);
        assertEquals(expected, actual);
    }

    @Test
    public void testSortTransactionsByYearUnique() {

        List<Integer> expected = new ArrayList<>();
        expected.add(2011);
        expected.add(2012);

        List<Transaction> actual = transactionAnalysisService.sortTransactionsUniqueYears(transactions);
        assertEquals(expected, actual);
    }

    @Test
    public void testSortTradersByName() {

        List<String> expected = new ArrayList<>();
        expected.add("Alan");
        expected.add("Brian");
        expected.add("Mario");
        expected.add("Raoul");

        List<Transaction> actual = transactionAnalysisService.sortTradersByName(transactions);
        assertEquals(expected, actual);
    }

    @Test
    public void testSortTradersByCity() {

        List<String> expected = new ArrayList<>();
        expected.add("Cambridge");
        expected.add("Milan");

        List<Transaction> actual = transactionAnalysisService.sortTradersByCity(transactions);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindTradersByCity() {

        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Trader> expected = new ArrayList<>();
        expected.add(new Trader("Brian", "Cambridge"));
        expected.add(new Trader("Raoul", "Cambridge"));
        expected.add(new Trader("Alan", "Cambridge"));

        List actual = transactionAnalysisService.findTraderByCity(transactions, "Cambridge");
        assertEquals(expected, actual);
    }

    @Test
    public void testIfTraderEmployedInCityCambridge() {

        boolean expected = true;
        boolean actual = transactionAnalysisService.ifTraderEmployedInCity(transactions, "Cambridge");
        assertEquals(expected, actual);
    }

    @Test
    public void testIfTraderEmployedInCityLondon() {

        boolean expected = false;
        boolean actual = transactionAnalysisService.ifTraderEmployedInCity(transactions, "London");
        assertEquals(expected, actual);
    }

    @Test
    public void testFindMaxValue() {

        Optional<Integer> expected = Optional.of(1000);
        Optional<Integer> actual = transactionAnalysisService.findMaxValue(transactions);

        assertEquals(expected, actual);
    }

    @Test
    public void testFindMinValue() {

        Optional<Integer> expected = Optional.of(300);
        Optional<Integer> actual = transactionAnalysisService.findMinValue(transactions);

        assertEquals(expected, actual);
    }

    @Test
    public void testTradersNamesInAlphabeticalOrder() {

        String expected = "Alan,Brian,Mario,Raoul";
        String actual = transactionAnalysisService.tradersNamesInAlphabeticalOrder(transactions);

        assertEquals(expected, actual);
    }

    @Test
    public void testTradersCityInAlphabeticalOrder() {

        String expected = "Cambridge,Milan";
        String actual = transactionAnalysisService.tradersCityInAlphabeticalOrder(transactions);

        assertEquals(expected, actual);
    }
}