package students.igors_gergeleziu.lesson_8.level_1;

class FraudRule1Test {
    public static void main(String[] args) {
        FraudRule1Test test = new FraudRule1Test();
        test.shouldAllowAccessToTransactionsForUserTest();
        test.shouldRestrictAccessToTransactionsForPokemonUserTest();
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
    void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}
