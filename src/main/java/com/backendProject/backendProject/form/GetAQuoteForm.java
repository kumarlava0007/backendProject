package com.backendProject.backendProject.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAQuoteForm {
    private String typesOfInsurance;
    private String protectionOption;
    private String causeOfRisks;
    private String phone;
    private String fullAddress;
    private String state;
    private String city;
    private String pinCode;
    private String mailId;
    private String productType;
    private String productMake;
    private String productModel;
    private String yearOfPurchase;
    private String purchaseValue;
    private String monthlyOrYearly;
    private String premiumAmount;
}

