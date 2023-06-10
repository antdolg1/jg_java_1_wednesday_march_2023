package students.edmund_zukovskis.lesson_10.level_3.task_9;

class AnswersToQuestions {

    /*
   Для чего применяются объекты этого класса?
   Optional objects are used to more safely handle null values in Java code.
   They are used when the value may not be present and we don't want our code
   to throw a NullPointerException. Instead, we can check if the value is
   inside an Optional and perform the necessary actions depending on that.
     */
    /*
    Какие два состояния могут быть у объектов этого класса?
    Optional objects can have two states: empty (empty) and non-empty (non-empty).
    An empty Optional does not contain any value, but a non-empty Optional contains a single value.
     */

    /*
    Как создаются экземпляры данного класса?
    Instances of this class are created using the static methods of the Optional class,
    such as Optional.of() and Optional.empty(). The Optional.of() method takes a value
    and returns a non-empty Optional containing that value. The Optional.empty() method
    returns an empty Optional.
     */
    /*
    Как можно проверить в каком состоянии находится экземпляр данного класса?
    You can use the isPresent() and isEmpty() methods to check the state of an Optional object.
     */
    /*
    Как можно получить объект, который находится внутри Optional?
    To get an object that is inside an Optional, you can use the get() method.
    However, before using the get() method, you must check that the Optional
    contains a value using the isPresent() method.
     */
}
