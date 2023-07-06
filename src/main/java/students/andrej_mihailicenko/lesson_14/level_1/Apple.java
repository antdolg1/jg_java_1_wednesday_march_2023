package students.andrej_mihailicenko.lesson_14.level_1;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode
class Apple {

    private String color;
    private int weight;

    public Apple(String color, int weight) {
        this.color = color;
        this.weight = weight;
    }


    @Override
    public String toString() {
        return color + " " + weight;
    }


}
