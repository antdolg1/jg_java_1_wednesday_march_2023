package teacher.lesson_15.lessoncode;

import java.util.Arrays;
import java.util.List;

public class SubstituteAlgorithm {

    //Old algorithm
//    String findPerson(String[] people) {
//        for (int i = 0; i < people.length; i++) {
//            if ("Don".equals(people[i])) {
//                return "Don";
//            }
//            if ("John".equals(people[i])) {
//                return "John";
//            }
//            if ("Sarah".equals(people[i])) {
//                return "Don";
//            }
//        }
//        return "";
//    }

    //updated version
    String findPerson(String[] people) {
        List<String> personList = Arrays.asList("Don", "John", "Sarah");
        for (int i = 0; i < people.length; i++) {
            if (personList.contains(people[i])) {
                return people[i];
            }
        }
        return "";
    }

}
