package students.jegors_rutkovskis.lesson_12.level_2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import students.jegors_rutkovskis.lesson_12.level_2.exceptions.AccessDeniedException;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class BankApiImplTest {
    private BankApi bankApi;
    private List<BankClient> clients;

    @BeforeEach
    void setUp() {
        clients = Arrays.asList(
                new BankClient("1", "Jegor"),
                new BankClient("2", "Georgij")
        );
        bankApi = new BankApiImpl(clients);
    }

    @Test
    void findByUidWithRights() throws AccessDeniedException {
        UserCredentials userCredentials = new UserCredentials(List.of(Role.CAN_SEARCH_CLIENTS));
        Optional<BankClient> actual = bankApi.findByUid(userCredentials, "1");

        assertTrue(actual.isPresent());
        assertEquals("1", actual.get().getUid());
    }

    @Test
    void findByUidWithoutRights_shouldThrowException() {
        UserCredentials userCredentials = new UserCredentials(List.of(Role.CAN_CREATE_CLIENTS));
        Executable actual = () -> bankApi.findByUid(userCredentials, "1");

        assertThrows(AccessDeniedException.class, actual);
    }

    @Test
    void findByUidWithRights_NotExistingUid() throws AccessDeniedException {
        UserCredentials userCredentials = new UserCredentials(List.of(Role.CAN_SEARCH_CLIENTS));
        Optional<BankClient> actual = bankApi.findByUid(userCredentials, "3");

        assertTrue(actual.isEmpty());
    }
}