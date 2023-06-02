package students.andrej_mihailicenko.lesson_9.level_4;

class TriangleTest {
    public static void main(String[] args) {
        TriangleTest triangleTest = new TriangleTest();
        triangleTest.triangleArea();
        triangleTest.trianglePerimeter();
    }

    public void triangleArea() {
        Triangle triangle = new Triangle("Triangle", 3);
        double expectedResult = 3.9;
        double realResult = triangle.calculateArea();
        resultCheck(expectedResult, realResult, "Triangle area");
    }

    public void trianglePerimeter() {
        Triangle triangle = new Triangle("Triangle", 8);
        double expectedResult = 24.0;
        double realResult = triangle.calculatePerimeter();
        resultCheck(expectedResult, realResult, "Triangle perimeter");
    }

    private void resultCheck(double expectedResult, double realResult, String testName) {
        if (expectedResult == realResult) {
            System.out.println(testName + " Test Passed!");
        } else {
            System.out.println(testName + " Test Failed!");
        }
    }
}

