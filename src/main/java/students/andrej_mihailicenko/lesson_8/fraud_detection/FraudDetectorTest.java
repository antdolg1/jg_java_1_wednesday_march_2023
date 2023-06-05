package students.andrej_mihailicenko.lesson_8.fraud_detection;

class FraudDetectorTest {
    public static void main(String[] args) {
        FraudDetectorTest fraudDetectorTest = new FraudDetectorTest();
        fraudDetectorTest.isFraudRule1Pokemon();
        fraudDetectorTest.isFraudRule1Name();
        fraudDetectorTest.isFraudRule2Amount();
        fraudDetectorTest.isFraudRule2BiggestAmount();
        fraudDetectorTest.isFraudRule2SmallestAmount();
        fraudDetectorTest.isFraudRule3Sydney();
        fraudDetectorTest.isFraudRule3Riga();
        fraudDetectorTest.isFraudRule4Jamaica();
        fraudDetectorTest.isFraudRule4London();
        fraudDetectorTest.isFraudRule5GermanyAnd1001();
        fraudDetectorTest.isFraudRule5GermanyAnd200();
        fraudDetectorTest.isFraudRule5RigaAnd1001();
        fraudDetectorTest.isFraudRule5RigaAnd200();
    }

    public void isFraudRule1Pokemon() {
        Trader trader = new Trader();
        trader.setFullName("Pokemon");
        Transaction t = new Transaction(trader, 111);
        FraudRule1 fraudRule1 = new FraudRule1("Rule1");
        testCheck("Rule 1 Pokemon " + "Transaction details: " + t.toString(), fraudRule1.isFraud(t));

    }

    public void isFraudRule1Name() {
        Trader trader = new Trader();
        trader.setFullName("Nikita");
        Transaction t = new Transaction(trader, 111);
        FraudRule1 fraudRule1 = new FraudRule1("Rule1");
        testCheck("Rule1 Another Name " + "Transaction details: " + t.toString(), !fraudRule1.isFraud(t));
    }

    public void isFraudRule2Amount() {
        Trader trader = new Trader();
        Transaction t = new Transaction(trader, 1000000);
        FraudRule2 fraudRule2 = new FraudRule2("Rule2");
        testCheck("Rule2 1000000 amount " + "Transaction details: " + t.toString(), fraudRule2.isFraud(t));
    }

    public void isFraudRule2BiggestAmount() {
        Trader trader = new Trader();
        Transaction t = new Transaction(trader, 5000000);
        FraudRule2 fraudRule2 = new FraudRule2("Rule2");
        testCheck("Rule2 5000000 amount " + "Transaction details: " + t.toString(), fraudRule2.isFraud(t));
    }

    public void isFraudRule2SmallestAmount() {
        Trader trader = new Trader();
        Transaction t = new Transaction(trader, 1000);
        FraudRule2 fraudRule2 = new FraudRule2("Rule2");
        testCheck("Rule2 1000 amount " + "Transaction details: " + t.toString(), !fraudRule2.isFraud(t));
    }

    public void isFraudRule3Sydney() {
        Trader trader = new Trader();
        trader.setCity("Sydney");
        Transaction t = new Transaction(trader, 1000);
        FraudRule3 fraudRule3 = new FraudRule3("Rule3");
        testCheck("Rule3 Sydney " + "Transaction details: " + t.toString(), fraudRule3.isFraud(t));
    }

    public void isFraudRule3Riga() {
        Trader trader = new Trader();
        trader.setCity("Riga");
        Transaction t = new Transaction(trader, 1000);
        FraudRule3 fraudRule3 = new FraudRule3("Rule3");
        testCheck("Rule3 Riga " + "Transaction details: " + t.toString(), !fraudRule3.isFraud(t));
    }

    public void isFraudRule4Jamaica() {
        Trader trader = new Trader();
        trader.setCity("Jamaica");
        Transaction t = new Transaction(trader, 1000);
        FraudRule4 fraudRule4 = new FraudRule4("Rule4");
        testCheck("Rule4 Jamaica " + "Transaction details: " + t.toString(), fraudRule4.isFraud(t));
    }

    public void isFraudRule4London() {
        Trader trader = new Trader();
        trader.setCity("London");
        Transaction t = new Transaction(trader, 1000);
        FraudRule4 fraudRule4 = new FraudRule4("Rule4");
        testCheck("Rule4 London " + "Transaction details: " + t.toString(), !fraudRule4.isFraud(t));
    }

    public void isFraudRule5GermanyAnd1001() {
        Trader trader = new Trader();
        trader.setCity("Germany");
        Transaction t = new Transaction(trader, 1001);
        FraudRule5 fraudRule5 = new FraudRule5("Rule5");
        testCheck("Rule5 Germany and 1001 " + "Transaction details: " + t.toString(), fraudRule5.isFraud(t));
    }

    public void isFraudRule5GermanyAnd200() {
        Trader trader = new Trader();
        trader.setCity("Germany");
        Transaction t = new Transaction(trader, 200);
        FraudRule5 fraudRule5 = new FraudRule5("Rule5");
        testCheck("Rule5 Germany and 200 " + "Transaction details: " + t.toString(), !fraudRule5.isFraud(t));
    }

    public void isFraudRule5RigaAnd1001() {
        Trader trader = new Trader();
        trader.setCity("Riga");
        Transaction t = new Transaction(trader, 1001);
        FraudRule5 fraudRule5 = new FraudRule5("Rule5");
        testCheck("Rule5 Riga and 1001 " + "Transaction details: " + t.toString(), !fraudRule5.isFraud(t));
    }

    public void isFraudRule5RigaAnd200() {
        Trader trader = new Trader();
        trader.setCity("Riga");
        Transaction t = new Transaction(trader, 200);
        FraudRule5 fraudRule5 = new FraudRule5("Rule5");
        testCheck("Rule5 Riga and 200 " + "Transaction details: " + t.toString(), !fraudRule5.isFraud(t));
    }

    private void testCheck(String testName, boolean result) {
        if (result) {
            System.out.println(testName + " Test Passed!");
        } else {
            System.out.println(testName + " Test Failed!");
        }
    }
}
