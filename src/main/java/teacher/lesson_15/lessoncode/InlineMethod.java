package teacher.lesson_15.lessoncode;

public class InlineMethod {

    int age = 16;

    int getDrivingLicenceId() {
        return age >= 18 ? 1111 : 2222;
    }

// This method can be removed, because we inlined it on line 8
//    boolean isAllowedToPassDrivingTest() {
//        return age >= 18;
//    }
}
