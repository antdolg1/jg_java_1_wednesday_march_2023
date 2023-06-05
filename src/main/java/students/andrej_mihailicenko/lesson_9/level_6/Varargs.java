package students.andrej_mihailicenko.lesson_9.level_6;

class Varargs {
    static void Numbers (int... nums){
        System.out.println("Numbers: ");
        for (int numbers : nums ) {
            System.out.println(numbers);
        }
    }

    public static void main(String[] args) {
        Numbers(1, 2, 3);
        Numbers(10, 20, 30, 40, 50);
        Numbers(100);
    }
}
