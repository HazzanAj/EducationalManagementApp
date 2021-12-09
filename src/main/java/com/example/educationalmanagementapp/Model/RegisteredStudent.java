package com.example.educationalmanagementapp.Model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table(name="registeredStudent")
public class RegisteredStudent  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String regStuFirstName;
    private String regStuLastName;
    private String regStuNationality;
    private String regStuGender;

    @ManyToOne
    private AllStudent allStudent;
    @ManyToMany
    private List<Course> course;
}
