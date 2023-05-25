package students.andrej_mihailicenko.lesson_8.level_1;

class FraudDetectorTest {
    public static void main(String[] args) {
        FraudDetectorTest fraudDetectorTest = new FraudDetectorTest();
        fraudDetectorTest.isNameFraud();
        fraudDetectorTest.isPokemonFraud();
    }

    public void isNameFraud(){
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader();
        trader.setCity("Riga");
        trader.setFullName("Andrey");
        Transaction t = new Transaction(trader, 1);
        testCheck("Andrey not fraud ", !fraudDetector.isFraud(t));
    }

    public void isPokemonFraud(){
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader();
        trader.setFullName("Pokemon");
        trader.setCity("London");
        Transaction t = new Transaction(trader, 111);
        testCheck("Pokemon is fraud", fraudDetector.isFraud(t));
        System.out.println(fraudDetector.isFraud(t));
    }

    private void testCheck(String testName, boolean result){
        if (result) {
            System.out.println(testName + "Test Passed!");
        } else {
            System.out.println(testName + "Test Failed!");
        }
    }
}
