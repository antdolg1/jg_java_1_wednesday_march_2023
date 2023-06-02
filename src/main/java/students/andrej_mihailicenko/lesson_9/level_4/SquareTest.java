package students.andrej_mihailicenko.lesson_9.level_4;

class SquareTest {
    public static void main(String[] args) {
        SquareTest squareTest = new SquareTest();
        squareTest.squareArea();
        squareTest.squarePerimeter();
    }

    static void squareArea(){
        Square square = new Square("Square", 25.8);
        double expectedResult = 665.6;
        double realResult = square.calculateArea();
        resultCheck(expectedResult,realResult,"Square area");
    }

    static void squarePerimeter(){
        Square square = new Square("Square", 25.8);
        double expectedResult = 103.2;
        double realResult = square.calculatePerimeter();
        resultCheck(expectedResult,realResult,"Square perimeter");
    }

    private static void resultCheck(double expectedResult, double realResult, String testName) {
        if (expectedResult == realResult) {
            System.out.println(testName + " Test Passed!");
        } else {
            System.out.println(testName + " Test Failed!");
        }
    }
}
