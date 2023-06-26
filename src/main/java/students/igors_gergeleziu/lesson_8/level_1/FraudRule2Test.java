package students.igors_gergeleziu.lesson_8.level_1;

class FraudRule2Test {
    public static void main(String[] args) {
        FraudRule2Test test = new FraudRule2Test();
        test.shouldProcessTransactionTest();
        test.shouldRestrictTransactionTest();

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
