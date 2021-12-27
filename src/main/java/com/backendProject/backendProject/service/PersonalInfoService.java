package com.backendProject.backendProject.service;

import com.backendProject.backendProject.model.PersonalInfo;
import com.backendProject.backendProject.repository.PersonalInfoRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonalInfoService {

    @Autowired
    private PersonalInfoRepo personalInfoRepo;

    public void save(PersonalInfo personalInfo) {
        personalInfoRepo.save(personalInfo);
    }


}
