package students.jegors_rutkovskis.lesson_10.level_3.task_8_10;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class InMemoryDatabaseTest {
    private InMemoryDatabase database;
    private Product product1, product2, product3;

    @BeforeEach
    void setUp() {
        product1 = new Product("Apple");
        product2 = new Product("Shoes");
        product3 = new Product("Smartphone");

        database = new InMemoryDatabase();
        database.save(product1);
        database.save(product2);
        database.save(product3);
    }

    @Test
    void shouldSave() {
        database = new InMemoryDatabase();
        database.save(product1);
        database.save(product2);
        database.save(product3);
        Product[] expected = {
                product1,
                product2,
                product3
        };
        assertArrayEquals(expected, database.getProducts());
    }

    @Test
    void shouldFindByTitle() {
        Optional<Product> actual = database.findByTitle("shoes");
        assertTrue(actual.isPresent());
        assertEquals(product2, actual.get());
    }

    @Test
    void shouldReturnEmpty() {
        Optional<Product> victim = database.findByTitle("samsung");
        assertTrue(victim.isEmpty());
    }
}