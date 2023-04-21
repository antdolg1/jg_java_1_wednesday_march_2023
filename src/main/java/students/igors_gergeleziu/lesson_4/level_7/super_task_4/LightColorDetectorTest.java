package students.igors_gergeleziu.lesson_4.level_7.super_task_4;

import teacher.lesson_4.homework.level_7_senior.solutions.super_task_4.LightColorDetector;

class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest test = new LightColorDetectorTest();
        test.violetTest(412);
        test.blueTest(480);
        test.greenTest(525);
        test.yellowTest(576);
        test.orangeTest(602);
        test.redTest(745);
        test.invisibleLightTest(0);

    }

    void violetTest(int waveLenght) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        checkResult(lightColorDetector.detect(waveLenght).equals("Violet"), "violetTest");
    }

    void blueTest(int waveLenght) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        checkResult(lightColorDetector.detect(waveLenght).equals("Blue"), "blueTest");
    }

    void greenTest(int waveLenght) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        checkResult(lightColorDetector.detect(waveLenght).equals("Green"), "greenTest");
    }

    void yellowTest(int waveLenght) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        checkResult(lightColorDetector.detect(waveLenght).equals("Yellow"), "yellowTest");
    }

    void orangeTest(int waveLenght) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        checkResult(lightColorDetector.detect(waveLenght).equals("Orange"), "orangeTest");
    }

    void redTest(int waveLenght) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        checkResult(lightColorDetector.detect(waveLenght).equals("Red"), "redTest");
    }

    void invisibleLightTest(int waveLenght) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        checkResult(lightColorDetector.detect(waveLenght).equals("Invisible Light"), "invisibleLightTest");
    }

    void checkResult(boolean condition, String testName) {
        if (condition == true) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}
