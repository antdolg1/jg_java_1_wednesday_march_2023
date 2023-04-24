package students.edmund_zukovskis.lesson_3.level_7.task_29;

class Cat {
    public String catBreed;
    public String catColor;
    public int catWeight;
    public int catJump;

    public int catSpeed;


    Cat(String catBreed, String catColor, int catJump, int catWeight, int catSpeed) {
        this.catBreed = catBreed;
        this.catColor = catColor;
        this.catWeight = catWeight;
        this.catJump = catJump;
        this.catSpeed = catSpeed;
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
