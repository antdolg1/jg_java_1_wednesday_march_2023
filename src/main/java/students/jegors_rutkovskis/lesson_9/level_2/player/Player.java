package students.jegors_rutkovskis.lesson_9.level_2.player;

class Player {
    private String name;

    Player(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Player [" +
                "name = '" + name + '\'' +
                "]";
    }
}
