package students.jegors_rutkovskis.lesson_8.level_1_2_3_4_5_6;

class FraudDetectorDemo {
    public static void main(String[] args) {
        FraudRule rule = new FraudRule1(RuleNamesEnum.POKEMON);
        Trader trader = new Trader("Pokemon", "NY");
        Transaction transaction = new Transaction(trader, 1000);
        FraudDetector victim = new FraudDetector(rule);
        FraudDetectionResult actual = victim.isFraud(transaction);

        System.out.println(actual);
    }
}
