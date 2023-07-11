package students.edmund_zukovskis.lesson_12.level_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class BankApiImplTest {

    @Test
    public void testFindByUid_WithValidCredentialsAndExistingUid_ReturnsClientOptional() throws AccessDeniedException {

        BankClient client1 = new BankClient("1", "Pikachu");
        BankClient client2 = new BankClient("2", "Tommy");
        List<BankClient> clients = Arrays.asList(client1, client2);
        BankApiImpl bankApi = new BankApiImpl(clients);
        UserCredentials credentials = new UserCredentials(Arrays.asList(Role.CAN_SEARCH_CLIENTS));

        Optional<BankClient> result = bankApi.findByUid(credentials, "2");

        Assertions.assertTrue(result.isPresent());
        Assertions.assertEquals(client2, result.get());
    }

    @Test
    public void testFindByUid_WithInvalidCredentials_ThrowsAccessDeniedException() {

        BankClient client1 = new BankClient("1", "Pikachu");
        List<BankClient> clients = Arrays.asList(client1);
        BankApiImpl bankApi = new BankApiImpl(clients);
        UserCredentials credentials = new UserCredentials(Arrays.asList());

        Assertions.assertThrows(AccessDeniedException.class, () -> {
            bankApi.findByUid(credentials, "1");
        });
    }

    @Test
    public void testFindByUid_WithNonExistingUid_ReturnsEmptyOptional() throws AccessDeniedException {

        BankClient client1 = new BankClient("1", "Pikachu");
        List<BankClient> clients = Arrays.asList(client1);
        BankApiImpl bankApi = new BankApiImpl(clients);
        UserCredentials credentials = new UserCredentials(Arrays.asList(Role.CAN_SEARCH_CLIENTS));

        Optional<BankClient> result = bankApi.findByUid(credentials, "2");

        Assertions.assertFalse(result.isPresent());
    }
}
