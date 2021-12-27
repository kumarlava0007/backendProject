package com.backendProject.backendProject.service;

import com.backendProject.backendProject.model.ProductDetails;
import com.backendProject.backendProject.repository.ProductDetailsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductDetailsService {

    @Autowired
    private ProductDetailsRepo productDetailsRepo;

    public void save(ProductDetails productDetails){
        productDetailsRepo.save(productDetails);
    }
}
