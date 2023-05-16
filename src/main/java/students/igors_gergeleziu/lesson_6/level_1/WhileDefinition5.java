package students.igors_gergeleziu.lesson_6.level_1;

class WhileDefinition5 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 100) { //Change condition from >= to <=, to raise from 1 to 100
            System.out.println(i);
            i++;  //Change decrement to increment unary operator
        }
    }
}
