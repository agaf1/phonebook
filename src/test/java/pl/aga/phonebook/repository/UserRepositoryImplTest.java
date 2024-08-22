package pl.aga.phonebook.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.util.StringUtils;
import pl.aga.phonebook.service.User;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@Sql(statements ="truncate users")
class UserRepositoryImplTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void should_save_new_User(){
        //given
        User user = new User(null,"Name1",111222333);

        //when
        userRepository.save(user);

        //then
        List<User> users = userRepository.getAll();
        assertThat(users.size()).isEqualTo(1);
        assertThat(users.get(0).id()).isNotNull();
    }

}