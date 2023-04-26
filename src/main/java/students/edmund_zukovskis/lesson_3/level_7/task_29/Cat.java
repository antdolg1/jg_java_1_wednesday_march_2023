package students.edmund_zukovskis.lesson_3.level_7.task_29;

class Cat {
    public String catBreed;
    public String catColor;
    public int catWeight;
    public int catJump;

    public int catSpeed;


    Cat(String Breed, String Color, int Jump, int Weight, int Speed) {
        this.catBreed = Breed;
        this.catColor = Color;
        this.catWeight = Weight;
        this.catJump = Jump;
        this.catSpeed = Speed;
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
