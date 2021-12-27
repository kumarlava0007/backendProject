package com.backendProject.backendProject.controller;

import com.backendProject.backendProject.model.*;
import com.backendProject.backendProject.form.GetAQuoteForm;
import com.backendProject.backendProject.repository.InsuranceRepository;
import com.backendProject.backendProject.repository.UserRepository;
import com.backendProject.backendProject.service.InsuranceService;
import com.backendProject.backendProject.service.PersonalInfoService;
import com.backendProject.backendProject.service.ProductDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
public class GetAQuoteController {

    @Autowired
    private InsuranceService insuranceService;

    @Autowired
    private PersonalInfoService personalInfoService;

    @Autowired
    private ProductDetailsService productDetailsService;

    @Autowired
    UserRepository userRepository;

    @Autowired
    InsuranceRepository insuranceRepository;

    @PostMapping("/getAQuote")
    public GetAQuoteForm insuranceInfo(@RequestBody GetAQuoteForm getAQuoteForm){
        System.out.println("Im in Get a Quote");
        User user=userRepository.findByMailId(getAQuoteForm.getMailId());
        System.out.println(user.getMailId());

        Insurance insurance = new Insurance();
        insurance.setTypesOfInsurance(getAQuoteForm.getTypesOfInsurance());
        insurance.setProtectionOption(getAQuoteForm.getProtectionOption());
        insurance.setMailId(getAQuoteForm.getMailId());
        insurance.setUser(user);
        insurance.setCauseOfRisks(getAQuoteForm.getCauseOfRisks());
        insuranceService.save(insurance);

        PersonalInfo personalInfo = new PersonalInfo();
        personalInfo.setPhone(getAQuoteForm.getPhone());
        personalInfo.setFullAddress(getAQuoteForm.getFullAddress());
        personalInfo.setCity(getAQuoteForm.getCity());
        personalInfo.setState(getAQuoteForm.getState());
        personalInfo.setPinCode(getAQuoteForm.getPinCode());
        personalInfo.setMailId(getAQuoteForm.getMailId());
        personalInfo.setUser(user);
        personalInfoService.save(personalInfo);

        ProductDetails productDetails = new ProductDetails();
        productDetails.setProductType(getAQuoteForm.getProductType());
        productDetails.setYearOfPurchase(getAQuoteForm.getYearOfPurchase());
        productDetails.setPurchaseValue(getAQuoteForm.getPurchaseValue());
        productDetails.setProductMake(getAQuoteForm.getProductMake());
        productDetails.setProductModel(getAQuoteForm.getProductModel());
        productDetails.setMailId(getAQuoteForm.getMailId());
        productDetails.setPremiumPlan("12,0000");
        productDetails.setUser(user);
        productDetailsService.save(productDetails);
        return getAQuoteForm;
    }


}
