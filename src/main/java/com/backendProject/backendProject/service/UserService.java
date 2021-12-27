package com.backendProject.backendProject.service;

import com.backendProject.backendProject.error.BadCredential;
import com.backendProject.backendProject.error.UserNotFound;
import com.backendProject.backendProject.model.User;

import java.util.List;

public interface UserService {

   public User saveUser(User adduser);

//   String login(User credential);

   String login(String mailId, String password) throws UserNotFound, BadCredential;
}
