package com.backendProject.backendProject.repository;

import com.backendProject.backendProject.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

    public User findByMailId(String mailId);
}
