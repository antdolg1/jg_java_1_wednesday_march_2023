package students.jegors_rutkovskis.lesson_4.level_5;

class LightColorDetectTest {
    public static void main(String[] args) {
        LightColorDetectTest test = new LightColorDetectTest();
        test.violetTest();
        test.blueTest();
        test.greenTest();
        test.yellowTest();
        test.orangeTest();
        test.redTest();
        test.invisibleLightTest();
    }
    void violetTest(){
        LightColorDetector detector = new LightColorDetector();
        String expected = "Violet";
        String actual = detector.detect(385);
        if (expected.equals(actual)){
            System.out.println("Violet test passed");
        } else {
            System.err.println("Violet test failed");
        }
    }
    void blueTest(){
        LightColorDetector detector = new LightColorDetector();
        String expected = "Blue";
        String actual = detector.detect(494);
        if (expected.equals(actual)){
            System.out.println("Blue test passed");
        } else {
            System.err.println("Blue test failed");
        }
    }
    void greenTest(){
        LightColorDetector detector = new LightColorDetector();
        String expected = "Green";
        String actual = detector.detect(495);
        if (expected.equals(actual)){
            System.out.println("Green test passed");
        } else {
            System.err.println("Green test failed");
        }
    }
    void yellowTest(){
        LightColorDetector detector = new LightColorDetector();
        String expected = "Yellow";
        String actual = detector.detect(580);
        if (expected.equals(actual)){
            System.out.println("Yellow test passed");
        } else {
            System.err.println("Yellow test failed");
        }
    }
    void orangeTest(){
        LightColorDetector detector = new LightColorDetector();
        String expected = "Orange";
        String actual = detector.detect(600);
        if (expected.equals(actual)){
            System.out.println("Orange test passed");
        } else {
            System.err.println("Orange test failed");
        }
    }
    void redTest(){
        LightColorDetector detector = new LightColorDetector();
        String expected = "Red";
        String actual = detector.detect(750);
        if (expected.equals(actual)){
            System.out.println("Red test passed");
        } else {
            System.err.println("Red test failed");
        }
    }
    void invisibleLightTest(){
        LightColorDetector detector = new LightColorDetector();
        String expected = "Invisible Light";
        String actual = detector.detect(999);
        if (expected.equals(actual)){
            System.out.println("Invisible Light test passed");
        } else {
            System.err.println("Invisible Light test failed");
        }
    }
}
