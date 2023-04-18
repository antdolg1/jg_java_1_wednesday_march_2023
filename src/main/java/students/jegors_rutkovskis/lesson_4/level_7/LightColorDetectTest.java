package students.jegors_rutkovskis.lesson_4.level_7;

class LightColorDetectTest {
    public static void main(String[] args) {
        LightColorDetectTest test = new LightColorDetectTest();
        test.violetTest(380);
        test.blueTest(494);
        test.greenTest(500);
        test.yellowTest(570);
        test.orangeTest(599);
        test.redTest(630);
        test.invisibleLightTest(999);
    }
    private void result(String testName, String expected,
                        String actual){
        if (expected.equals(actual)){
            System.out.println(testName + " TEST PASSED!");
        } else {
            System.err.println(testName + " TEST FAILED!");
        }
    }
    void violetTest(int waveLength){
        LightColorDetector detector = new LightColorDetector();
        String actual = detector.detect(waveLength);

        result("Violet", "Violet", actual);
    }
    void blueTest(int waveLength){
        LightColorDetector detector = new LightColorDetector();
        String actual = detector.detect(waveLength);

        result("Blue", "Blue", actual);
    }
    void greenTest(int waveLength){
        LightColorDetector detector = new LightColorDetector();
        String actual = detector.detect(waveLength);

        result("Green", "Green", actual);
    }
    void yellowTest(int waveLength){
        LightColorDetector detector = new LightColorDetector();
        String actual = detector.detect(waveLength);

        result("Yellow", "Yellow", actual);
    }
    void orangeTest(int waveLength){
        LightColorDetector detector = new LightColorDetector();
        String actual = detector.detect(waveLength);

        result("Orange", "Orange", actual);
    }
    void redTest(int waveLength){
        LightColorDetector detector = new LightColorDetector();
        String actual = detector.detect(waveLength);

        result("Red", "Red", actual);
    }
    void invisibleLightTest(int waveLength){
        LightColorDetector detector = new LightColorDetector();
        String actual = detector.detect(waveLength);

        result("Invisible Light", "Invisible Light", actual);
    }
}
