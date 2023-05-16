package students.edmund_zukovskis.lesson_4.level_5;

class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        lightColorDetectorTest.violetTest();
        lightColorDetectorTest.blueTest();
        lightColorDetectorTest.greenTest();
        lightColorDetectorTest.yellowTest();
        lightColorDetectorTest.orangeTest();
        lightColorDetectorTest.redTest();
        lightColorDetectorTest.invisibleLightTest();
    }
    void violetTest() {
        LightColorDetector detector = new LightColorDetector();
        String expectedColor = "Violet";
        String actualColor = detector.detect(400);
        if (expectedColor.equals(actualColor)) {
            System.out.println("Violet test = OK");
        } else {
            System.out.println("Violet test = FAIL");
        }
    }
    void blueTest() {
        LightColorDetector detector = new LightColorDetector();
        String expectedColor = "Blue";
        String actualColor = detector.detect(461);
        if (expectedColor.equals(actualColor)) {
            System.out.println("Blue test = OK");
        } else {
            System.out.println("Blue test = FAIL");
        }
    }
    void greenTest() {
        LightColorDetector detector = new LightColorDetector();
        String expectedColor = "Green";
        String actualColor = detector.detect(499);
        if (expectedColor.equals(actualColor)) {
            System.out.println("Green test = OK");
        } else {
            System.out.println("Green test = FAIL");
        }
    }
    void yellowTest() {
        LightColorDetector detector = new LightColorDetector();
        String expectedColor = "Yellow";
        String actualColor = detector.detect(575);
        if (expectedColor.equals(actualColor)) {
            System.out.println("Yellow test = OK");
        } else {
            System.out.println("Yellow test = FAIL");
        }
    }
    void orangeTest() {
        LightColorDetector detector = new LightColorDetector();
        String expectedColor = "Orange";
        String actualColor = detector.detect(599);
        if (expectedColor.equals(actualColor)) {
            System.out.println("Orange test = OK");
        } else {
            System.out.println("Orange test = FAIL");
        }
    }
    void redTest() {
        LightColorDetector detector = new LightColorDetector();
        String expectedColor = "Red";
        String actualColor = detector.detect(625);
        if (expectedColor.equals(actualColor)) {
            System.out.println("Red test = OK");
        } else {
            System.out.println("Red test = FAIL");
        }
    }
    void invisibleLightTest() {
        LightColorDetector detector = new LightColorDetector();
        String expectedColor = "Invisible Light";
        String actualColor = detector.detect(999);
        if (expectedColor.equals(actualColor)) {
            System.out.println("Invisible Light test = OK");
        } else {
            System.out.println("Invisible Light test = FAIL");
        }
    }
}
