package students.edmund_zukovskis.lesson_4.level_7.task_22;

class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();

        fizzBuzzTest.shouldReturnFizz();
        fizzBuzzTest.shouldReturnBuzz();
        fizzBuzzTest.shouldReturnFizzBuzz();
        fizzBuzzTest.shouldReturnNumber();
    }
    public void shouldReturnFizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        checkResults(fizzBuzz.detect(3).equals("Fizz"), "Test Fizz");
    }
    public void shouldReturnBuzz(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        checkResults(fizzBuzz.detect(5).equals("Buzz"), "Test Buzz");
    }
    public void shouldReturnFizzBuzz(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        checkResults(fizzBuzz.detect(15).equals("FizzBuzz"), "Test FizzBuzz");
    }
    public void shouldReturnNumber(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        checkResults(fizzBuzz.detect(4).equals("4"), "Test NotFizzBuzz");
    }

    private void checkResults(boolean condition, String FizzBuzz) {
        if (condition) {
            System.out.println(FizzBuzz + " = OK");
        } else {
            System.out.println(FizzBuzz + " = FAIL");
        }
    }
}
