package students.jegors_rutkovskis.lesson_8.level_1_2_3_4_5_6;

class FraudDetector {
    private FraudRule[] fraudRules = new FraudRule[5];
    private int index = 0;

    public FraudDetector(FraudRule fraudRules) {
        this.fraudRules[index] = fraudRules;
        this.index++;
    }

    FraudDetectionResult isFraud(Transaction t) {
        for (FraudRule rule : fraudRules) {
            if (rule != null && rule.isFraud(t)) {
                System.out.println(t);
                return new FraudDetectionResult(true, rule.getRuleName());
            }
        }
        return new FraudDetectionResult(false, "");
    }
}
