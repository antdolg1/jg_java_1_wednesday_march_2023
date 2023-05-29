package students.edmund_zukovskis.lesson_9.level_2.task_8;

class ComputerPlayer extends Player {

    private int playerNumber;

    ComputerPlayer(int playerNumber, String name) {
        super(name);
        this.playerNumber = playerNumber;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }
}
