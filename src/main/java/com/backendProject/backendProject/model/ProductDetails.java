package com.backendProject.backendProject.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class ProductDetails implements Serializable {
    @Id
    @GeneratedValue
    private Long id;

    private String productType;
    private String yearOfPurchase;
    private String purchaseValue;
    private String productMake;
    private String productModel;
    private String premiumPlan;
    private String mailId;
    @ManyToOne
    @JoinColumn(name="user_id",referencedColumnName = "mailId")
    private User user;
}