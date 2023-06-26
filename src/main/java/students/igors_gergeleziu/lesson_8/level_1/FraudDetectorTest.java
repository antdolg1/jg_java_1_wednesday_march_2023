package students.igors_gergeleziu.lesson_8.level_1;

class FraudDetectorTest {
    public static void main(String[] args) {
        FraudDetectorTest test = new FraudDetectorTest();
        System.out.println("Task 7 and 8");
        test.shouldAllowAccessToTransactionsForUserTest();
        test.shouldRestrictAccessToTransactionsForPokemonUserTest();
        System.out.println("Task 9 and 10");
        test.shouldProcessTransactionTest();
        test.shouldRestrictTransactionTest();
        System.out.println("Task 11 and 12");
        test.shouldRestrictAccessToTransactionsForUsersFromSidneyTest();
        System.out.println("Task 13 and 14");
        test.shouldRestrictAccessToTransactionsFromJamaicaTest1();
        test.shouldRestrictAccessToTransactionsFromJamaicaTest2();
        System.out.println("Task 15 and 16");
        test.shouldAllowAccessToTransactionFromGermanyTest();
        test.shouldRestrictAccessToTransactionsFromGermanyTest();

    }

    void shouldAllowAccessToTransactionsForUserTest() {
        Trader trader = new Trader("John", "New York");
        Transaction transaction = new Transaction(trader, 20);
        FraudRule1 fraudRule1 = new FraudRule1("FraudRule1");
        checkResult(!fraudRule1.isFraud(transaction), "shouldAllowAccessToTransactionsForUserTest");

    }

    void shouldRestrictAccessToTransactionsForPokemonUserTest() {
        Trader trader = new Trader("Pokemon", "Paris");
        Transaction transaction = new Transaction(trader, 100);
        FraudRule1 fraudRule1 = new FraudRule1("FraudRule1");
        checkResult(fraudRule1.isFraud(transaction), "shouldRestrictAccessToTransactionsForPokemonUserTest");
    }

    void shouldRestrictAccessToTransactionsForUsersFromSidneyTest() {
        Trader trader = new Trader("Andrew", "Sidney");
        Transaction transaction = new Transaction(trader, 100);
        FraudRule3 fraudRule3 = new FraudRule3("FraudRule3");
        checkResult(fraudRule3.isFraud(transaction), "shouldRestrictAccessToTransactionsForUsersFromSidneyTest");
    }

    void shouldRestrictAccessToTransactionsFromJamaicaTest1() {
        Trader trader = new Trader("Jamal", "Kingston");
        Transaction transaction = new Transaction(trader, 100);
        FraudRule4 fraudRule4 = new FraudRule4("FraudRule4");
        checkResult(fraudRule4.isFraud(transaction), "shouldRestrictAccessToTransactionsFromJamaicaTest1");
    }

    void shouldRestrictAccessToTransactionsFromJamaicaTest2() {
        Trader trader = new Trader("Bob", "Negril");
        Transaction transaction = new Transaction(trader, 100);
        FraudRule4 fraudRule4 = new FraudRule4("FraudRule4");
        checkResult(fraudRule4.isFraud(transaction), "shouldRestrictAccessToTransactionsFromJamaicaTest2");
    }

    void shouldAllowAccessToTransactionFromGermanyTest() {
        Trader trader = new Trader("Erik", "Dortmund");
        Transaction transaction = new Transaction(trader, 1000);
        FraudRule5 fraudRule5 = new FraudRule5("FraudRule5");
        checkResult(!fraudRule5.isFraud(transaction), "shouldAllowAccessToTransactionFromGermanyTest");
    }

    void shouldRestrictAccessToTransactionsFromGermanyTest() {
        Trader trader = new Trader("Dan", "Dortmund");
        Transaction transaction = new Transaction(trader, 1500);
        FraudRule5 fraudRule5 = new FraudRule5("FraudRule5");
        checkResult(fraudRule5.isFraud(transaction), "shouldRestrictAccessToTransactionsFromGermanyTest");
    }

    void shouldProcessTransactionTest() {
        Trader trader = new Trader("James", "Barcelona");
        Transaction transaction = new Transaction(trader, 9000);
        FraudRule2 fraudRule2 = new FraudRule2("FraudRule2");
        checkResult(!fraudRule2.isFraud(transaction), "shouldProcessTransactionTest");
    }

    void shouldRestrictTransactionTest() {
        Trader trader = new Trader("Dave", "Washington");
        Transaction transaction = new Transaction(trader, 1000001);
        FraudRule2 fraudRule2 = new FraudRule2("FraudRule2");
        checkResult(fraudRule2.isFraud(transaction), "shouldRestrictTransactionTest");
    }

    void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}
