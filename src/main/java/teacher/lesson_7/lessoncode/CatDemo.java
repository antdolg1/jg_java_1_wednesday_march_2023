package teacher.lesson_7.lessoncode;

public class CatDemo {

    public static void main(String[] args) {

        Cat cat = new Cat(1, "Boris");

        int catAge = cat.getAge();
        String catNickname = cat.getNickname();

        System.out.println("Cat nickname is " + catNickname + " and his age is " + catAge);

        cat.setNickname("Murzik");
        cat.setAge(-1);

        System.out.println("Cat nickname is " + cat.getNickname() + " and his age is " + cat.getAge());

    }

}
