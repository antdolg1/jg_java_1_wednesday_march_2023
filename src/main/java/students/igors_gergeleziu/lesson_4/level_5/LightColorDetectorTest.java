package students.igors_gergeleziu.lesson_4.level_5;

class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetector test = new LightColorDetector();
        System.out.println("Wave length: " + 400 + " Color: " + test.detect(400));
        System.out.println("Wave length: " + 481 + " Color: " + test.detect(481));
        System.out.println("Wave length: " + 550 + " Color: " + test.detect(550));
        System.out.println("Wave length: " + 570 + " Color: " + test.detect(570));
        System.out.println("Wave length: " + 619 + " Color: " + test.detect(619));
        System.out.println("Wave length: " + 700 + " Color: " + test.detect(700));
        //Invisible Light
        System.out.println("Wave length: " + 250 + " Color: " + test.detect(250));
        System.out.println("Wave length: " + 751 + " Color: " + test.detect(751));
        System.out.println("Wave length: " + 0 + " Color: " + test.detect(0));
    }
}
