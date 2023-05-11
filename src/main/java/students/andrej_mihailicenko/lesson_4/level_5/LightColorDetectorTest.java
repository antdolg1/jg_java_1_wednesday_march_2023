package students.andrej_mihailicenko.lesson_4.level_5;

class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        lightColorDetectorTest.waveLengthVioletTest();
        lightColorDetectorTest.waveLengthBlueTest();
        lightColorDetectorTest.waveLengthGreenTest();
        lightColorDetectorTest.waveLengthYellowTest();
        lightColorDetectorTest.waveLengthOrangeTest();
        lightColorDetectorTest.waveLengthRedTest();
        lightColorDetectorTest.waveLengthInvisibleLightTest();
    }

    public void waveLengthVioletTest() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String expectedResult = "Violet";
        String realResult = lightColorDetector.detect(400);
        if (realResult == expectedResult) {
            System.out.println("Violet color test passed");
        } else {
            System.out.println("Violet color test failed");
        }
    }

    public void waveLengthBlueTest() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String expectedResult = "Blue";
        String realResult = lightColorDetector.detect(470);
        if (realResult == expectedResult) {
            System.out.println("Blue color test passed");
        } else {
            System.out.println("Blue color test failed");
        }
    }

    public void waveLengthGreenTest() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String expectedResult = "Green";
        String realResult = lightColorDetector.detect(500);
        if (realResult == expectedResult) {
            System.out.println("Green color test passed");
        } else {
            System.out.println("Green color test failed");
        }
    }

    public void waveLengthYellowTest() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String expectedResult = "Yellow";
        String realResult = lightColorDetector.detect(580);
        if (realResult == expectedResult) {
            System.out.println("Yellow color test passed");
        } else {
            System.out.println("Yellow color test failed");
        }
    }

    public void waveLengthOrangeTest() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String expectedResult = "Orange";
        String realResult = lightColorDetector.detect(600);
        if (realResult == expectedResult) {
            System.out.println("Orange color test passed");
        } else {
            System.out.println("Orange color test failed");
        }
    }

    public void waveLengthRedTest() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String expectedResult = "Red";
        String realResult = lightColorDetector.detect(720);
        if (realResult == expectedResult) {
            System.out.println("Red color test passed");
        } else {
            System.out.println("Red color test failed");
        }
    }

    public void waveLengthInvisibleLightTest() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String expectedResult = "Invisible Light";
        String realResult = lightColorDetector.detect(1000);
        if (realResult == expectedResult) {
            System.out.println("Invisible Light test passed");
        } else {
            System.out.println("Invisible Light test failed");
        }
    }
}
