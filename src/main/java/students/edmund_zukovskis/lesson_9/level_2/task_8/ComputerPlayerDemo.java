package students.edmund_zukovskis.lesson_9.level_2.task_8;

class ComputerPlayerDemo {
    public static void main(String[] args) {
        ComputerPlayer computerPlayer = new ComputerPlayer(1, "Pikachu");
        System.out.println(computerPlayer.getPlayerNumber());
        System.out.println("Computer player name is: " + computerPlayer.name);
    }
}
