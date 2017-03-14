package com.bostongene.secure.service;

import com.bostongene.secure.entity.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {


    @Override
    public User getUser(String login) {
        ////TODO
        //User user= database.FindUser(login);
        //return user;
        User user = new User();

        user.setLogin(login);

        String password = "1234";
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodedPassword = passwordEncoder.encode(password);

        //user.setPassword(encodedPassword);
        // That's '1234' in SHA1 code
        user.setPassword("7110eda4d09e062aa5e4a390b0a572ac0d2c0220");
        user.setBirthDate("11.11.1990");
        user.setFirstName("John");
        user.setLastName("Doe");

        return user;
    }

    //TODO
    private UsersDatabaseImpl database = new UsersDatabaseImpl();

    public void addUser(String login, String password) {
        database.AddUser(login, password);
    }


}
