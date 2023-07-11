package students.jegors_rutkovskis.lesson_12.level_2;

import students.jegors_rutkovskis.lesson_12.level_2.exceptions.AccessDeniedException;

import java.util.Optional;

interface BankApi {

    Optional<BankClient> findByUid(UserCredentials credentials, String uid)
            throws AccessDeniedException;

}
