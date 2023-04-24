package students.edmund_zukovskis.lesson_3.level_7.task_29;

class CatDemo {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Meincun", "Black", 4, 6, 7);

        String catBreed = cat1.catBreed;
        String catColor = cat1.catColor;
        int catJump = cat1.catJump;
        int catWeight = cat1.catWeight;
        int catSpeed = cat1.catSpeed;


        System.out.println("Cat breed is: " + cat1.catBreed);
        System.out.println("Cat color is: " + cat1.catColor);
        System.out.println("Cat max jump is: " + cat1.catJump);
        System.out.println("Cat current weight is: " + cat1.catWeight);
        System.out.println("Cat current speed is: " + cat1.catSpeed);

        cat1.addJump(1);
        System.out.println(catBreed + " cat new max jump is: " + cat1.catJump);

        cat1.addWeight(3);
        System.out.println(catBreed + " cat new weight is: " + cat1.catWeight);

        cat1.addSpeed(5);
        System.out.println(catBreed + " cat new speed is: " + cat1.catSpeed);
    }
}
