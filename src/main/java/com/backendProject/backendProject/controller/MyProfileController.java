package com.backendProject.backendProject.controller;

import com.backendProject.backendProject.model.Insurance;
import com.backendProject.backendProject.model.PersonalInfo;
import com.backendProject.backendProject.repository.InsuranceRepository;
import com.backendProject.backendProject.repository.PersonalInfoRepo;
import com.backendProject.backendProject.service.InsuranceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class MyProfileController {

    @Autowired
    private PersonalInfoRepo personalInfoRepo;


    @GetMapping("/allprofile")
    public List<PersonalInfo> allprofile(){
        return personalInfoRepo.findAll();
    }

    @GetMapping("/myprofile/{userId}")
    public PersonalInfo myProfile(@PathVariable("userId") String userId){
        return personalInfoRepo.findByMailId(userId);
    }
}
