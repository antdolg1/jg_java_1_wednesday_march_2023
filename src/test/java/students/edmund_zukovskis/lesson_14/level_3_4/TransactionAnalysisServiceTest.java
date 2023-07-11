package students.edmund_zukovskis.lesson_14.level_3_4;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.List;

class TransactionAnalysisServiceTest {

    @Test
    public void testFindTransactionsInYear() {
        TransactionTestData testData = new TransactionTestData();
        List<Transaction> transactions = testData.getTransactions();

        TransactionAnalysisService analysisService = new TransactionAnalysisService();
        List<Transaction> transactionsIn2011 = analysisService.findTransactionsInYear(transactions, 2011);

        Assert.assertEquals(2, transactionsIn2011.size());
        Assert.assertTrue(transactionsIn2011.contains(transactions.get(0)));
        Assert.assertTrue(transactionsIn2011.contains(transactions.get(2)));
    }

    @Test
    public void testSortTransactionsByValue() {
        TransactionTestData testData = new TransactionTestData();
        List<Transaction> transactions = testData.getTransactions();

        TransactionAnalysisService analysisService = new TransactionAnalysisService();
        List<Transaction> sortedTransactions = analysisService.sortTransactionsByValue(transactions);

        Assert.assertEquals(300, sortedTransactions.get(0).getValue());
        Assert.assertEquals(400, sortedTransactions.get(1).getValue());
        Assert.assertEquals(700, sortedTransactions.get(2).getValue());
        Assert.assertEquals(710, sortedTransactions.get(3).getValue());
        Assert.assertEquals(950, sortedTransactions.get(4).getValue());
        Assert.assertEquals(1000, sortedTransactions.get(5).getValue());
    }

    @Test
    public void testSortTransactionsByValueDescending() {
        TransactionTestData testData = new TransactionTestData();
        List<Transaction> transactions = testData.getTransactions();

        TransactionAnalysisService analysisService = new TransactionAnalysisService();
        List<Transaction> sortedTransactions = analysisService.sortTransactionsByValueDescending(transactions);

        Assert.assertEquals(1000, sortedTransactions.get(0).getValue());
        Assert.assertEquals(950, sortedTransactions.get(1).getValue());
        Assert.assertEquals(710, sortedTransactions.get(2).getValue());
        Assert.assertEquals(700, sortedTransactions.get(3).getValue());
        Assert.assertEquals(400, sortedTransactions.get(4).getValue());
        Assert.assertEquals(300, sortedTransactions.get(5).getValue());
    }

    @Test
    public void testFindAndSortTransactionsInYear() {
        TransactionTestData testData = new TransactionTestData();
        List<Transaction> transactions = testData.getTransactions();

        int year = 2011;

        TransactionAnalysisService analysisService = new TransactionAnalysisService();
        List<Transaction> filteredAndSortedTransactions = analysisService.findAndSortTransactionsInYear(transactions, year);

        Assert.assertEquals(2, filteredAndSortedTransactions.size());
        Assert.assertEquals(300, filteredAndSortedTransactions.get(0).getValue());
        Assert.assertEquals(400, filteredAndSortedTransactions.get(1).getValue());
    }

    @Test
    public void testFindDistinctYears() {
        TransactionTestData testData = new TransactionTestData();
        List<Transaction> transactions = testData.getTransactions();

        TransactionAnalysisService analysisService = new TransactionAnalysisService();
        List<Integer> distinctYears = analysisService.findDistinctYears(transactions);

        Assert.assertEquals(2, distinctYears.size());
        Assert.assertTrue(distinctYears.contains(2011));
        Assert.assertTrue(distinctYears.contains(2012));
    }

    @Test
    public void testFindUniqueYears() {
        TransactionTestData testData = new TransactionTestData();
        List<Transaction> transactions = testData.getTransactions();

        TransactionAnalysisService analysisService = new TransactionAnalysisService();
        List<Integer> uniqueYears = analysisService.findUniqueYears(transactions);

        Assert.assertEquals(2, uniqueYears.size());
        Assert.assertTrue(uniqueYears.contains(2011));
        Assert.assertTrue(uniqueYears.contains(2012));
    }

    @Test
    public void testFindUniqueTraderNames() {
        TransactionTestData testData = new TransactionTestData();
        List<Transaction> transactions = testData.getTransactions();

        TransactionAnalysisService analysisService = new TransactionAnalysisService();
        List<String> uniqueTraderNames = analysisService.findUniqueTraderNames(transactions);

        Assert.assertEquals(4, uniqueTraderNames.size());
        Assert.assertTrue(uniqueTraderNames.contains("Raoul"));
        Assert.assertTrue(uniqueTraderNames.contains("Mario"));
        Assert.assertTrue(uniqueTraderNames.contains("Alan"));
        Assert.assertTrue(uniqueTraderNames.contains("Brian"));
    }

    @Test
    public void testFindUniqueCities() {
        TransactionTestData testData = new TransactionTestData();
        List<Transaction> transactions = testData.getTransactions();

        TransactionAnalysisService analysisService = new TransactionAnalysisService();
        List<String> uniqueCities = analysisService.findUniqueCities(transactions);

        Assert.assertEquals(2, uniqueCities.size());
        Assert.assertTrue(uniqueCities.contains("Cambridge"));
        Assert.assertTrue(uniqueCities.contains("Milan"));
    }

    @Test
    public void testFindTraderNamesFromCity() {
        TransactionTestData testData = new TransactionTestData();
        List<Transaction> transactions = testData.getTransactions();

        TransactionAnalysisService analysisService = new TransactionAnalysisService();
        List<String> traderNames = analysisService.findTraderNamesFromCity(transactions, "Cambridge");

        Assert.assertEquals(3, traderNames.size());
        Assert.assertTrue(traderNames.contains("Raoul"));
        Assert.assertTrue(traderNames.contains("Alan"));
        Assert.assertTrue(traderNames.contains("Brian"));
    }
}