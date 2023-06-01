package students.jegors_rutkovskis.lesson_9.level_6;

class Varargs {
    public static void main(String[] args) {
        printNumbers(1, 2, 3, 4, 5);
    }

    static void printNumbers(int... numbers) { // varargs похож на массив, только без указания конкретной длинны.
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
