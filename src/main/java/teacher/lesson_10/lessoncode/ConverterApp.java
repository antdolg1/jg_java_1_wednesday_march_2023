package teacher.lesson_10.lessoncode;

public class ConverterApp {
    public static void main(String[] args) {
        Converter converter = new Converter();
        converter.convert(10);
        converter.convert(20.3);
        converter.convert("Hello");
        converter.convert(new int[]{1, 2, 3});
    }
}
