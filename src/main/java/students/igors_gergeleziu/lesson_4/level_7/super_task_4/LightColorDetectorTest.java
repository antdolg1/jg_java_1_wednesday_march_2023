package students.igors_gergeleziu.lesson_4.level_7.super_task_4;

import teacher.lesson_4.homework.level_7_senior.solutions.super_task_4.LightColorDetector;

class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest test = new LightColorDetectorTest();
        test.testViolet(412);
        test.testBlue(480);
        test.testGreen(525);
        test.testYellow(576);
        test.testOrange(602);
        test.testRed(745);
        test.testInvisibleLight(0);

    }

    void testViolet(int waveLenght) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        checkResult(lightColorDetector.detect(waveLenght).equals("Violet"), "TestViolet");
    }

    void testBlue(int waveLenght) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        checkResult(lightColorDetector.detect(waveLenght).equals("Blue"), "testBlue");
    }

    void testGreen(int waveLenght) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        checkResult(lightColorDetector.detect(waveLenght).equals("Green"), "testGreen");
    }

    void testYellow(int waveLenght) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        checkResult(lightColorDetector.detect(waveLenght).equals("Yellow"), "testYellow");
    }

    void testOrange(int waveLenght) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        checkResult(lightColorDetector.detect(waveLenght).equals("Orange"), "testOrange");
    }

    void testRed(int waveLenght) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        checkResult(lightColorDetector.detect(waveLenght).equals("Red"), "testRed");
    }

    void testInvisibleLight(int waveLenght) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        checkResult(lightColorDetector.detect(waveLenght).equals("Invisible Light"), "testInvisibleLight");
    }

    void checkResult(boolean condition, String testName) {
        if (condition == true) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}
