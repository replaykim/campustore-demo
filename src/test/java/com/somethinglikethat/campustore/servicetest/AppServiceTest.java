package com.somethinglikethat.campustore.servicetest;


import com.somethinglikethat.campustore.model.User;
import com.somethinglikethat.campustore.model.UserType;
import com.somethinglikethat.campustore.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AppServiceTest {
    @Autowired
    UserService userService;

    @Before
    public void setup(){

    }

    @Test
    public void adduser(){
        String email = "replay@gmail.com";
        String password = "asd123";
        String name = "김재현";
        User user = new User();
        user.setEmail(email);
        user.setName(name);
        user.setPassword(password);
        user.setUserType(UserType.student);

        userService.register(user);
        User getuser = userService.getUser(email);

        assertThat(getuser.getName(), is(name));
    }
}
