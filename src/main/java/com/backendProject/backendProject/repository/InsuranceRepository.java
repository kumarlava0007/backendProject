package com.backendProject.backendProject.repository;

import com.backendProject.backendProject.model.Insurance;
import com.backendProject.backendProject.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface InsuranceRepository extends JpaRepository<Insurance,Integer> {
    @Override
    List<Insurance> findAll();

}
