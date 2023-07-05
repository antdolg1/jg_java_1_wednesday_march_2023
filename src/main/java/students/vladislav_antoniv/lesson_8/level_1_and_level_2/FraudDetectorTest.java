package students.vladislav_antoniv.lesson_8.level_1_and_level_2;

public class FraudDetectorTest {
    public static void main(String[] args) {
        FraudDetectorTest fraudDetectorTest = new FraudDetectorTest();
        fraudDetectorTest.shouldReturnFraud();
        fraudDetectorTest.shouldReturnNotFraud();
    }

    public void shouldReturnFraud() {
        FraudDetector fraudDetector1 = new FraudDetector();
        Trader trader1 = new Trader();
        trader1.setFullName("Pokemon");
        Transaction transaction1 = new Transaction(trader1, 777);
        boolean expectedResult = true;
        boolean actualResult = fraudDetector1.isFraud(transaction1);
        if (expectedResult == actualResult) {
            System.out.println("Test shouldReturnFraud PASSED");
        } else {
            System.out.println("Test shouldReturnFraud FAILED");
        }
    }

    public void shouldReturnNotFraud() {
        FraudDetector fraudDetector2 = new FraudDetector();
        Trader trader1 = new Trader();
        trader1.setFullName("Pokemooon");
        Transaction transaction1 = new Transaction(trader1, 777);
        boolean expectedResult = false;
        boolean actualResult = fraudDetector2.isFraud(transaction1);
        if (expectedResult == actualResult) {
            System.out.println("Test shouldReturnNotFraud PASSED");
        } else {
            System.out.println("Test shouldReturnNotFraud FAILED");
        }
    }
}
