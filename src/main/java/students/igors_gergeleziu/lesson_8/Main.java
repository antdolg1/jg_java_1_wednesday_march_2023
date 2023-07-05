package students.igors_gergeleziu.lesson_8;

class Main {
    public static void main(String[] args) {
        Main test = new Main();
        test.fraudRule1();


    }

    void fraudRule1() {
        Trader trader = new Trader("Pokemon", "Paris");
        Transaction transaction = new Transaction(trader, 10000001);
        FraudRule1 fraudRule1 = new FraudRule1("FraudRule1");
        FraudRule2 fraudRule2 = new FraudRule2("FraudRule2");
        FraudRule3 fraudRule3 = new FraudRule3("FraudRule3");
        FraudRule[] fraudRules = {fraudRule1, fraudRule2, fraudRule3};
        FraudDetector fraudDetector = new FraudDetector(fraudRules);
        testCheck(transaction.toString(), fraudDetector.isFraud(transaction));

    }

    private void testCheck(String testName, boolean result) {
        if (result) {
            System.out.println(testName + " Test Passed!");
        } else {
            System.out.println(testName + " Test Failed!");
        }
    }
}
