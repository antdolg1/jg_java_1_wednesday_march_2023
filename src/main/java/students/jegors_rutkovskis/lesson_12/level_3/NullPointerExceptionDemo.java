package students.jegors_rutkovskis.lesson_12.level_3;

class NullPointerExceptionDemo {
    public static void main(String[] args) {
        String str = null;
        int length = str.length(); // Здесь происходит NPE, т.к. мы обращаемся к null
        System.out.println(length);
    }
}
