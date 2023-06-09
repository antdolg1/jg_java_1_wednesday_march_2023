package students.jegors_rutkovskis.lesson_10.level_3.functional_interface;

class Main {
    public static void main(String[] args) {

        Calculator sum = (a, b) -> a + b;
        Calculator subtract = (a, b) -> a - b;
        Calculator divide = (a, b) -> a / b;
        Calculator multiply = (a, b) -> a * b;

        System.out.println("10 + 10 = " + sum.calculate(10, 10));
        System.out.println("10 - 10 = " + subtract.calculate(10, 10));
        System.out.println("10 * 10 = " + multiply.calculate(10, 10));
        System.out.println("10 / 10 = " + divide.calculate(10, 10));

        int[] numbers = {1, 2, 3, 4, 5};
        printOddNumbers(numbers, i -> i % 2 != 0);
    }
    static void printOddNumbers(int[] values, CheckOdd checkOdd) {
        System.out.print("Odd numbers: ");
        for (int i : values) {
            if (checkOdd.isOdd(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
