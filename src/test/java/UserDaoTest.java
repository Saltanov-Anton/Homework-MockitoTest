
import org.example.dao.UserDaoImpl;
import org.example.model.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserDaoTest {

    private final UserDaoImpl udi = new UserDaoImpl();

    @Test
    public void shouldReturnDesiredObject() {
        User user = new User("Masha");
        Assertions.assertEquals(user, udi.getUserByName(user.getName()));
    }

    @Test
    public void shouldReturnNull() {
        User user = new User("Misha");
        Assertions.assertNull(udi.getUserByName(user.getName()));
    }
}