package students.pavels_serikovs.lesson_4.level_5;

class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest test = new LightColorDetectorTest();
        test.shouldDetectViolet();
        test.shouldDetectBlue();
        test.shouldDetectGreen();
        test.shouldDetectYellow();
        test.shouldDetectOrange();
        test.shouldDetectRed();
    }

    void shouldDetectViolet() {
        LightColorDetector detector = new LightColorDetector();
        int wavelength = 390;
        String expectedResult = "Violet";
        String actualResult = detector.detect(wavelength);
        if (expectedResult.equals(actualResult)) {
            System.out.println("Test shouldDetectViolet PASSED");
        } else {
            System.out.println("Test shouldDetectViolet FAILED");
            System.out.println("Expected result: " + expectedResult + "\nActual result: " + actualResult);
        }
    }

    void shouldDetectBlue() {
        LightColorDetector detector = new LightColorDetector();
        int wavelength = 470;
        String expectedResult = "Blue";
        String actualResult = detector.detect(wavelength);
        if (expectedResult.equals(actualResult)) {
            System.out.println("Test shouldDetectBlue PASSED");
        } else {
            System.out.println("Test shouldDetectBlue FAILED");
            System.out.println("Expected result: " + expectedResult + "\nActual result: " + actualResult);
        }
    }

    void shouldDetectGreen() {
        LightColorDetector detector = new LightColorDetector();
        int wavelength = 550;
        String expectedResult = "Green";
        String actualResult = detector.detect(wavelength);
        if (expectedResult.equals(actualResult)) {
            System.out.println("Test shouldDetectGreen PASSED");
        } else {
            System.out.println("Test shouldDetectGreen FAILED");
            System.out.println("Expected result: " + expectedResult + "\nActual result: " + actualResult);
        }
    }

    void shouldDetectYellow() {
        LightColorDetector detector = new LightColorDetector();
        int wavelength = 580;
        String expectedResult = "Yellow";
        String actualResult = detector.detect(wavelength);
        if (expectedResult.equals(actualResult)) {
            System.out.println("Test shouldDetectYellow PASSED");
        } else {
            System.out.println("Test shouldDetectYellow FAILED");
            System.out.println("Expected result: " + expectedResult + "\nActual result: " + actualResult);
        }
    }

    void shouldDetectOrange() {
        LightColorDetector detector = new LightColorDetector();
        int wavelength = 600;
        String expectedResult = "Orange";
        String actualResult = detector.detect(wavelength);
        if (expectedResult.equals(actualResult)) {
            System.out.println("Test shouldDetectOrange PASSED");
        } else {
            System.out.println("Test shouldDetectOrange FAILED");
            System.out.println("Expected result: " + expectedResult + "\nActual result: " + actualResult);
        }
    }

    void shouldDetectRed() {
        LightColorDetector detector = new LightColorDetector();
        int wavelength = 650;
        String expectedResult = "Red";
        String actualResult = detector.detect(wavelength);
        if (expectedResult.equals(actualResult)) {
            System.out.println("Test shouldDetectRed PASSED");
        } else {
            System.out.println("Test shouldDetectRed FAILED");
            System.out.println("Expected result: " + expectedResult + "\nActual result: " + actualResult);
        }
    }
}
