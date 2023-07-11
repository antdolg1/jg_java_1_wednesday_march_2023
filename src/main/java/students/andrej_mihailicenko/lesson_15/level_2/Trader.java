package students.andrej_mihailicenko.lesson_15.level_2;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString
@Setter
class Trader {

    private String fullName;
    private String city;

    public Trader(String fullName, String city) {
        this.city = city;
        this.fullName = fullName;
    }

}