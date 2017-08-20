package com.somethinglikethat.campustore.service;

import com.somethinglikethat.campustore.model.User;
import com.somethinglikethat.campustore.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class UserService {
    @Autowired
    private UserRepository userRepository;

    Logger logger = LoggerFactory.getLogger(getClass().getName());

    public User getUser(String email) {
        return userRepository.findUserByEmail(email);
    }

    public boolean register(User user) {
        if(userRepository.findUserByEmail(user.getEmail()) != null) {
            logger.info("이메일 중복");
            return false;
        }
        user.setPassword(user.getPassword());
        logger.info("save");
        userRepository.save(user);

        return true;
    }
}
