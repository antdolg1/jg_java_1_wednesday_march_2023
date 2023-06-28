package teacher.lesson_14.lessoncode.stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiDemoApp {

    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("orange", "apple", "", "banana", "watermelon", "plum", "pear", "");

        long emptyStringCount = stringList.stream()
                .filter(String::isEmpty)
                .count();

        System.out.println("Empty string in the list count: " + emptyStringCount);

        long stringWithMoreThanFiveChars = stringList.stream()
                .filter(s -> s.length() > 5)
                .count();

        System.out.println("Strings with more than 5 characters count: " + stringWithMoreThanFiveChars);

        long startsWithP = stringList.stream()
                .filter(s -> s.startsWith("p"))
                .count();

        System.out.println("Strings that starts with letter p count: " + startsWithP);

        String stringListUppercase = stringList.stream()
                .map(s -> s.toUpperCase())
                .collect(Collectors.joining(", "));

        System.out.println(stringListUppercase);

        List<String> listWithRemovedEmptyStrings = stringList.stream()
                .filter(s -> !s.isEmpty())
                .toList(); //until java 17 we needed to write it .collect(Collectors.toList())

        System.out.println();
        System.out.println("Original list:");
        System.out.println(stringList);
        System.out.println("List with removed empty strings:");
        System.out.println(listWithRemovedEmptyStrings);
    }

}
