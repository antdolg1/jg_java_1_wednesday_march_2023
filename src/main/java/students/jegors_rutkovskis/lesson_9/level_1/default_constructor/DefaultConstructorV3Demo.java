package students.jegors_rutkovskis.lesson_9.level_1.default_constructor;

class DefaultConstructorV3Demo {
    public static void main(String[] args) {
        DefaultConstructorV3 def = new DefaultConstructorV3();
        System.out.println("String default value: " + def.getFullName());
        System.out.println("int default value: " + def.getAge());
        System.out.println("boolean default value: " + def.isMale());
        System.out.println("Boolean default value: " + def.getFemale());
    }
}
