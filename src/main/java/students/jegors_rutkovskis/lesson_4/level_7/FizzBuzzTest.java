package students.jegors_rutkovskis.lesson_4.level_7;

class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest test = new FizzBuzzTest();
        test.shouldReturnFizz();
        test.shouldReturnBuzz();
        test.shouldReturnFizzBuzz();
        test.shouldReturnNumber();
    }

    public void shouldReturnFizz(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expected = "Fizz";
        String actual = fizzBuzz.detect(3);
        if (expected.equals(actual)){
            System.out.println("Fizz test passed");
        } else {
            System.err.println("Fizz test failed");
        }
    }
    public void shouldReturnBuzz(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expected = "Buzz";
        String actual = fizzBuzz.detect(5);
        if (expected.equals(actual)){
            System.out.println("Buzz test passed");
        } else {
            System.err.println("Buzz test failed");
        }
    }
    public void shouldReturnFizzBuzz(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expected = "FizzBuzz";
        String actual = fizzBuzz.detect(15);
        if (expected.equals(actual)){
            System.out.println("FizzBuzz test passed");
        } else {
            System.err.println("FizzBuzz test failed");
        }
    }
    public void shouldReturnNumber(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expected = "17";
        String actual = fizzBuzz.detect(17);
        if (expected.equals(actual)){
            System.out.println("Return number test passed");
        } else {
            System.err.println("Return number test failed");
        }
    }
}
