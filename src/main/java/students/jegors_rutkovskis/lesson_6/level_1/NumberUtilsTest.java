package students.jegors_rutkovskis.lesson_6.level_1;

class NumberUtilsTest {
    public static void main(String[] args) {
        NumberUtilsTest test = new NumberUtilsTest();
        test.isEvenTest();
    }
    void isEvenTest() {
        NumberUtils victim = new NumberUtils();
        boolean expected = true;
        boolean actual = victim.isEven(10);

        if (expected == actual) {
            System.out.println("isEven test passed");
        } else {
            System.err.println("isEven test failed");
        }
    }
}
