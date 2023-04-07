package students.jegors_rutkovskis.lesson_3.level_2;
/**
 * Heap - область памяти для хранения объектов в Java.
 *
 * String pool - пул строк, где хранятся уникальные значения строк в Java.
 */
class StringCompare {
    public static void main(String[] args) {
        String name1 = "Alex"; // сохраняем строку в String pool
        String name2 = "Alex"; // обращаемся к уже существующей строке в String pool
        String name3 = new String("Alex"); // создаем новый объект в Heap

        boolean compareNamesPool = name1 == name2; // сравниваем ссылки на объекты, вернет true
        /**
         * name1 и name2 это один и тот же объект,
         * который хранится в области памяти "String pool".
         * для лучшей производительности Java не создаёт новый
         * объект name2, а просто присваивает ссылку на уже
         * существующий объект name1 из пула строк.
         * Поэтому сравнение name1 и name2 с помощью
         * оператора "==" вернет true.
         */
        System.out.println(compareNamesPool);

        boolean compareNamesHeap = name1 == name3; // сравниваем ссылки на объекты, вернет false
        /**
         * В этом примере мы сравниваем два объекта
         * из разных областей памяти:
         * name1 - String pool
         * name3 - Heap (куча)
         * При явном создании нового объекта new String("Alex"),
         * Java сохраняет его в области памяти Heap.
         * Так как объект name3 создан через оператор new,
         * Java создает новый объект в heap, даже если значение
         * строки уже существует в пуле строк.
         * Поэтому сравнение name1 и name3 с помощью оператора "=="
         * вернет false, потому что это разные объекты,
         * хранящиеся в разных областях памяти.
         */
        System.out.println(compareNamesHeap);

        /**
         * Для корректного сравнения строк используем
         * метод equals(), который сравнивает значения строк,
         * хранящихся в объектах.
         */
        boolean compareNamesHeap2 = name1.equals(name3); // сравниваем значения строк, вернет true
        System.out.println(compareNamesHeap2);
    }
}
