package students.jegors_rutkovskis.lesson_11.level_2_3_4_5_6;

import org.junit.jupiter.api.Test;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class UniqueWordFinderTest {

    @Test
    void shouldFindUniqueWords() {
        UniqueWordFinder uniqueWordFinder = new UniqueWordFinder();
        String text = "Cat sleeping, cat playing, cat meowing";
        Set<String> expected = new LinkedHashSet<>(List.of("cat", "meowing", "playing", "sleeping"));
        assertEquals(expected, uniqueWordFinder.find(text));
    }
}