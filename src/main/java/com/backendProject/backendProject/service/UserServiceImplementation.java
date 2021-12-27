package com.backendProject.backendProject.service;

import com.backendProject.backendProject.error.BadCredential;
import com.backendProject.backendProject.error.UserNotFound;
import com.backendProject.backendProject.model.User;
import com.backendProject.backendProject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImplementation implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveUser(User adduser) {
        return userRepository.save(adduser);
    }

    @Override
    public String login(String mailId, String password) throws UserNotFound, BadCredential {
        User user = userRepository.findByMailId(mailId);
        if (user == null) {
            throw new UserNotFound("user not found");
        } else {
            if (user.getPassword().equals(password)) {
                return " login seccess";
            } else {
                throw new BadCredential("invalid user");
            }
        }
    }
}
