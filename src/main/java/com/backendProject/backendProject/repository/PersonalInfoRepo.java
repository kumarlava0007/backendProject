package com.backendProject.backendProject.repository;

import com.backendProject.backendProject.model.Insurance;
import com.backendProject.backendProject.model.PersonalInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonalInfoRepo extends JpaRepository<PersonalInfo, Integer> {
    @Override
    List<PersonalInfo> findAll();
    PersonalInfo findByMailId(String mailId);
}
