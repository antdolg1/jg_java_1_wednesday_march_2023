package students.edmund_zukovskis.lesson_10.level_3.task_6;

class FunctionalInterfaceDemo implements FunctionalInterface {

    public static void main(String[] args) {
        StringToNumberConverter converter = Integer::parseInt;
        int convertedNumber = converter.convert("123");
        System.out.println(convertedNumber);
    }

    /*
    Functional interfaces are needed to use lambda expressions,
    which allow you to concisely describe the functionality
    that should be performed when an interface method is called.
    This simplifies the writing of code and increases its readability.
    Examples of using functional interfaces in Java are methods
    for sorting and filtering collections or handling events.
     */
}

