package students.vladislav_antoniv.lesson_8.level_1_and_level_2;

class FraudDetector {

    boolean isFraud(Transaction t) {
        Trader checkTrader = t.getTrader();
        if (checkTrader.getFullName().equals("Pokemon")) {
            return true;
        } else {
            return false;
        }
    }

}