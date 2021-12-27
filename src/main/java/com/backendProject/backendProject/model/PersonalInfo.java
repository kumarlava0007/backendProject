package com.backendProject.backendProject.model;

import com.backendProject.backendProject.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;


@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class PersonalInfo implements Serializable {
    @Id
    @GeneratedValue
    private Long id;

    private String phone;
    private String fullAddress;
    private String state;
    private String city;
    private String pinCode;
    private String mailId;
    @OneToOne
    @JoinColumn(name="user_id",referencedColumnName = "mailId")
    private User user;
}
