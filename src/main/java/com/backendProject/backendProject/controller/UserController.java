package com.backendProject.backendProject.controller;

import com.backendProject.backendProject.error.BadCredential;
import com.backendProject.backendProject.error.UserNotFound;
import com.backendProject.backendProject.model.User;
import com.backendProject.backendProject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/hello")
    public String hello(){
        return "server started";
    }
    @PostMapping("/register")
    public User user(@RequestBody User adduser){
        System.out.println(adduser.getFirstName());
        return userService.saveUser(adduser);
    }
    @PostMapping("/login")
    public String login(@RequestBody User credential) throws UserNotFound, BadCredential {
        return userService.login(credential.getMailId(),credential.getPassword());
    }
}
