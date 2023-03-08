import org.example.dao.UserDao;
import org.example.model.User;
import org.example.service.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.*;


import static org.mockito.Mockito.*;

public class UserServiceTest {

    @Mock
    private UserDao userDaoMock;

    @InjectMocks
    private UserServiceImpl out;

    public UserServiceTest() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void shouldReturnTrue() {
        User user = new User("Masha");
        when(userDaoMock.getUserByName(user.getName())).thenReturn(user);

        assertTrue(out.checkUserExist(user));
    }

    @Test
    public void shouldReturnFalse() {
        User user = new User("Misha");
        when(userDaoMock.getUserByName(user.getName())).thenReturn(user);

        assertFalse(out.checkUserExist(user));
    }
}