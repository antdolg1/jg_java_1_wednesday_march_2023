package students.jegors_rutkovskis.lesson_12.level_2;

import students.jegors_rutkovskis.lesson_12.level_2.exceptions.AccessDeniedException;

import java.util.List;
class BankApiImplTest {
    public static void main(String[] args) {
        BankApiImplTest test = new BankApiImplTest();
        test.shouldReturnException();
    }
    void shouldReturnException() {
        BankApiImpl bankApi = new BankApiImpl(List.of(
                new BankClient("1", "Alex"),
                new BankClient("2", "John")
        ));
        UserCredentials userCredentials = new UserCredentials(List.of(Role.CAN_CREATE_CLIENTS));
        try {
            bankApi.findByUid(userCredentials, "1");
            System.out.println("TEST FAIL");
        } catch (AccessDeniedException e) {
            System.out.println(e.getMessage());
            System.out.println("TEST OK");
        }
    }
}
