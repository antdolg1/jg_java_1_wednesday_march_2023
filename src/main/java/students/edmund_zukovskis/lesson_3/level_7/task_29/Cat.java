package students.edmund_zukovskis.lesson_3.level_7.task_29;

class Cat {
    public String catBreed;
    public String catColor;
    public int catWeight;
    public int catJump;

    public int catSpeed;


    Cat(String breed, String color, int jump, int weight, int speed) {
        this.catBreed = breed;
        this.catColor = color;
        this.catWeight = weight;
        this.catJump = jump;
        this.catSpeed = speed;
    }

    public int addWeight(int weightToAdd) {
        catWeight = catWeight + weightToAdd;
        return catWeight;
    }

    public int addJump(int jumpToAdd) {
        catJump = catJump + jumpToAdd;
        return catJump;
    }

    public int addSpeed(int speedToAdd) {
        catSpeed = catSpeed + speedToAdd;
        return catSpeed;
    }
}
