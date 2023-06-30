package students.andrej_mihailicenko.lesson_12.level_2;

import java.nio.file.AccessDeniedException;
import java.util.Optional;

interface BankApi {

    Optional<BankClient> findByUid(UserCredentials credentials, String uid) throws AccessDeniedException;

}
