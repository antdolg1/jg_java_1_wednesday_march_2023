package students.andrej_mihailicenko.lesson_9.level_1;

class DefaultConstructorV3Demo {
    public static void main(String[] args) {
        DefaultConstructorV3 defaultConstructorV3 = new DefaultConstructorV3();
        System.out.println("Default for int " + defaultConstructorV3.getAge());
        System.out.println("Default for String " + defaultConstructorV3.getFullName());
        System.out.println("Default for boolean " + defaultConstructorV3.getMale());
        System.out.println("Default for Boolean " + defaultConstructorV3.getFemale());
    }
}
