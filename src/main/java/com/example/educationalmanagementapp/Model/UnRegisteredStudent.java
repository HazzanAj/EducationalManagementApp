package com.example.educationalmanagementapp.Model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table(name="unRegisteredStudent")
public class UnRegisteredStudent implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String unRegStuFirstName;
    private String unRegStuLastName;
    private String unRegStuNationality;
    private String unRegStuGender;

    @ManyToOne
    private AllStudent allStudent;
    @ManyToMany
    private List<Course> course;
}
