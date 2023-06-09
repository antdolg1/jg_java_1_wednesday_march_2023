package students.jegors_rutkovskis.lesson_10.level_3.task_9;

import java.util.Optional;

class JavaUtilOptional {
    /**
     ***
     Optional применяется для работы с возможно отсутствующими значениями (null).
     Он позволяет безопасно и удобно работать с null значениями
     и уменьшает количество ошибок, связанных с работой со значениями,
     которые могут отсутствовать.
     ***
     У объектов класса java.util.Optional может быть два состояния:
     - Содержит значение.
     - Не содержит значение.
     *
     Optional<String> optionalValue1 = Optional.of("value"); // Optional, содержащий значение "value"
     Optional<String> optionalValue2 = Optional.ofNullable(null); // Пустой Optional
     Optional<String> optionalValue3 = Optional.empty(); // Пустой Optional

     Optional.of(value) - создает экземпляр Optional, содержащий заданное значение.
     Optional.ofNullable(value) - создает экземпляр Optional, содержащий заданное значение,
     если оно не равно null, или пустой Optional, если значение равно null.
     Optional.empty() - создает пустой экземпляр Optional.
     ***
     Состояние экземпляра класса java.util.Optional
     можно проверить с помощью метода isPresent().
     Этот метод возвращает true, если экземпляр содержит значение,
     и false, если экземпляр пустой.
     */
        public static void main(String[] args) {
            Optional<String> optionalValue = Optional.ofNullable(null); //.ofNullable("value") - true
            if (optionalValue.isPresent()) {
                System.out.println("Значение есть: " + optionalValue.get());
            } else {
                System.out.println("Значение отсутствует");
            }

/**
 * Чтобы получить объект, который находится
 * внутри экземпляра класса java.util.Optional,
 * можно использовать метод get().
 * Этот метод возвращает значение, если оно присутствует в экземпляре,
 * и выбрасывает исключение NoSuchElementException, если экземпляр пустой.
 */
            Optional<String> optionalValue2 = Optional.of("value");
            if (optionalValue2.isPresent()) {
                String value = optionalValue2.get();
                System.out.println("Значение: " + value);
            } else {
                System.out.println("Значение отсутствует");
            }

        }
}
