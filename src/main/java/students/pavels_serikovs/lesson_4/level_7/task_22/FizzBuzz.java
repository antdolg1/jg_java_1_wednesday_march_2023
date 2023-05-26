package students.pavels_serikovs.lesson_4.level_7.task_22;

class FizzBuzz {
    public String detect(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return ("FizzBuzz");
        }
        if (number % 5 == 0) {
            return ("Buzz");
        }
        if (number % 3 == 0) {
            return ("Fizz");
        } else {
            return ("" + number);
        }
    }
}
