package students.edmund_zukovskis.lesson_9.level_1.task_3;

public class DefaultConstructorV3Demo {
    public static void main(String[] args) {
        DefaultConstructorV3 defaultConstructorV3 = new DefaultConstructorV3("Pikachu", 15, true, false);
        System.out.println(defaultConstructorV3.getFullName());
        System.out.println(defaultConstructorV3.getAge());
        System.out.println(defaultConstructorV3.isMale());
        System.out.println(defaultConstructorV3.isFemale());
    }
}
