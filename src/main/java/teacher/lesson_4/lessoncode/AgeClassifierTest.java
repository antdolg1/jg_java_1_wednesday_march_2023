package teacher.lesson_4.lessoncode;

public class AgeClassifierTest {
    public static void main(String[] args) {
        AgeClassifierTest test = new AgeClassifierTest();

        test.shouldClassifyBaby();
        test.shouldClassifyTeenager();
        test.shouldClassifyStudent();
    }

    void shouldClassifyBaby() {
        AgeClassifier classifier = new AgeClassifier();

        int age = 5;
        String expectedResult = "Baby";
        String actualResult = classifier.classify(age);

        if (expectedResult.equals(actualResult)) {
            System.out.println("Test shouldClassifyBaby PASSED!");
        } else {
            System.out.println("Test shouldClassifyBaby FAILED!");
            System.out.println("Expected result: " + expectedResult + "\nActual result: " + actualResult);
        }
    }

    void shouldClassifyTeenager() {
        AgeClassifier classifier = new AgeClassifier();

        int age = 14;
        String expectedResult = "Teenager";
        String actualResult = classifier.classify(age);

        if (expectedResult.equals(actualResult)) {
            System.out.println("Test shouldClassifyTeenager PASSED!");
        } else {
            System.out.println("Test shouldClassifyTeenager FAILED!");
            System.out.println("Expected result: " + expectedResult + "\n Actual result: " + actualResult);
        }
    }

    void shouldClassifyStudent() {
        AgeClassifier classifier = new AgeClassifier();

        int age = 25;
        String expectedResult = "Student";
        String actualResult = classifier.classify(age);

        if (expectedResult.equals(actualResult)) {
            System.out.println("Test shouldClassifyStudent PASSED!");
        } else {
            System.out.println("Test shouldClassifyStudent FAILED!");
            System.out.println("Expected result: " + expectedResult + "\n Actual result: " + actualResult);
        }
    }
}
