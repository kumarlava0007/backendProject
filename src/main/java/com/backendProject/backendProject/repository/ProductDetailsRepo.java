package com.backendProject.backendProject.repository;

import com.backendProject.backendProject.model.ProductDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductDetailsRepo extends JpaRepository<ProductDetails, Integer> {
}
