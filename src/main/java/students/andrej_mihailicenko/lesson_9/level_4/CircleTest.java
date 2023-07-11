package students.andrej_mihailicenko.lesson_9.level_4;

class CircleTest {
    public static void main(String[] args) {
        CircleTest circleTest = new CircleTest();
        circleTest.circlePerimeter();
        circleTest.circleArea();
    }

    static void circlePerimeter() {
        Circle circle = new Circle("Circle", 20);
        double expectedResult = 125.7;
        double realResult = circle.calculatePerimeter();
        resultCheck(expectedResult, realResult, "Circle perimeter");
    }

    static void circleArea() {
        Circle circle = new Circle("Circle", 20);
        double expectedResult = 1256.6;
        double realResult = circle.calculateArea();
        resultCheck(expectedResult, realResult, "Circle area");
    }

    private static void resultCheck(double expectedResult, double realResult, String testName) {
        if (expectedResult == realResult) {
            System.out.println(testName + " Test Passed!");
        } else {
            System.out.println(testName + " Test Failed!");
        }
    }
}
