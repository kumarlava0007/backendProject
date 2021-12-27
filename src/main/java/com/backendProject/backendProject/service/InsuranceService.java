package com.backendProject.backendProject.service;

import com.backendProject.backendProject.model.Insurance;
import com.backendProject.backendProject.repository.InsuranceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InsuranceService {
    @Autowired
    private InsuranceRepository insuranceRepository;

    public void save(Insurance insurance){
        insuranceRepository.save(insurance);
    }

}
