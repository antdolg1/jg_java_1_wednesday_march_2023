package teacher.lesson_15.lessoncode;

public class RefactoringExample {

    //Extract method

    void printSomething() {
        System.out.println("Printing...");
    }

    void printInfoOutput() {
        printSomething();

        printCommonInfo();
    }

    private static void printCommonInfo() {
        System.out.println("Printing...1");
        System.out.println("Printing---2");
    }

    void printInfoOutput2() {
        printSomething();

        printCommonInfo();

        System.out.println("Printing___3");
    }
}
