package teacher.lesson_14.lessoncode.stream_api;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Developer {

    private String name;
    private int age;
    private Level level;

}
