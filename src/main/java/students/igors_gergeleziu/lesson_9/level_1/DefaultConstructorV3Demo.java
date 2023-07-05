package students.igors_gergeleziu.lesson_9.level_1;

class DefaultConstructorV3Demo {
    public static void main(String[] args) {
        DefaultConstructorV3 constructorV3= new DefaultConstructorV3();
        System.out.println("Full name: "+constructorV3.getFullName());
        System.out.println("Age: "+constructorV3.getAge());
        System.out.println("Male: "+constructorV3.isMale());
        System.out.println("Female: "+constructorV3.getFemale());
    }
}
