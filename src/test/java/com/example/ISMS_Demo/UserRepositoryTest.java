/*
package com.example.ISMS_Demo;

import com.example.ISMS_Demo.appuser.User;
import com.example.ISMS_Demo.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import static org.assertj.core.api.Assertions.assertThat;

@DataJdbcTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback
public class UserRepositoryTest {

    @Autowired
    private UserRepository repo;

    private TestEntityManager testEntityManager;

    @Test
    public void testCreatorUser()
    {
        User user = new User();

        user.setBp_number(121);
        user.setPassword("1169128xyz");
        user.setFullName("Saiful Islam");
        user.setMobileNumber("01887449409");
        user.setDesignationId(5);
        user.setRoleId(3);
        user.setDivisionId(3);
        user.setTeamId(23);
        user.setProfile_image_loc("fdafbdfb");
        user.setActive(true);

        User savedUser = repo.save(user);

        User exitUser = testEntityManager.find(User.class, savedUser.getId());

        assertThat(exitUser.getBp_number()).isEqualTo(user.getBp_number());
    }

}
*/
