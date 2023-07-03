package teacher.lesson_14.lessoncode;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceExample {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//        numbers.forEach(number -> System.out.println(number));

        numbers.forEach(System.out::println);
    }
}
