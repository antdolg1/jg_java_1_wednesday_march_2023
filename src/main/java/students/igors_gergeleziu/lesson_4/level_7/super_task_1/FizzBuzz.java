package students.igors_gergeleziu.lesson_4.level_7.super_task_1;

class FizzBuzz {
    String detect(int number) {
        if (isDividedBy3(number) && isDividedBy3(number)) {
            return "FizzBuzz";
        } else if (isDividedBy3(number)) {
            return "Fizz";
        } else if (isDividedB5(number)) {
            return "Buzz";
        } else return "" + number;
    }

    boolean isDividedBy3(int number) {
        if (number % 3 == 0) {
            System.out.println("Fizz");
            return true;
        } else return false;
    }

    boolean isDividedB5(int number) {
        if (number % 5 == 0) {
            System.out.println("Buzz");
            return true;
        } else return false;
    }
}
