package students.jegors_rutkovskis.lesson_14.level_3_4_5_6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class TransactionAnalysisServiceTest {
    private TransactionAnalysisService analysisService;
    private TransactionTestData testData;
    private List<Transaction> transactions;
    private Trader raoul, mario, alan, brian;
    @BeforeEach
    void setUp() {
        testData = new TransactionTestData();
        transactions = testData.getTransactions();
        analysisService = new TransactionAnalysisService();
        raoul = new Trader("Raoul", "Cambridge");
        mario = new Trader("Mario","Milan");
        alan = new Trader("Alan","Cambridge");
        brian = new Trader("Brian","Cambridge");
    }

    @Test
    void getTransactionsFor2011YearTest() {
        List<Transaction> expected = List.of(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2011, 400)
        );
        List<Transaction> actual = analysisService.getTransactionsFor2011Year(transactions);
        assertEquals(expected, actual);
    }
    @Test
    void getTransactionsFor2012YearTest() {
        List<Transaction> expected = List.of(
                new Transaction(raoul, 2012, 1000),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );
        List<Transaction> actual = analysisService.getTransactionByYear(transactions, 2012);
        assertEquals(expected, actual);
    }
    @Test
    void getTransactionsFor2013YearTest() {
        List<Transaction> expected = List.of(
                new Transaction(raoul, 2013, 400)
        );
        List<Transaction> actual = analysisService.getTransactionByYear(transactions, 2013);
        assertEquals(expected, actual);
    }

    @Test
    void testTransactionsSortedInAscendingOrderByValue() {
        List<Transaction> expected = List.of(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2011, 400),
                new Transaction(raoul, 2013, 400),
                new Transaction(mario, 2012, 700),
                new Transaction(mario, 2012, 710),
                new Transaction(alan,  2012, 950),
                new Transaction(raoul, 2012, 1000)
        );
        List<Transaction> actual = analysisService.getTransactionsSortedInAscendingOrderByValue(transactions);
        assertEquals(expected, actual);
    }
    @Test
    void test2011YearTransactionsSortedInAscendingOrderByValue() {
        List<Transaction> expected = List.of(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2011, 400)
        );
        List<Transaction> actual = analysisService.get2011YearTransactionsSortedInAscendingOrderByValue(transactions);
        assertEquals(expected, actual);
    }
    @Test
    void shouldReturnAllTransactionYears() {
        List<Integer> expected = List.of(2011, 2011, 2012,
                2012, 2012, 2012, 2013);
        List<Integer> actual = analysisService.getAllTransactionYears(transactions);
        assertEquals(7, actual.size());
        assertEquals(expected, actual);
    }
    @Test
    void shouldReturnUniqueTransactionYears() {
        List<Integer> expected = List.of(2011, 2012, 2013);
        List<Integer> actual = analysisService.getUniqueTransactionYears(transactions);
        assertEquals(3, actual.size());
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnUniqueTraderNames() {
        List<String> expected = List.of(
                "Alan", "Brian", "Mario", "Raoul"
        );
        List<String> actual = analysisService.getUniqueTransactionTraderNames(transactions);
        assertEquals(4, actual.size());
        assertEquals(expected, actual);
    }
    @Test
    void shouldReturnUniqueTraderCities() {
        List<String> expected = List.of(
                "Cambridge", "Milan"
        );
        List<String> actual = analysisService.getUniqueTransactionTraderCities(transactions);
        assertEquals(2, actual.size());
        assertEquals(expected, actual);
    }
    @Test
    void shouldReturnUniqueTraderNamesFromCambridgeCity() {
        List<String> expected = List.of(
                "Alan", "Brian", "Raoul"
        );
        List<String> actual = analysisService.getTransactionTraderUniqueNamesFromCambridge(transactions);
        assertEquals(3, actual.size());
        assertEquals(expected, actual);
    }

    @Test
    void testTransactionTraderUniqueNamesFromCityMilan() {
        List<String> expected = List.of("Mario");
        List<String> actual = analysisService
                .getTransactionTraderUniqueNamesFromCity(transactions, "milan");
        assertEquals(1, actual.size());
        assertEquals(expected, actual);
    }
    @Test
    void testTransactionTraderUniqueNamesFromCityCambridge() {
        List<String> expected = List.of(
                "Alan", "Brian", "Raoul"
        );
        List<String> actual = analysisService
                .getTransactionTraderUniqueNamesFromCity(transactions, "cambridge");
        assertEquals(3, actual.size());
        assertEquals(expected, actual);
    }
    @Test
    void testTransactionTraderUniqueNamesFromCityLondon() {
        List<String> expected = List.of();
        List<String> actual = analysisService
                .getTransactionTraderUniqueNamesFromCity(transactions, "london");
        assertEquals(0, actual.size());
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnTrueIfTransactionHasTraderInMilan() {
        boolean actual = analysisService.hasTraderInMilan(transactions);
        assertTrue(actual);
    }
    @Test
    void shouldReturnTrueIfTransactionHasTraderInCambridge() {
        boolean actual = analysisService.hasTraderInCity(transactions, "cambridge");
        assertTrue(actual);
    }
    @Test
    void shouldReturnTrueIfTransactionHasTraderInLondon() {
        boolean actual = analysisService.hasTraderInCity(transactions, "London");
        assertFalse(actual);
    }

    @Test
    void shouldReturnOptionalEmptyIfTransactionListIsEmpty() {
        transactions = List.of();
        Optional<Integer> actual = analysisService
                .getMaxTransactionValue(transactions);
        assertTrue(actual.isEmpty());
    }

    @Test
    void shouldReturnMaxTransactionValue() {
        Optional<Integer> expected = Optional.of(1000);
        Optional<Integer> actual = analysisService
                .getMaxTransactionValue(transactions);
        assertTrue(actual.isPresent());
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnMinTransactionValue() {
        Optional<Integer> expected = Optional.of(300);
        Optional<Integer> actual = analysisService
                .getMinTransactionValue(transactions);
        assertTrue(actual.isPresent());
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnStringWithUniqueSortedTraderNames() {
        String expectedNames = "Alan, Brian, Mario, Raoul";
        String actualNames = analysisService.getSortedUniqueTraderNamesAsString(transactions);
        assertEquals(expectedNames, actualNames);
    }
    @Test
    void shouldReturnStringWithUniqueSortedTraderCities() {
        String expectedNames = "Cambridge, Milan";
        String actualNames = analysisService.getSortedUniqueTraderCitiesAsString(transactions);
        assertEquals(expectedNames, actualNames);
    }
}