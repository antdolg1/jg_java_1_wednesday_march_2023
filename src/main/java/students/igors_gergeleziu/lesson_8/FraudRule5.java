package students.igors_gergeleziu.lesson_8;

class FraudRule5 extends FraudRule {
    public FraudRule5(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        if (restrictedCitiesOfGermany(t) && t.getAmount() > 1000) return true;
        else return false;
    }

    boolean restrictedCitiesOfGermany(Transaction t) {
        boolean restrictedStatus = false;
        String[] citiesOfGermany = {"Berlin", "Hamburg", "Munich", "Cologne", "Frankfurt am Main", "Stuttgart", "Düsseldorf" +
                "Leipzig", "Dortmund", "Essen", "Bremen", "Dresden", "Hanover", "Nuremberg", "Duisburg", "Bochum"};
        for (String city : citiesOfGermany) {
            if (t.getTrader().getCity().equals(city)) {
                restrictedStatus = true;
            }
        }
        return restrictedStatus;
    }
}
