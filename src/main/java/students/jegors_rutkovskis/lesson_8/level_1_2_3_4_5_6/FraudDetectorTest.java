package students.jegors_rutkovskis.lesson_8.level_1_2_3_4_5_6;

class FraudDetectorTest {
    public static void main(String[] args) {
        FraudDetectorTest test = new FraudDetectorTest();
        test.shouldReturnTrueIfFraudNamePokemon();
        test.shouldReturnFalseIfIsNotFraudNamePokemon();
        test.shouldReturnTrueIfFraudAmount();
        test.shouldReturnFalseIfIsNotFraudAmount();
        test.shouldReturnTrueIfFraudCitySydney();
        test.shouldReturnFalseIfIsNotFraudCity();
        test.shouldReturnTrueIfFraudCityJamaica();
        test.shouldReturnTrueIfFraudCityGermanyAmountThousand();
        test.shouldReturnFalseIfFraudCityGermanyAmountLessThousand();
    }
    void shouldReturnTrueIfFraudNamePokemon() {
        FraudRule rule = new FraudRule1(RuleNamesEnum.POKEMON);
        Trader trader = new Trader("Pokemon", "NY");
        Transaction transaction = new Transaction(trader, 1000);
        FraudDetector victim = new FraudDetector(rule);
        FraudDetectionResult expected = new FraudDetectionResult(true, rule.getRuleName());
        FraudDetectionResult actual = victim.isFraud(transaction);

        testResult(expected, actual, "should Return True If is Fraud name Pokemon");
    }
    void shouldReturnFalseIfIsNotFraudNamePokemon() {
        FraudRule rule = new FraudRule1(RuleNamesEnum.POKEMON);
        Trader trader = new Trader("John", "NY");
        Transaction transaction = new Transaction(trader, 1000);
        FraudDetector victim = new FraudDetector(rule);
        FraudDetectionResult expected = new FraudDetectionResult(false, "");
        FraudDetectionResult actual = victim.isFraud(transaction);

        testResult(expected, actual, "should Return False If Is Not Fraud name Pokemon");
    }

    void shouldReturnTrueIfFraudAmount() {
        FraudRule rule = new FraudRule2(RuleNamesEnum.AMOUNT_GREATER_MILLION);
        Trader trader = new Trader("John", "NY");
        Transaction transaction = new Transaction(trader, 1_000_001);
        FraudDetector victim = new FraudDetector(rule);
        FraudDetectionResult expected = new FraudDetectionResult(true, rule.getRuleName());
        FraudDetectionResult actual = victim.isFraud(transaction);

        testResult(expected, actual, "should Return True If is Fraud amount");
    }
    void shouldReturnFalseIfIsNotFraudAmount() {
        FraudRule rule = new FraudRule2(RuleNamesEnum.AMOUNT_GREATER_MILLION);
        Trader trader = new Trader("John", "NY");
        Transaction transaction = new Transaction(trader, 1_000_000);
        FraudDetector victim = new FraudDetector(rule);
        FraudDetectionResult expected = new FraudDetectionResult(false, "");
        FraudDetectionResult actual = victim.isFraud(transaction);

        testResult(expected, actual, "should Return False If Is Not Fraud amount");
    }
    void shouldReturnTrueIfFraudCitySydney() {
        FraudRule rule = new FraudRule3(RuleNamesEnum.FRAUD_CITY_SYDNEY);
        Trader trader = new Trader("John", "Sydney");
        Transaction transaction = new Transaction(trader, 1_000);
        FraudDetector victim = new FraudDetector(rule);
        FraudDetectionResult expected = new FraudDetectionResult(true, rule.getRuleName());
        FraudDetectionResult actual = victim.isFraud(transaction);

        testResult(expected, actual, "should Return True If is Fraud City Sydney");
    }
    void shouldReturnFalseIfIsNotFraudCity() {
        FraudRule rule = new FraudRule3(RuleNamesEnum.FRAUD_CITY_SYDNEY);
        Trader trader = new Trader("John", "Ny");
        Transaction transaction = new Transaction(trader, 1_000);
        FraudDetector victim = new FraudDetector(rule);
        FraudDetectionResult expected = new FraudDetectionResult(false, "");
        FraudDetectionResult actual = victim.isFraud(transaction);

        testResult(expected, actual, "should Return False If Is Not Fraud City Sydney");
    }
    void shouldReturnTrueIfFraudCityJamaica() {
        FraudRule rule = new FraudRule4(RuleNamesEnum.FRAUD_CITY_JAMAICA);
        Trader trader = new Trader("John", "jamaica");
        Transaction transaction = new Transaction(trader, 1_000);
        FraudDetector victim = new FraudDetector(rule);
        FraudDetectionResult expected = new FraudDetectionResult(true, rule.getRuleName());
        FraudDetectionResult actual = victim.isFraud(transaction);

        testResult(expected, actual, "should Return True If is Fraud City Jamaica");
    }
    void shouldReturnTrueIfFraudCityGermanyAmountThousand() {
        FraudRule rule = new FraudRule5(RuleNamesEnum.FRAUD_CITY_GERMANY_AND_AMOUNT_GREATER_1000);
        Trader trader = new Trader("John", "germany");
        Transaction transaction = new Transaction(trader, 1_001);
        FraudDetector victim = new FraudDetector(rule);
        FraudDetectionResult expected = new FraudDetectionResult(true, rule.getRuleName());
        FraudDetectionResult actual = victim.isFraud(transaction);

        testResult(expected, actual, "should Return True If Fraud City Germany Amount Thousand");
    }
    void shouldReturnFalseIfFraudCityGermanyAmountLessThousand() {
        FraudRule rule = new FraudRule5(RuleNamesEnum.FRAUD_CITY_GERMANY_AND_AMOUNT_GREATER_1000);
        Trader trader = new Trader("John", "germany");
        Transaction transaction = new Transaction(trader, 999);
        FraudDetector victim = new FraudDetector(rule);
        FraudDetectionResult expected = new FraudDetectionResult(false, "");
        FraudDetectionResult actual = victim.isFraud(transaction);

        testResult(expected, actual, "should Return False If Fraud City Germany Amount less than Thousand");
    }

    private void testResult(FraudDetectionResult expected,
                            FraudDetectionResult actual,
                            String testName) {
        if (expected.equals(actual)) {
            System.out.println(testName + " - PASSED");
        } else {
            System.err.println(testName + " - FAILED");
            System.err.println("Actual: " + actual + ", expected: " + expected);
        }
    }
}
