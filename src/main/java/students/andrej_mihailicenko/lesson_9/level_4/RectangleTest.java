package students.andrej_mihailicenko.lesson_9.level_4;

class RectangleTest {
    public static void main(String[] args) {
        RectangleTest rectangleTest = new RectangleTest();
        rectangleTest.rectangleAreaWithWidthAndLength();
        rectangleTest.rectangleAreaWithLengthAndDiagonal();
        rectangleTest.rectanglePerimeterWithWidthAndLength();
        rectangleTest.rectanglePerimeterWithLengthAndDiagonal();
    }

    public void rectangleAreaWithWidthAndLength() {
        Rectangle rectangle = new Rectangle("Rectangle", 5, 10);
        double expectedResult = 50.0;
        double realResult = rectangle.calculateArea();
        resultCheck(expectedResult, realResult, "Rectangle area with width and length");
    }

    public void rectangleAreaWithLengthAndDiagonal() {
        Rectangle rectangle = new Rectangle(43, 54.2, "Rectangle");
        double expectedResult = 1418.8;
        double realResult = rectangle.calculateArea();
        System.out.println(realResult);
        resultCheck(expectedResult, realResult, "Rectangle area with length and diagonal");
    }

    public void rectanglePerimeterWithWidthAndLength() {
        Rectangle rectangle = new Rectangle("Rectangle", 5, 10);
        double expectedResult = 30.0;
        double realResult = rectangle.calculatePerimeter();
        resultCheck(expectedResult, realResult, "Rectangle perimeter with width and length");
    }

    public void rectanglePerimeterWithLengthAndDiagonal() {
        Rectangle rectangle = new Rectangle(5, 11.2, "Rectangle");
        double expectedResult = 30.0;
        double realResult = rectangle.calculatePerimeter();
        resultCheck(expectedResult, realResult, "Rectangle perimeter with length and diagonal");
    }

    private void resultCheck(double expectedResult, double realResult, String testName) {
        if (expectedResult == realResult) {
            System.out.println(testName + " Test Passed!");
        } else {
            System.out.println(testName + " Test Failed!");
        }
    }
}
