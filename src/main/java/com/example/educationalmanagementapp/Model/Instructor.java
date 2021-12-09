package com.example.educationalmanagementapp.Model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table(name="instructor")
public class Instructor  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String instructorName;
    private String instructorCourse;
    private String instructorAvailability;
    private String instructorHourlyRate;

    @ManyToMany
    private List<Course> course;
}
