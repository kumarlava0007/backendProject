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
public class Insurance implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    private String typesOfInsurance;
    private String protectionOption;
    private String causeOfRisks;
    private String mailId;
    @ManyToOne
    @JoinColumn(name="user_id",referencedColumnName = "mailId")
    private User user;
}
