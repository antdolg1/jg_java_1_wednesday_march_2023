package students.igors_gergeleziu.lesson_4.level_7.super_task_1;

import teacher.lesson_4.homework.level_7_senior.solutions.super_task_1.FizzBuzz;

class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest test = new FizzBuzzTest();
        test.fizzBuzzTest();
        test.notFizzBuzzTest();
        test.fizzTest();
        test.buzzTest();

    }

    void fizzBuzzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        checkResults(fizzBuzz.detect(15).equals("FizzBuzz"), "fizzBuzzTest");
    }

    void notFizzBuzzTest() {
        FizzBuzz notFizzBuzz = new FizzBuzz();
        checkResults(notFizzBuzz.detect(7).equals("7"), "notFizzBuzzTest");
    }

    void fizzTest() {
        FizzBuzz fizz = new FizzBuzz();
        checkResults(fizz.detect(3).equals("Fizz"), "fizzTest");
    }

    void buzzTest() {
        FizzBuzz buzz = new FizzBuzz();
        checkResults(buzz.detect(5).equals("Buzz"), "buzzTest");
    }

    void checkResults(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}
