import org.junit.jupiter.api.*;
import ru.gbhw.*;

public class UserRepositoryTest {
    UserRepository userRepository;
    User admin, user1, user2;

    @BeforeEach
    void setUp(){
        userRepository = new UserRepository();
        admin = new User("admin", "1234", true);
        user1 = new User("user1", "1234", false);
        user2 = new User("user2", "1234", false);
        
        userRepository.addUser(admin);
        userRepository.addUser(user1);
        userRepository.addUser(user2);
    }

    @Test
    void testLogoutNonAdminUsers(){
        userRepository.logoutNonAdminUsers();

        Assertions.assertFalse(user1.getAuthenticate());
        Assertions.assertFalse(user2.getAuthenticate());
        Assertions.assertTrue(admin.getAuthenticate());
    }
}
