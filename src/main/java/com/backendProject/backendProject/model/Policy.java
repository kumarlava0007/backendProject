package com.backendProject.backendProject.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Policy {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue
    private Long id;

    @GeneratedValue
    private int policyNo;
    private String assetName;
    private String premiumAmount;
    private String status;
    private String mailId;

    @ManyToOne
    @JoinColumn(name="user_id",referencedColumnName = "mailId")
    private User user;
}
