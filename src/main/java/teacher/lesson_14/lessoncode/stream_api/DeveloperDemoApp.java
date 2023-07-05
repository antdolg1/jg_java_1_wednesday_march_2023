package teacher.lesson_14.lessoncode.stream_api;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class DeveloperDemoApp {

    public static void main(String[] args) {

        List<Developer> developers = getDeveloperList();

        Developer developerOld = new Developer();
        developerOld.setName("John");
        developerOld.setAge(23);
        developerOld.setLevel(Level.SENIOR);

        Developer developerNew = Developer.builder()
                .age(12)
                .name("Maria")
                .build();

        Developer developerNew1 = Developer.builder()
                .age(12)
                .build();

        Developer developerNew2 = Developer.builder()
                .age(12)
                .name("Susan")
                .level(Level.SENIOR)
                .build();

        Developer developerNew3 = Developer.builder()
                .level(Level.JUNIOR)
                .build();

        System.out.println("JUNIOR developers:");
        List<Developer> juniorDevelopers = developers.stream()
                .filter(developer -> Level.JUNIOR == developer.getLevel())
                .toList();
        juniorDevelopers.forEach(System.out::println);
        System.out.println();


        //sort list by age
        System.out.println("Developer list sorted by age ascending");
        List<Developer> developersSortedAsc = developers.stream()
                .sorted(Comparator.comparing(Developer::getAge))
                .toList();
        developersSortedAsc.forEach(System.out::println);
        System.out.println();

        //all match
        boolean allMatch = developers.stream()
                .allMatch(developer -> developer.getAge() > 14);
        System.out.println("All developers are over 14 years: " + allMatch);
        System.out.println();

        //any match
        boolean anyMatch = developers.stream()
                .anyMatch(developer -> developer.getAge() > 59);
        System.out.println("At least one developer is over 59 years: " + anyMatch);
        System.out.println();


        //none match
        boolean noneMatch = developers.stream()
                .noneMatch(developer -> Level.ARCHITECT == developer.getLevel());
        System.out.println("There is no ARCHITECTs in the team: " + noneMatch);
        System.out.println();

        //find oldest developer
        System.out.println("Oldest developer:");
        developers.stream()
                .max(Comparator.comparing(Developer::getAge))
                .ifPresent(System.out::println);
        System.out.println();

        //find youngest developer
        System.out.println("Youngest developer:");
        developers.stream()
                .min(Comparator.comparing(Developer::getAge))
                .ifPresent(System.out::println);
        System.out.println();

        //find youngest middle developer
        Optional<String> youngestMiddleDeveloper = developers.stream()
                .filter(developer -> Level.MIDDLE == developer.getLevel())
                .min(Comparator.comparing(Developer::getAge))
                .map(Developer::getName);
        youngestMiddleDeveloper.ifPresent(System.out::println);
        System.out.println();

        //group by level
        Map<Level, List<Developer>> developersMap = developers.stream()
                .collect(Collectors.groupingBy(Developer::getLevel));

        developersMap.forEach((level, developers1) -> {
            System.out.println(level);
            developers1.forEach(System.out::println);
            System.out.println();
        });
    }

    private static List<Developer> getDeveloperList() {
        return List.of(
                new Developer("Janis", 30, Level.SENIOR),
                new Developer("Artis", 34, Level.SENIOR),
                new Developer("Jurijs", 23, Level.JUNIOR),
                new Developer("Anna", 18, Level.JUNIOR),
                new Developer("Liene", 60, Level.JUNIOR),
                new Developer("Arturs", 56, Level.MIDDLE),
                new Developer("Signe", 20, Level.MIDDLE),
                new Developer("Zigurds", 37, Level.ARCHITECT),
                new Developer("Maija", 31, Level.JUNIOR)
        );
    }

}
