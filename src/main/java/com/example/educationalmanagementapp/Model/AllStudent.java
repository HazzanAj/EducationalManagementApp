package com.example.educationalmanagementapp.Model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
@Data
@Entity
@Table(name="allStudent")
public class AllStudent implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String allStudentFirstName;
    private String allStudentLastName;
    private String allStudentNationality;
    private String allStudentGender;

    @OneToMany(mappedBy = "allStudent")
    private List<RegisteredStudent> registeredStudent;

    @OneToMany(mappedBy = "allStudent")
    private List<UnRegisteredStudent> unRegisteredStudent;
}
