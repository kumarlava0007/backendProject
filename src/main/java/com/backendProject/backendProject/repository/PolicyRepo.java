package com.backendProject.backendProject.repository;

import com.backendProject.backendProject.model.Policy;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PolicyRepo extends JpaRepository<Policy, Integer> {

    Policy findByMailId(String mailId);
}
